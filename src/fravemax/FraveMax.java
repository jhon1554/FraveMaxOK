
package fravemax;

import control.ClienteData;
import control.DetalleCompraData;
import control.DetalleVentaData;
import control.VentaData;
import entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import vistas.MenuFravemax;

public class FraveMax {

    
    public static void main(String[] args) {
        
        MenuFravemax mf = new MenuFravemax();
        mf.setVisible(true);
//        ClienteData:----------------------------------------------------------
         
//        INSERTAR
//        ClienteData cd = new ClienteData();
//        Cliente c = new Cliente("Ignacio","Soloa",3332258,"juan saa 222",26547532,true);
//        cd.insertar(c);
       
//        BORRAR

//        ClienteData cd = new ClienteData();
//        cd.borrar(1);
        
//        ACTUALIZAR

//        ClienteData cd = new ClienteData();
//        Cliente c = new Cliente("Ignacio","Soloa",3332666,"juan saa 222",26547532,true);
//        cd.actualizar(c);

//        OBTENER UNO 

//        ClienteData cd = new ClienteData();
//        Cliente c = (Cliente) cd.obtenerUno(2);

//        OBTENER TODO 
          
//        ClienteData cd = new ClienteData();     
//        ArrayList <Object> listaClientes = cd.obtenerTodo();
//        System.out.println(listaClientes.toString());

//        CompraData------------------------------------------------------------

//        INSERTAR

//        CompraData cd = new CompraData();
//        Proveedor p = new Proveedor("Distribuidora X","San Martin 222",26548996);
//        Compra c = new Compra(p,LocalDate.of(2023,02,02));
//        cd.insertar(c);
       
//        BORRAR

//        CompraData cd = new CompraData();
//        cd.borrar(1);
        
//        ACTUALIZAR

//        CompraData cd = new CompraData();
//        Compra c = new Compra(p,LocalDate.of(2023,01,01));
//        cd.actualizar(c);

//        OBTENER UNO 

//        CompraData cd = new CompraData();
//        Compra c = (Compra) cd.obtenerUno(1);

//        OBTENER TODO 
          
//        CompraData cd = new CompraData();     
//        ArrayList <Object> listaCompras = cd.obtenerTodo();
//        System.out.println(listaCompras.toString());

//******************************************************************************
        //Pruebas DetalleVentaData
            //Producto producto = new Producto(1, "producto", 500, 10, true);
            //Cliente cliente = new Cliente(1, "Ariel", "Aricoma", 39675839, "Quines", 266475849, true);
            //Venta venta = new Venta(1, LocalDate.now(), cliente);
            //DetalleVenta vd = new DetalleVenta(3, 50, venta, producto);
            //DetalleVentaData dvd = new DetalleVentaData();
            //System.out.println(dvd.obtenerUno(7).toString());
            //System.out.println(dvd.obtenerTodo());
           //dvd.insertar(vd);
//******************************************************************************
        //Pruebas DetalleCompraData
            //Producto producto = new Producto(1, "producto", 500, 10, true);
            //Proveedor proveedor = new Proveedor(1, "razonsocial", "San luis", 266434535);
            //Compra compra = new Compra(1, proveedor, LocalDate.now());
            //DetalleCompra dc = new DetalleCompra(1, 4, 1000, compra, producto);
            //DetalleCompraData dcd = new DetalleCompraData();
            //dcd.insertar(dc);
            //System.out.println(dcd.obtenerUno(1));
            //System.out.println(dcd.obtenerTodo());
//******************************************************************************
       //Pruebas VentaData
            //VentaData vd = new VentaData();
            //Venta vt = new Venta();
            //Cliente cliente = new Cliente(1, "Ariel", "Aricoma", 39675839, "Quines", 266475849, true);
            //Venta venta = new Venta(1, LocalDate.of(2003, 11, 12), cliente);
            //System.out.println(vd.obtenerUno(1));
            //System.out.println(vd.obtenerTodo());
            //vd.insertar(venta);
            //vd.actualizar(venta);
            //vd.borrar(1);
            
//        ClienteData:----------------------------------------------------------
         
//        INSERTAR
//        ClienteData cd = new ClienteData();
//        Cliente c = new Cliente("Ignacio","Soloa",3332258,"juan saa 222",26547532,true);
//        cd.insertar(c);
       
//        BORRAR

//        ClienteData cd = new ClienteData();
//        cd.borrar(1);
        
//        ACTUALIZAR

//        ClienteData cd = new ClienteData();
//        Cliente c = new Cliente("Ignacio","Soloa",3332666,"juan saa 222",26547532,true);
//        cd.actualizar(c);

//        OBTENER UNO 

//        ClienteData cd = new ClienteData();
//        Cliente c = (Cliente) cd.obtenerUno(2);

//        OBTENER TODO 
          
//        ClienteData cd = new ClienteData();     
//        ArrayList <Object> listaClientes = cd.obtenerTodo();
//        System.out.println(listaClientes.toString());

//        CompraData------------------------------------------------------------

//        INSERTAR

//        CompraData cd = new CompraData();
//        Proveedor p = new Proveedor("Distribuidora X","San Martin 222",26548996);
//        Compra c = new Compra(p,LocalDate.of(2023,02,02));
//        cd.insertar(c);
       
//        BORRAR

//        CompraData cd = new CompraData();
//        cd.borrar(1);
        
//        ACTUALIZAR

//        CompraData cd = new CompraData();
//        Compra c = new Compra(p,LocalDate.of(2023,01,01));
//        cd.actualizar(c);

//        OBTENER UNO 

//        CompraData cd = new CompraData();
//        Compra c = (Compra) cd.obtenerUno(1);

//        OBTENER TODO 
          
//        CompraData cd = new CompraData();     
//        ArrayList <Object> listaCompras = cd.obtenerTodo();
//        System.out.println(listaCompras.toString());



//            //Pruebas productodata
//            
//            ProductoData pd = new ProductoData();
//            Producto pro = new Producto(1,"nada",150,10,true);
//            //Insertar
//            pd.insertar(pro);
//            //Actualizar
//            pd.actualizar(pro);
//            //ObtenerUno
//            System.out.println(pd.obtenerUno(1));
//            //ObtenerTodo
//            System.out.println(pd.obtenerTodo());
//            //Borrar
//            pd.borrar(1);
//            
//            
//            
//            
//            //Pruebas proveedorData
//            
//            ProveedorData pod = new ProveedorData();
//            Proveedor prov = new Proveedor(1,"ninguna","San Luis",1234);
//            
//            //Insertar
//            pod.insertar(prov);
//            //Actualizar
//            pod.actualizar(prov);
//            //ObtenerUno
//            System.out.println(pod.obtenerUno(1));
//            //ObtenerTodo
//            System.out.println(pod.obtenerTodo());
//            //Borrar
//            pod.borrar(1);

    }


    }
    

