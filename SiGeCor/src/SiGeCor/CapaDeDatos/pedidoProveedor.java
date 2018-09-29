
package SiGeCor.CapaDeDatos;
import java.sql.Date;
public class pedidoProveedor {
    private IdPedidoProv id;
    private float totalPedido;
    private int estadoPedido;
        
    public class IdPedidoProv{
        private Long codigoPedidoProv;
        private Long cuitProveedor;
        private Date fechaPedido;

        public IdPedidoProv(Long codigoPedidoProv, Long cuitProveedor,Date fechaPedido) {
            this.codigoPedidoProv = codigoPedidoProv;
            this.cuitProveedor = cuitProveedor;
            this.fechaPedido=fechaPedido;
        }

        public Long getCodigoPedidoProv() {
            return codigoPedidoProv;
        }

        public void setCodigoPedidoProv(Long codigoPedidoProv) {
            this.codigoPedidoProv = codigoPedidoProv;
        }

        public Long getCuitProveedor() {
            return cuitProveedor;
        }

        public void setCuitProveedor(Long cuitProveedor) {
            this.cuitProveedor = cuitProveedor;
        }

        public Date getFechaPedido() {
            return fechaPedido;
        }

        public void setFechaPedido(Date fechaPedido) {
            this.fechaPedido = fechaPedido;
        }
                
    }
     
    public pedidoProveedor(IdPedidoProv id) {
        this.id = id;
    }
    
    public pedidoProveedor(Long codPedido,Long cuitProv, Date fechaPedido, float totalPedido, int estadoPedido) {
        this.id = new IdPedidoProv(codPedido, cuitProv, fechaPedido) ;
        this.totalPedido = totalPedido;
        this.estadoPedido= estadoPedido;
    }
    
    public IdPedidoProv getId() {
        return id;
    }

    public void setId(IdPedidoProv id) {
        this.id = id;
    }
    
    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    public int getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "pedidoProveedor{" + "id=" + id + ", totalPedido=" + totalPedido + ", estadoPedido=" + estadoPedido + '}';
    }
    
        
}
