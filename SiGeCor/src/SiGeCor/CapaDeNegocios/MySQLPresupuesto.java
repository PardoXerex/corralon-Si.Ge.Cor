
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.presupuesto;
import SiGeCor.DAO.presupuestoDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLPresupuesto implements presupuestoDAO{
    private Connection conexion;

    public MySQLPresupuesto(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(presupuesto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(presupuesto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(presupuesto k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<presupuesto> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public presupuesto obtener(presupuesto.IdPresupuesto id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
