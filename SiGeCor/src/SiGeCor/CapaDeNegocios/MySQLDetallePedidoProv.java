
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.detallePedidoProv;
import SiGeCor.DAO.detallePedidoProvDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLDetallePedidoProv implements detallePedidoProvDAO{
    private Connection conexion;

    public MySQLDetallePedidoProv(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(detallePedidoProv k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(detallePedidoProv k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(detallePedidoProv k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<detallePedidoProv> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public detallePedidoProv obtener(detallePedidoProv.IdDetallePedidoProv id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
