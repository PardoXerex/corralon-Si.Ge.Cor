
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.producto;
import SiGeCor.DAO.productoDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLProducto implements productoDAO{
    private Connection conexion;

    public MySQLProducto(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(producto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(producto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(producto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<producto> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public producto obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
