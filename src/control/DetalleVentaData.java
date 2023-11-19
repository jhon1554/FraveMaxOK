package control;

import Interfaces.SqlCrud;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DetalleVentaData implements SqlCrud{
    private final Connection conexion;

    public DetalleVentaData() {
        conexion = Conexion.getConexion();
    }
    
    
    @Override
    public void insertar(Object object) {
        DetalleVenta detalleCompra = (DetalleVenta) object;
        String query = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto)VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioVenta());
            ps.setInt(3, detalleCompra.getVenta().getIdVenta());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
                detalleCompra.setIdDetalleVenta(rs.getInt(1));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error en la bd" + e);
        }
    }

    @Override
    public void borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object actualizar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object obtenerUno(int id) {
        DetalleVenta detalleVenta = null;
        String query = "SELECT * FROM detalleventa WHERE idDetalleVenta = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                DetalleVenta dc = new DetalleVenta();
                dc.setIdDetalleVenta(id);
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setVenta(new Venta());
                dc.setPrecioVenta(resultado.getDouble("precioVenta"));
                dc.getVenta().setIdVenta(resultado.getInt("idVenta"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                detalleVenta = dc;
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd"+ e);
        }
        return detalleVenta;
    }

    @Override
    public List<Object> obtenerTodo() {
        ArrayList<Object> lista = new ArrayList<>();
        String query = "SELECT * FROM detalleventa";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                DetalleVenta dc = new DetalleVenta();
                dc.setIdDetalleVenta(resultado.getInt("idDetalleVenta"));
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setPrecioVenta(resultado.getDouble("precioVenta"));
                dc.setVenta(new Venta());
                dc.getVenta().setIdVenta(resultado.getInt("idVenta"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                lista.add(dc);
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd" + e);
        }
        return lista;
    }

    public ArrayList<DetalleVenta> obtenerProductosVenta(int id){
        ArrayList<DetalleVenta> ListaProductos = new ArrayList();

String query="SELECT detalleVenta. * FROM detalleVenta JOIN venta ON detalleVenta.idVenta = venta.idVenta WHERE venta.idVenta = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
               DetalleVenta dv = new DetalleVenta();
               
                dv.setIdDetalleVenta(resultado.getInt("idDetalleVenta"));
                dv.setCantidad(resultado.getInt("cantidad"));
                dv.setPrecioVenta(resultado.getDouble("precioVenta"));
                Venta v = new Venta();v.setIdVenta(resultado.getInt("idVenta"));
                dv.setVenta(v);
                Producto p = new Producto();p.setIdProducto(resultado.getInt("idProducto"));
                dv.setProducto(p);
                ListaProductos.add(dv);
                
            }
            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error en la bd de detalle venta" + e.getMessage() );
        }

        return ListaProductos;
        
    }

    public ArrayList<Producto> buscarProductoNombre(String text) {
       
        
         ArrayList<Producto>listaProductos=new ArrayList();
        try {
           PreparedStatement ps = conexion.prepareStatement("SELECT * FROM producto WHERE descripcion LIKE ?");
           ps.setString(1, text + "%");
            
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               Producto p = new Producto();
               
               p.setIdProducto(rs.getInt("idProducto"));
               p.setDescripcion(rs.getString("descripcion"));
               p.setPrecioActual(rs.getDouble("precioActual"));
               p.setStock(rs.getInt("stock"));
              
              listaProductos.add(p);
               
           }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error en conectar a base de datos", ex.getMessage());
        }
        
        
        return listaProductos;
       
    }
  
   
    
}
