
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.producto;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.productoDAO;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLProducto implements productoDAO{
    private final Connection conexion;
    final String INSERT = "INSERT INTO producto(Nombre_Producto,Descripcion_Prod) VALUES (?,?)";
    final String UPDATE = "UPDATE producto SET Nombre_Producto=?, Descripcion_Prod=? WHERE Cod_Producto=?";
    final String DELETE = "DELETE FROM producto WHERE Cod_Producto=?";
    final String GETALL = "SELECT Nombre_Producto,Descripcion_Prod FROM producto";
    final String GETONE = "SELECT Nombre_Producto,Descripcion_Prod FROM producto WHERE Cod_Producto=?";

    public MySQLProducto(Connection conexion) {
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
    
    private producto convertir(ResultSet rs) throws SQLException{
        String nombreProd= rs.getString("Nombre_Producto");
        String descripcion= rs.getString("Descripcion_Prod");
        producto prod=new producto(nombreProd, descripcion);
        prod.setCodigoProducto(rs.getLong("Cod_Producto"));
        return prod;
    }

    @Override
    public void insertar(producto k)throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat=conexion.prepareStatement(INSERT);
            stat.setString(1,k.getNombreProducto());
            stat.setString(2, k.getDescripcionProd());
            if (stat.executeUpdate()==0) {
                throw new DAOException("Puede que no se haya guardado correctamente.");
            }
            rs=stat.getGeneratedKeys();
            if (rs.next()) {
                k.setCodigoProducto(rs.getLong(1));
            } else {
                throw new DAOException("No se pudo generar el id.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
    }

    @Override
    public void eliminar(producto k) throws DAOException{
        PreparedStatement stat=null;
        try {
            stat=conexion.prepareStatement(DELETE);
            stat.setLong(1, k.getCodigoProducto());
            if (stat.executeUpdate()==0) {
                throw new DAOException("Puede que no se haya eliminado correctamente.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL",ex);
        }finally {
            cerrarStatement(stat);
        }
    }

    @Override
    public void modificar(producto k) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat=conexion.prepareStatement(UPDATE);
            stat.setString(1,k.getNombreProducto());
            stat.setString(2, k.getDescripcionProd());
            if (stat.executeUpdate()==0) {
                throw new DAOException("Puede que no se haya guardado correctamente.");
            }
            rs=stat.getGeneratedKeys();
            if (rs.next()) {
                k.setCodigoProducto(rs.getLong(1));
            } else {
                throw new DAOException("No se pudo generar el id.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
    }

    @Override
    public List<producto> obtenerTodos() throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        List<producto> productos=new ArrayList<>();
        try {
            stat=conexion.prepareStatement(GETALL);
            rs=stat.executeQuery();
            while (rs.next()) {
                productos.add(convertir(rs));
            }
        } catch (SQLException ex) {
            throw new IllegalStateException("Error SQL",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return productos;
    }

    @Override
    public producto obtener(Long id) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        producto prod=null;
        try {
            stat=conexion.prepareStatement(GETONE);
            stat.setLong(1,id);
            rs=stat.executeQuery();
            if (rs.next()) {
                prod=convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return prod;
    }
    
}
