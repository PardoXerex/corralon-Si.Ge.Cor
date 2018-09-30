
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.stock;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.stockDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLStock implements stockDAO{
    private final Connection conexion;
    final String INSERT = "INSERT INTO stock(Nombre_Material, Descripcion_Mat, Cant_Existente, Stock_Minimo, Stock_Maximo, Estado_Material) VALUES (?,?,?,?,?,?)";
    final String UPDATE = "UPDATE stock SET Nombre_Material=?, Descripcion_Mat=?, Cant_Existente=?, Stock_Minimo=?, Stock_Maximo=?, Estado_Material=? WHERE Cod_Material=?" ;
    final String DELETE = "DELETE FROM stock WHERE Cod_Material=?";
    final String GETALL = "SELECT Nombre_Material, Descripcion_Mat, Cant_Existente, Stock_Minimo, Stock_Maximo, Estado_Material FROM stock";
    final String GETONE = "SELECT Nombre_Material, Descripcion_Mat, Cant_Existente, Stock_Minimo, Stock_Maximo, Estado_Material FROM stock WHERE Cod_Material=?";

    public MySQLStock(Connection conexion) {
        this.conexion = conexion;
    }
    
    private stock convertir(ResultSet rs) throws SQLException{
        String nombreMat= rs.getString("Nombre_Material");
        String descripcion= rs.getString("Descripcion_Mat");
        String existencia= rs.getString("Cant_Existente");
        int stockMin= rs.getInt("Stock_Minimo");
        int stockMax= rs.getInt("Stock_Maximo");
        boolean estado= rs.getBoolean("Estado_Material");
        stock stock=new stock(nombreMat, descripcion, stockMin, stockMin, stockMax, estado);
        stock.setCodMaterial(rs.getLong("Cod_Material"));
        return stock;
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
    public void insertar(stock k) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat=conexion.prepareStatement(INSERT);
            stat.setString(1,k.getNombreMaterial());
            stat.setString(2,k.getDescripcionMaterial());
            stat.setInt(3, k.getCantidadExistente());
            stat.setInt(4, k.getStockMinimo());
            stat.setInt(5, k.getStockMaximo());
            stat.setBoolean(6,k.isEstadoMaterial());
            if (stat.executeUpdate()==0) {
                throw new DAOException("Puede que no se haya guardado correctamente.");
            }
            rs=stat.getGeneratedKeys();
            if (rs.next()) {
                k.setCodMaterial(rs.getLong(1));
            }else{
               throw new DAOException("No se pudo generar el id.");
            }
        }catch (SQLException ex){
            throw new DAOException("Error SQL", ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
    }

    @Override
    public void eliminar(stock k) throws DAOException{
        PreparedStatement stat=null;
        try {
             stat=conexion.prepareStatement(DELETE);
             stat.setLong(1, k.getCodMaterial());
             if (stat.executeUpdate()==0) {
                 throw new DAOException("Puede que no se haya eliminado correctamente.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.",ex);
        }finally {
            cerrarStatement(stat);
        }
    }

    @Override
    public void modificar(stock k) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat=conexion.prepareStatement(UPDATE);
            stat.setString(1,k.getNombreMaterial());
            stat.setString(2,k.getDescripcionMaterial());
            stat.setInt(3, k.getCantidadExistente());
            stat.setInt(4, k.getStockMinimo());
            stat.setInt(5, k.getStockMaximo());
            stat.setBoolean(6,k.isEstadoMaterial());
            if (stat.executeUpdate()==0) {
                throw new DAOException("Puede que no se haya guardado correctamente.");
            }
            rs=stat.getGeneratedKeys();
            if (rs.next()) {
                k.setCodMaterial(rs.getLong(1));
            }else{
               throw new DAOException("No se pudo generar el id.");
            }
        }catch (SQLException ex){
            throw new DAOException("Error SQL", ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
    }

    @Override
    public List<stock> obtenerTodos() throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        List<stock> materiales=new ArrayList<>();
        try {
            stat=conexion.prepareStatement(GETALL);
            rs=stat.executeQuery();
            while (rs.next()) {
                materiales.add(convertir(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return materiales;
    }

    @Override
    public stock obtener(Long id) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        stock stock=null;
        try {
            stat=conexion.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs=stat.executeQuery();
            if (rs.next()) {
                stock=convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado el registro.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.",ex);
        }finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return stock;
    }
    
}
