
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.pedidoCliente;
import SiGeCor.DAO.pedidoClienteDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLPedidoCliente implements pedidoClienteDAO{
    private Connection conexion;

    public MySQLPedidoCliente(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(pedidoCliente k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(pedidoCliente k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(pedidoCliente k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<pedidoCliente> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public pedidoCliente obtener(pedidoCliente.IdPedidoClie id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
