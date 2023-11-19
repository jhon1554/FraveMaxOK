package control;

import Interfaces.SqlCrud;
import entidades.Cliente;
import entidades.Compra;
import entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CompraData implements SqlCrud{
    
    private final String INSERT = "INSERT INTO compra (idCompra,idProveedor,fecha)VALUES (?,?,?);";
    private final String UPDATE = "UPDATE compra SET nombre=?,apellido=?,dni=?,direccion=?,telefono=? WHERE idCompra =?";
    private final String DELETE = "DELETE FROM compra WHERE idCompra = ? ";
    private final String OBTENER_UNO = "SELECT * FROM compra WHERE idCompra = ?";
    private final String OBTENER_TODO = "SELECT * FROM compra";
    
    private final Connection con ;

    public CompraData() {
        con = Conexion.getConexion();
    }
    
    @Override
    public void insertar(Object object) {
        
        Compra compra = (Compra) object;     
        try {
            PreparedStatement st = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, compra.getIdCompra());
            st.setInt(2, compra.getProveedor().getIdProveedor());
            st.setDate(3,Date.valueOf(compra.getFecha()));
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            
            if(rs.next()){
               compra.setIdCompra(rs.getInt(1));
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos", ex.getMessage());
        }
    }

    @Override
    public void borrar(int id) {
        try {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectar con base de datos", ex.getMessage());
        }
    }

    @Override
    public Object actualizar(Object object) {
        
        Compra compra = (Compra) object;     
        
        Compra compraActualizada = null;
 
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setInt(1, compra.getIdCompra());
            ps.setInt(2, compra.getProveedor().getIdProveedor());
            ps.setDate(3, Date.valueOf(compra.getFecha()));
            compraActualizada=compra;
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectar con base de datos", ex.getMessage());
        }
        
        return compraActualizada;
    }

    @Override
    public Object obtenerUno(int id) {
        
      Compra compra = null;
        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_UNO);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
           if(rs.next()){
               Compra c = new Compra();
               c.setIdCompra(id);
               Proveedor p = new Proveedor();
               p.setIdProveedor(rs.getInt("idProveedor"));
               c.setProveedor(p);
               c.setFecha(rs.getDate("fecha").toLocalDate());
               compra=c;
           }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos:", ex.getMessage());
        }
        return compra;   
    }

    @Override
    public List<Object> obtenerTodo() {
        
          ArrayList<Object> listaCompras = new ArrayList<>();
       
        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_TODO);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra c = new Compra();
                c.setIdCompra(rs.getInt("idCompra"));
                c.setProveedor(new Proveedor());
                c.getProveedor().setIdProveedor(rs.getInt("idProveedor"));
                c.setFecha(rs.getDate("fecha").toLocalDate());
                listaCompras.add(c);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar con base de datos " + ex.getMessage());
        }
        return listaCompras;
        
    }

   
}
