
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.proveedor;
import SiGeCor.DAO.proveedorDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLProveedor implements proveedorDAO{
    private Connection conexion;

    public MySQLProveedor(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(proveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(proveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(proveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<proveedor> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public proveedor obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
