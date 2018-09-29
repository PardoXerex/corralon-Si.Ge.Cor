
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.factura;
import SiGeCor.DAO.facturaDAO;
import java.sql.Connection;
import java.util.List;

public class MySQLFactura implements facturaDAO{
    private Connection conexion;

    public MySQLFactura(Connection conexion) {
        this.conexion = conexion;
    }
    

    @Override
    public void insertar(factura k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(factura k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(factura k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<factura> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public factura obtener(factura.IdFactura id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
