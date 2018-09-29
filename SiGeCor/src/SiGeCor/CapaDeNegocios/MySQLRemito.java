
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.remito;
import SiGeCor.DAO.remitoDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLRemito implements remitoDAO{
    private Connection conexion;

    public MySQLRemito(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(remito k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(remito k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(remito k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<remito> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public remito obtener(remito.IdRemito id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
