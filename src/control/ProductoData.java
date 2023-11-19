package control;

import Interfaces.SqlCrud;
import entidades.Cliente;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoData implements SqlCrud{
    
    private final String INSERT = "INSERT INTO producto (descripcion,precioActual,stock,estado)VALUES(?,?,?,1)";
    private final String UPDATE = "UPDATE producto SET descripcion=?,precioActual=?,stock=? WHERE idProducto=?";
    private final String DELETE = "DELETE FROM producto WHERE idProducto = ? ";
    private final String OBTENER_UNO = "SELECT * FROM producto WHERE idProducto = ?";
    private final String OBTENER_TODO = "SELECT * FROM producto ";
    
    private final Connection con ;
    
    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    
    public ArrayList<Producto> buscarProductoDesc(String Pclave){
        
         ArrayList<Producto>Productos=new ArrayList();
        try {
           PreparedStatement ps = con.prepareStatement("SELECT * FROM producto WHERE descripcion LIKE ?");
           ps.setString(1, Pclave + "%");
            
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               Producto p = new Producto(); 
               p.setIdProducto(rs.getInt("idProducto"));
               p.setDescripcion(rs.getString("descripcion"));
               p.setPrecioActual(rs.getDouble("precioActual"));
               p.setStock(rs.getInt("stock"));
               p.setEstado(rs.getBoolean("estado"));
               Productos.add(p);
               
           }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error en conectar a base de datos", ex.getMessage());
        }
        
        
        return Productos;
        
    }
    
    
    
    
    @Override
    public void insertar(Object object) {
        
        Producto producto = (Producto) object;  
        
        try {
            PreparedStatement st = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
           
            st.setString(1, producto.getDescripcion());
            st.setDouble(2,producto.getPrecioActual());
            st.setInt(3, 0);
            st.executeUpdate();
            
            ResultSet rs = st.getGeneratedKeys();
            
            if(rs.next()){
               producto.setIdProducto(rs.getInt(1));
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos", ex.getMessage());
        }
    }

    @Override
    public void borrar(int id) {
        
        try {
            PreparedStatement ps = con.prepareCall(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();                     
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectar con base de datos", ex.getMessage());
        }
        
                    
    }

    @Override
    public Object actualizar(Object object) {
        
        Producto producto = (Producto) object;
        Producto productoActualizado = null;
        try {
           
            PreparedStatement ps = con.prepareStatement(UPDATE);
            
            ps.setString(1, producto.getDescripcion());
            ps.setDouble(2,producto.getPrecioActual());
            ps.setInt(3, producto.getStock());
            ps.setInt(4,producto.getIdProducto());
            productoActualizado=producto;
            ps.executeUpdate();
            ps.close();
                     
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        
        return productoActualizado;
                          

    }

    @Override
    public Object obtenerUno(int id) {
    Producto producto = null;
    try {
        PreparedStatement ps = con.prepareStatement(OBTENER_UNO);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            producto = new Producto();
            producto.setIdProducto(id);
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos:", ex.getMessage());
    }

    return producto;
}

    @Override
    public List<Object> obtenerTodo() {
    ArrayList<Object> listaProductos = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(OBTENER_TODO);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
            listaProductos.add(producto);
        }
        ps.close();
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
    }

    return listaProductos;
}

    public void bajaLogicaProducto(int idProducto) {
        try{    
            String bajaLogica = "UPDATE producto SET estado = false WHERE idProducto = ? ";
            PreparedStatement baja = con.prepareStatement(bajaLogica);
            baja.setInt(1, idProducto);
            int resultado = baja.executeUpdate();
            baja.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la bd " + e);
        }
    }

    public void altaLogicaProducto(int idProducto){
        try{    
            String altalogica = "UPDATE producto SET estado = true WHERE idProducto = ? ";
            PreparedStatement alta = con.prepareStatement(altalogica);
            alta.setInt(1, idProducto);
            int resultado = alta.executeUpdate();
            alta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la bd " + e);
        }
    }
    
    public ArrayList<Producto> buscarPorStock(int num){
        
        String query = "SELECT * FROM producto WHERE stock <= ? AND estado=true ";
        ArrayList<Producto> productos = new ArrayList();
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, num);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
                
                productos.add(p);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
        
    }
    
   
}