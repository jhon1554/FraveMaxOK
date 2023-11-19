package control;

import Interfaces.SqlCrud;
import entidades.Cliente;
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



public class ClienteData implements SqlCrud {

    private final String INSERT = "INSERT INTO cliente (nombre,apellido,dni,domicilio,telefono,estado)VALUES(?,?,?,?,?,1);";
    private final String UPDATE = "UPDATE cliente SET nombre=?,apellido=?,dni=?,domicilio=?,telefono=? WHERE idCliente =?";
    private final String DELETE = "DELETE FROM cliente WHERE idCliente = ? ";
    private final String OBTENER_UNO = "SELECT * FROM cliente WHERE idCliente = ?";
    private final String OBTENER_TODO = "SELECT * FROM cliente ";
   
    private final Connection con ;

    public ClienteData() {
        con = Conexion.getConexion();
    }
 
    public ArrayList<Cliente> buscarClienteApellido(String Pclave){
        
         ArrayList<Cliente>clientes=new ArrayList();
        try {
           PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente WHERE apellido LIKE ?");
           ps.setString(1, Pclave + "%");
            
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               
               Cliente cliente = new Cliente(); 
               cliente.setIdCliente(rs.getInt("idCliente"));
               cliente.setNombre(rs.getString("nombre"));
               cliente.setApellido(rs.getString("apellido"));
               cliente.setDni(rs.getInt("dni"));
               cliente.setDomicilio(rs.getString("domicilio"));
               cliente.setTelefono(rs.getInt("telefono"));
               cliente.setEstado(rs.getBoolean("estado"));
               clientes.add(cliente);
               
           }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error en conectar a base de datos", ex.getMessage());
        }
        
        
        return clientes;
        
    }
    
    public ArrayList<Cliente> buscarClienteDNI(String Pclave){
        
         ArrayList<Cliente>clientes=new ArrayList();
        try {
           PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente WHERE dni LIKE ?");
           ps.setString(1, Pclave + "%");
            
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               Cliente cliente = new Cliente(); 
               cliente.setIdCliente(rs.getInt("idCliente"));
               cliente.setNombre(rs.getString("nombre"));
               cliente.setApellido(rs.getString("apellido"));
               cliente.setDni(rs.getInt("dni"));
               cliente.setDomicilio(rs.getString("domicilio"));
               cliente.setTelefono(rs.getInt("telefono"));
               cliente.setEstado(rs.getBoolean("estado"));
               clientes.add(cliente);
               
           }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error en conectar a base de datos", ex.getMessage());
        }
        
        
        return clientes;
    }
    
    public void bajaLogicaCliente(int idCliente){
        
           try{    
            String bajaLogica = "UPDATE cliente SET estado = false WHERE idCliente = ? ";
            PreparedStatement baja = con.prepareStatement(bajaLogica);
            baja.setInt(1, idCliente);
            int resultado = baja.executeUpdate();
            baja.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
 
    }
    
    public void habilitarCliente(Cliente c) {
        
         try{    
            String bajaLogica = "UPDATE cliente SET estado = true WHERE idCliente = ? ";
            PreparedStatement alta = con.prepareStatement(bajaLogica);
            alta.setInt(1, c.getIdCliente());
            int resultado = alta.executeUpdate();
            alta.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        
    }
 
    @Override
    public void insertar(Object object) {
        
        Cliente cliente = (Cliente) object;     
        
        try {
            PreparedStatement st = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getApellido());
            st.setInt(3,cliente.getDni());
            st.setString(4, cliente.getDomicilio());
            st.setInt(5, cliente.getTelefono());
            st.executeUpdate();
            
            ResultSet rs = st.getGeneratedKeys();
            
            if(rs.next()){
                cliente.setIdCliente(rs.getInt(1));
            }
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error en la base de datos " + ex.getMessage());
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
        
        Cliente cliente = (Cliente) object;     
        
        Cliente clienteActualizado = null;
 
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getDni());
            ps.setString(4,cliente.getDomicilio());
            ps.setInt(5,cliente.getTelefono());
            ps.setInt(6,cliente.getIdCliente());
            clienteActualizado = cliente;
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        

        return clienteActualizado;
        
    }
    
    @Override
    public Object obtenerUno(int id) {  
        
        Cliente cliente = null;
        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_UNO);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
               
               Cliente c = new Cliente();
               c.setIdCliente(id);
               c.setNombre(rs.getString("nombre"));
               c.setApellido(rs.getString("apellido"));
               c.setDni(rs.getInt("dni"));
               c.setDomicilio(rs.getString("domicilio"));
               c.setTelefono(rs.getInt("telefono"));
               c.setEstado(rs.getBoolean("estado"));
               cliente=c;
               
           }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error de tabla Cliente", ex.getMessage());
        }
        return cliente;
    }

    @Override
    public ArrayList<Object> obtenerTodo() {

       ArrayList<Object> listaClientes = new ArrayList<>();
       
        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_TODO);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setEstado(rs.getBoolean("estado"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getInt("telefono"));
                listaClientes.add(c);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Cliente " + ex.getMessage());
        }
        return listaClientes;
        
    }


}
