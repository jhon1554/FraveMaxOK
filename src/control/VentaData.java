package control;

import Interfaces.SqlCrud;
import entidades.Cliente;
import entidades.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;




public class VentaData implements SqlCrud{
    private final Connection conexion;

    public VentaData() {
        conexion = Conexion.getConexion();
    }
    
//    public ArrayList<Venta> obtenerTodoSeleccionTabla(int id){
//        
//      ArrayList<Object> lista = new ArrayList<>();
//        String query = "SELECT * FROM venta WHERE idVenta = ?";
//        try {
//            PreparedStatement ps = conexion.prepareStatement(query);
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//                Venta vt = new Venta();
//                vt.setFecha(resultado.getDate("fecha").toLocalDate());
//                vt.setCliente(new Cliente());
//                vt.getCliente().setIdCliente(resultado.getInt("idCliente"));
//                lista.add(vt);
//            }
//            ps.close();
//            resultado.close();
//        } catch (SQLException e) {
//            System.out.println("Error en la bd" + e);
//        }
//        return lista;
//        
//        
//        
//        
//    }
    
    

    @Override
    public void insertar(Object object) {
        Venta venta = (Venta) object;
        String query = "INSERT INTO venta (fecha, idCliente)VALUES (?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
                venta.setIdVenta(rs.getInt(1));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error en la bd");
        }
    }

    @Override
    public void borrar(int id) {
        try {
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM venta WHERE idVenta = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd " + e);
        }
    }

    @Override
    public Object actualizar(Object object) {
        Venta venta = (Venta) object;  
        Venta va = null;
        try {
            PreparedStatement ps = conexion.prepareStatement("UPDATE venta SET fecha = ?, idCliente = ? WHERE idVenta =?");
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.setInt(3, venta.getIdVenta());
            va = venta;
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println("error en la bd " + e);
        }
        
        return va;
    }

    @Override
    public Object obtenerUno(int id) {
        Venta venta = null;
        String query = "SELECT * FROM venta WHERE idVenta = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                Venta vt = new Venta();
                vt.setFecha(resultado.getDate("fecha").toLocalDate());
                vt.setCliente(new Cliente());
                vt.getCliente().setIdCliente(resultado.getInt("idCliente"));
                venta = vt;
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd" + e);
        }
        return venta;
    }

    @Override
    public List<Object> obtenerTodo() {
        ArrayList<Object> lista = new ArrayList<>();
        String query = "SELECT * FROM venta";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Venta vt = new Venta();
                vt.setIdVenta(resultado.getInt("idVenta"));
                vt.setFecha(resultado.getDate("fecha").toLocalDate());
                vt.setCliente(new Cliente());
                vt.getCliente().setIdCliente(resultado.getInt("idCliente"));
                
                lista.add(vt);
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd" + e);
        }
        return lista;
    }
    
    public ArrayList<Venta> obtenerTodoPorFecha(String d){
      ArrayList<Venta> lista = new ArrayList<>();
        String query = "SELECT * FROM venta WHERE fecha = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1,  d);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Venta vt = new Venta();
                vt.setIdVenta(resultado.getInt("idVenta"));
                vt.setFecha(resultado.getDate("fecha").toLocalDate());
                vt.setCliente(new Cliente());
                vt.getCliente().setIdCliente(resultado.getInt("idCliente"));
                
                lista.add(vt);
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd" + e);
        }
        return lista;
        
  
        
    }
    
    
}
