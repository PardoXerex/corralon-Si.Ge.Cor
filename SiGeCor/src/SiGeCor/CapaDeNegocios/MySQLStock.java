
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.stock;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.stockDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLStock implements stockDAO{
    private Connection conexion;

    public MySQLStock(Connection conexion) {
        this.conexion = conexion;
    }
    
    private void cerrarStatement(PreparedStatement s) throws DAOException{
        if(s!=null){
                try {
                    s.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
    }
    
    private void cerrarResulSet(ResultSet r) throws DAOException{
        if(r!=null){
                try {
                    r.close();
                } catch (SQLException e) {
                    throw new DAOException("Error SQL", e);
                }
            }
    }

    @Override
    public void insertar(stock k) {
        
    }

    @Override
    public void eliminar(stock k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(stock k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<stock> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public stock obtener(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
