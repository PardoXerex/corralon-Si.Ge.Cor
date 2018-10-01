
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.proveedor;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.proveedorDAO;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLProveedor implements proveedorDAO{
    private final Connection conexion;
    final String INSERT = "INSERT INTO proveedor(Nombre_Prov, Direccion_Prov, Telefono_Prov, Estado_Prov) VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE proveedor SET Nombre_Prov=?, Direccion_Prov=?, Telefono_Prov=?, Estado_Prov=? WHERE CUIT_Prov=?" ;
    final String DELETE = "DELETE FROM proveedor WHERE CIUIT_Prov=?";
    final String GETALL = "SELECT Nombre_Prov, Direccion_Prov, Telefono_Prov, Estado_Prov FROM proveedor";
    final String GETONE = "SELECT Nombre_Prov, Direccion_Prov, Telefono_Prov, Estado_Prov FROM cliente WHERE CUIT_Prov=?";

    public MySQLProveedor(Connection conexion) {
        this.conexion = conexion;
    }
    
    private proveedor convertir(ResultSet rs) throws SQLException{
        String nombre = rs.getString("Nombre_Prov");
        String direccion = rs.getString("Direccion_Prov");
        int telefono = rs.getInt("Telefonon_Prov");
        boolean estado = rs.getBoolean("Estado_Prov");
        proveedor prov = new proveedor(nombre, direccion, telefono, estado);
        prov.setCuitProveedor(rs.getLong("CUIT_Prov"));
        return prov;
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
    public void insertar(proveedor k) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs=null;
        try {
            stat = conexion.prepareStatement(INSERT);
            stat.setString(1,k.getNombreProveedor());
            stat.setString(2, k.getDireccionProveedor());
            stat.setInt(3, k.getTelefonoProveedor());
            stat.setBoolean(4, k.isEstadoProveedor());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                k.setCuitProveedor(rs.getLong(1));
            }else{
                throw new DAOException("No se pudo generar el id");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat); 
        }
    }

    @Override
    public void eliminar(proveedor k) throws DAOException{
        PreparedStatement stat=null;
        try {
            stat=conexion.prepareStatement(DELETE);
            stat.setLong(1, k.getCuitProveedor());
            if(stat.executeUpdate()==0){
                throw new DAOException("Puede que no se elimino correctamente.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL", ex);
        } finally {
            cerrarStatement(stat);
        }
    }

    @Override
    public void modificar(proveedor k) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs=null;
        try {
            stat = conexion.prepareStatement(UPDATE);
            stat.setString(1,k.getNombreProveedor());
            stat.setString(2, k.getDireccionProveedor());
            stat.setInt(3, k.getTelefonoProveedor());
            stat.setBoolean(4, k.isEstadoProveedor());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                k.setCuitProveedor(rs.getLong(1));
            }else{
                throw new DAOException("No se pudo generar el id");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat); 
        }
    }

    @Override
    public List<proveedor> obtenerTodos() throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        List<proveedor> proveedores=new ArrayList<>();
        try {
            stat=conexion.prepareStatement(GETALL);
            rs=stat.executeQuery();
            if(rs.next()){
                proveedores.add(convertir(rs));
            }else{
                throw new DAOException("No se ha encontrado ese registro.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.");
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return proveedores;
    }

    @Override
    public proveedor obtener(Long id) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        proveedor prov=null;
        try {
            stat=conexion.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs=stat.executeQuery();
            if(rs.next()){
                prov=convertir(rs);
            }else{
                throw new DAOException("No se ha encontrado ese registro.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.");
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return prov;
    }
    
}
