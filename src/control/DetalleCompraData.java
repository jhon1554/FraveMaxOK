package control;

import Interfaces.SqlCrud;
import entidades.Compra;
import java.util.List;
import entidades.DetalleCompra;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.*;
import java.util.ArrayList;


public class DetalleCompraData implements SqlCrud{
    private final Connection conexion;

    public DetalleCompraData() {
        conexion = Conexion.getConexion();
    }

    @Override
    public void insertar(Object object) {
        DetalleCompra detalleCompra = (DetalleCompra) object;
        String query = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto)VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioCosto());
            ps.setInt(3, detalleCompra.getCompra().getIdCompra());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
                detalleCompra.setIdDetalleVenta(rs.getInt(1));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error en la bd");
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
        DetalleCompra detalleCompra = null;
        String query = "SELECT * FROM detallecompra WHERE idDetalle = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                DetalleCompra dc = new DetalleCompra();
                dc.setIdDetalleVenta(id);
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setPrecioCosto(resultado.getDouble("precioCosto"));
                dc.setCompra(new Compra());
                dc.getCompra().setIdCompra(resultado.getInt("idCompra"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                detalleCompra = dc;
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd");
        }
        return detalleCompra;
    }

    @Override
    public List<Object> obtenerTodo() {
        ArrayList<Object> lista = new ArrayList<>();
        String query = "SELECT * FROM detallecompra";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                DetalleCompra dc = new DetalleCompra();
                dc.setIdDetalleVenta(resultado.getInt("idDetalle"));
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setPrecioCosto(resultado.getDouble("precioCosto"));
                dc.setCompra(new Compra());
                dc.getCompra().setIdCompra(resultado.getInt("idCompra"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                lista.add(dc);
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd");
        }
        return lista;
    }

    public ArrayList<DetalleCompra> obtenerProductosCompra(int id){
        ArrayList<DetalleCompra> ListaProductos = new ArrayList();

       String query="SELECT detalleCompra.* FROM detalleCompra JOIN Compra ON detalleCompra.idCompra = Compra.idCompra WHERE Compra.idCompra = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
               DetalleCompra dc = new DetalleCompra();
               
                dc.setIdDetalleVenta(resultado.getInt("idDetalle"));
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setPrecioCosto(resultado.getDouble("precioCosto"));
                Compra c = new Compra();c.setIdCompra(resultado.getInt("idCompra"));
                dc.setCompra(c);
                Producto p = new Producto();p.setIdProducto(resultado.getInt("idProducto"));
                dc.setProducto(p);
                ListaProductos.add(dc);
                
            }
            
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error en la bd de detalle venta" + e.getMessage() );
        }

        return ListaProductos;
        
    }

    
}
