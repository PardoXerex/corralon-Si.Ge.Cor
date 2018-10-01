
package SiGeCor.CapaDeNegocios;

import SiGeCor.CapaDeDatos.cliente;
import SiGeCor.DAO.DAOException;
import SiGeCor.DAO.clienteDAO;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLCliente implements clienteDAO{
    
    private final Connection conexion;
    final String INSERT = "INSERT INTO cliente(Nombre_Cliente, Direccion_Cliente, Estado_Cliente) VALUES (?,?,?)";
    final String UPDATE = "UPDATE cliente SET Nombre_Cliente=?, Direccion_Cliente=?, Estado_Cliente=? WHERE DNI_Cliente=?" ;
    final String DELETE = "DELETE FROM cliente WHERE DNI_Cliente=?";
    final String GETALL = "SELECT Nombre_Cliente, Direccion_Cliente, Estado_Cliente FROM cliente";
    final String GETONE = "SELECT Nombre_Cliente, Direccion_Cliente, Estado_Cliente FROM cliente WHERE DNI_Cliente=?";

    public MySQLCliente(Connection conexion) {
        this.conexion = conexion;
    }
    
    private cliente convertir(ResultSet rs) throws SQLException{
        String nombre = rs.getString("Nombre_Cliente");
        String direccion = rs.getString("Direccion_Cliente");
        boolean estado = rs.getBoolean("Estado_Cliente");
        cliente cliente = new cliente(nombre, direccion, estado);
        cliente.setDniCliente(rs.getLong("DNI_Cliente"));
        return cliente;
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
    public void insertar(cliente k) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs=null;
        try {
            stat = conexion.prepareStatement(INSERT);
            stat.setString(1,k.getNombreCliente());
            stat.setString(2, k.getDireccionCliente());
            stat.setBoolean(3, k.isEstadoClie());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                k.setDniCliente(rs.getLong(1));
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
    public void eliminar(cliente k) throws DAOException{
        PreparedStatement stat=null;
        try {
            stat=conexion.prepareStatement(DELETE);
            stat.setLong(1, k.getDniCliente());
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
    public void modificar(cliente k) throws DAOException{
        PreparedStatement stat = null;
        ResultSet rs=null;
        try {
            stat = conexion.prepareStatement(UPDATE);
            stat.setString(1,k.getNombreCliente());
            stat.setString(2, k.getDireccionCliente());
            stat.setBoolean(3, k.isEstadoClie());
            if(stat.executeUpdate() == 0){
                throw new DAOException("Puede que no se haya guardado.");
            }
            rs = stat.getGeneratedKeys();
            if(rs.next()){
                k.setDniCliente(rs.getLong(1));
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
    public List<cliente> obtenerTodos() throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        List<cliente> clientes=new ArrayList<>();
        try {
            stat=conexion.prepareStatement(GETALL);
            rs=stat.executeQuery();
            while(rs.next()){
                clientes.add(convertir(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.");
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return clientes;
    }

    @Override
    public cliente obtener(Long id) throws DAOException{
        PreparedStatement stat=null;
        ResultSet rs=null;
        cliente cliente=null;
        try {
            stat=conexion.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs=stat.executeQuery();
            if(rs.next()){
                cliente=convertir(rs);
            }else{
                throw new DAOException("No se ha encontrado ese registro.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error SQL.");
        } finally {
            cerrarResulSet(rs);
            cerrarStatement(stat);
        }
        return cliente;
    }
    /*Esto es para probar 
 public static void main(String[]args) throws SQLException, DAOException{
    String driver = "com.mysql.jdbc.Driver";
    String database = "corralonSIGeCor";
    String host= "localhost";
    String port = "3306";
    String user="root";
    String password="pardo";
    //String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    //Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database,user,password);
    Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false");
    MySQLCliente dao=new MySQLCliente(conexion);
    
    cliente a=new cliente("pepo","dirpepo",true);
    List<cliente> clientes=dao.obtenerTodos();
    for(cliente c :clientes){
        System.out.println(c.toString());
     }*/     

}
