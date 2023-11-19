
package Interfaces;

import java.util.List;

public interface SqlCrud {
    
    
    void insertar(Object object);
    void borrar(int id);
    Object actualizar(Object object);
    Object obtenerUno(int id);
    List<Object>obtenerTodo();
   

}
