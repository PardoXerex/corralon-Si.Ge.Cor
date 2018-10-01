
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.catalogo;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.catalogoDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLCatalogo implements catalogoDAO{
    
    private final Connection conexion;
    final String INSERT = "INSERT INTO catalogo(Precio_Unitario, Fecha_Actualizacion) VALUES (?,?)";
    final String UPDATE = "UPDATE catalogo SET Precio_Unitario=?, Fecha_Actualizacion=? WHERE CUIT_Proveedor=? AND Codigo_Prod=?";
    final String DELETE = "DELETE FROM catalogo WHERE CUIT_Proveedor=? AND Codigo_Prod=?";
    final String GETALL = "SELECT Precio_Unitario, Fecha_Actualizacion FROM catalogo";
    final String GETONE = "SELECT Precio_Unitario, Fecha_Actualizacion FROM ctalogo WHERE CUIT_Proveedor=? AND Codigo_Prod=?";

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
    private catalogo convertir(ResultSet rs) throws SQLException{
        float precio= rs.getFloat("Precio_Unitario");
        Date fecha= rs.getDate("Fecha_Actualizacion");
        catalogo cat = new catalogo(rs.getLong("CUIT_Proveedor"), rs.getLong("Codigo_Prod"), precio, fecha);
        return cat;
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
