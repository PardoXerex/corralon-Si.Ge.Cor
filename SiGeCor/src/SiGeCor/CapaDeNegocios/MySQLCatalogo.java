
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.catalogo;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.catalogoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLCatalogo implements catalogoDAO{
    
    private Connection conexion;

    public MySQLCatalogo(Connection conexion) {
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
    public void insertar(catalogo k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(catalogo k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(catalogo k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<catalogo> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public catalogo obtener(catalogo.IdCatalogo id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
