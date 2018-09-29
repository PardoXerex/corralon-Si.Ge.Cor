
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class pedidoCliente {
    private IdPedidoClie id;
    private float totalPedido;
    
    public class IdPedidoClie{
        private Long codigoPedidoClie;
        private Long dniCliente;
        private Date fechaPedido;

        public IdPedidoClie(Long codigoPedidoClie, Long dniCliente,Date fechaPedido) {
            this.codigoPedidoClie = codigoPedidoClie;
            this.dniCliente = dniCliente;
            this.fechaPedido = fechaPedido;
        }

        public Long getCodigoPedidoClie() {
            return codigoPedidoClie;
        }

        public void setCodigoPedidoClie(Long codigoPedidoClie) {
            this.codigoPedidoClie = codigoPedidoClie;
        }

        public Long getDniCliente() {
            return dniCliente;
        }

        public void setDniCliente(Long dniCliente) {
            this.dniCliente = dniCliente;
        }

        public Date getFechaPedido() {
            return fechaPedido;
        }

        public void setFechaPedido(Date fechaPedido) {
            this.fechaPedido = fechaPedido;
        }
        
        
    }
     
    public pedidoCliente(IdPedidoClie id) {
        this.id = id;
    }
    
    public pedidoCliente(Long codPedido,Long docCliente, Date fechaPedido, float totalPedido) {
        this.id = new IdPedidoClie(codPedido, docCliente,fechaPedido);
        this.totalPedido = totalPedido;
    }

    public IdPedidoClie getId() {
        return id;
    }

    public void setId(IdPedidoClie id) {
        this.id = id;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    @Override
    public String toString() {
        return "pedidoCliente{" + "id=" + id + ", totalPedido=" + totalPedido + '}';
    }
    
}
