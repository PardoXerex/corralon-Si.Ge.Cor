
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class presupuesto {  
    
    private IdPresupuesto id;
    private Date fechaPresupuesto;
    
    public class IdPresupuesto{
        private Long codigoPedidoClie;
        private Long dniCliente;

        public IdPresupuesto(Long codigoPedidoClie, Long dniCliente) {
            this.codigoPedidoClie = codigoPedidoClie;
            this.dniCliente = dniCliente;
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
    }

    public presupuesto(IdPresupuesto id) {
        this.id = id;
    }

    public presupuesto(Long codPedClie, Long dniClie, Date fechaPresupuesto) {
        this.id = new IdPresupuesto(codPedClie, dniClie);
        this.fechaPresupuesto = fechaPresupuesto;
    }

    public IdPresupuesto getId() {
        return id;
    }

    public void setId(IdPresupuesto id) {
        this.id = id;
    }

    public Date getFechaPresupuesto() {
        return fechaPresupuesto;
    }

    public void setFechaPresupuesto(Date fechaPresupuesto) {
        this.fechaPresupuesto = fechaPresupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto{" + "id=" + id + ", fechaPresupuesto=" + fechaPresupuesto + '}';
    }
}
