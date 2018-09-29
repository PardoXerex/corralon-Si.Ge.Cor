
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.pedidoMaterial;
import SiGeCor.DAO.pedidoMaterialDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLPedidoMaterial implements pedidoMaterialDAO{
    private Connection conexion;

    public MySQLPedidoMaterial(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(pedidoMaterial k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(pedidoMaterial k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(pedidoMaterial k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<pedidoMaterial> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public pedidoMaterial obtener(pedidoMaterial.IdPedidoMaterial id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
