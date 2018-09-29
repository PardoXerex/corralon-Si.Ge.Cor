
package SiGeCor.DAO;

public interface DAOManager {
    
    catalogoDAO getCatalogoDAO();
    clienteDAO getClienteDAO();
    detallePedidoProvDAO getDetallePedidoProvDAO();
    facturaDAO getFacturaDAO();
    pedidoClienteDAO getPedidoClienteDAO();
    pedidoMaterialDAO getPedidoMaterialDAO();
    pedidoProveedorDAO getPedidoProveedorDAO();
    presupuestoDAO getPresupuestoDAO();
    productoDAO getProductoDAO();
    proveedorDAO getProveedorDAO();
    remitoDAO getRemitoDAO();
    stockDAO getStockDAO();
}
