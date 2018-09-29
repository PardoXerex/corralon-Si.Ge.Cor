
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.pedidoProveedor;
import SiGeCor.DAO.pedidoProveedorDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLPedidoProv implements pedidoProveedorDAO{
    private Connection conexion;

    public MySQLPedidoProv(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(pedidoProveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(pedidoProveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(pedidoProveedor k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<pedidoProveedor> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public pedidoProveedor obtener(pedidoProveedor.IdPedidoProv id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
