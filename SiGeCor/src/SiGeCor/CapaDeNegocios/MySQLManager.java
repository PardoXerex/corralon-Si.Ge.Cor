
package SiGeCor.CapaDeNegocios;

import SiGeCor.DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLManager implements DAOManager{
    
    private Connection conexion;
    private catalogoDAO catalogo=null;
    private clienteDAO cliente=null;
    private detallePedidoProvDAO detalle=null;
    private facturaDAO factura=null;
    private pedidoClienteDAO pedidoClie=null;
    private pedidoMaterialDAO pedidoMat=null;
    private pedidoProveedorDAO pedidoProv=null;
    private presupuestoDAO pres=null;
    private productoDAO prod=null;
    private proveedorDAO prov=null;
    private remitoDAO remito=null;
    private stockDAO stock=null;
    
    public MySQLManager(String host, String database, String user, String password) throws SQLException {
        conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database,user,password);
     }

    @Override
    public catalogoDAO getCatalogoDAO() {
        if(catalogo==null){
            catalogo =new MySQLCatalogo(conexion);
        }
        return catalogo;
    }

    @Override
    public clienteDAO getClienteDAO() {
        if(cliente==null){
            cliente = new MySQLCliente(conexion);
        }
        return cliente;
    }

    @Override
    public detallePedidoProvDAO getDetallePedidoProvDAO() {
        if(detalle==null){
            detalle =new MySQLDetallePedidoProv(conexion);
        }
        return detalle;
    }

    @Override
    public facturaDAO getFacturaDAO() {
        if(factura==null){
            factura=new MySQLFactura(conexion);
        }
        return factura;
    }

    @Override
    public pedidoClienteDAO getPedidoClienteDAO() {
        if(pedidoClie==null){
            pedidoClie =new MySQLPedidoCliente(conexion);
        }
        return pedidoClie;
    }

    @Override
    public pedidoMaterialDAO getPedidoMaterialDAO() {
        if(pedidoMat==null){
            pedidoMat =new MySQLPedidoMaterial(conexion);
        }
        return pedidoMat;
    }

    @Override
    public pedidoProveedorDAO getPedidoProveedorDAO() {
        if(pedidoProv==null){
            pedidoProv =new MySQLPedidoProv(conexion);
        }
        return pedidoProv;
    }

    @Override
    public presupuestoDAO getPresupuestoDAO() {
        if(pres==null){
            pres =new MySQLPresupuesto(conexion);
        }
        return pres;
    }

    @Override
    public productoDAO getProductoDAO() {
        if(prod==null){
            prod =new MySQLProducto(conexion);
        }
        return prod;
    }

    @Override
    public proveedorDAO getProveedorDAO() {
        if(prov==null){
            prov =new MySQLProveedor(conexion);
        }
        return prov;
    }

    @Override
    public remitoDAO getRemitoDAO() {
        if(remito==null){
            remito =new MySQLRemito(conexion);
        }
        return remito;
    }

    @Override
    public stockDAO getStockDAO() {
        if(stock==null){
            stock =new MySQLStock(conexion);
        }
        return stock;
    }
    
}
