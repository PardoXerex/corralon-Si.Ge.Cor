
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class detallePedidoProv {
    
    private IdDetallePedidoProv id;
    private int cantSolicitada;
    private float precioActual;
    private float subTotal;
    
    public class IdDetallePedidoProv{
        private Long codigoPedidoProv;
        private Long codigoMaterial;
        private Date fechaDetallePedido;

        public IdDetallePedidoProv(Long codigoPedidoProv, Long codigoMaterial, Date fechaDetallePedido) {
            this.codigoPedidoProv = codigoPedidoProv;
            this.codigoMaterial = codigoMaterial;
            this.fechaDetallePedido = fechaDetallePedido;
        }

        public Long getCodigoPedidoProv() {
            return codigoPedidoProv;
        }

        public void setCodigoPedidoProv(Long codigoPedidoProv) {
            this.codigoPedidoProv = codigoPedidoProv;
        }

        public Long getCodigoMaterial() {
            return codigoMaterial;
        }

        public void setCodigoMaterial(Long codigoMaterial) {
            this.codigoMaterial = codigoMaterial;
        }

        public Date getFechaDetallePedido() {
            return fechaDetallePedido;
        }

        public void setFechaDetallePedido(Date fechaDetallePedido) {
            this.fechaDetallePedido = fechaDetallePedido;
        }
        
    }

    public detallePedidoProv(IdDetallePedidoProv id) {
        this.id = id;
    }

    public detallePedidoProv(Long codPedProv, Long codMat, Date fechaDetPed, int cantSolicitada, float precioActual, float subTotal) {
        this.id = new IdDetallePedidoProv(codPedProv, codMat, fechaDetPed);
        this.cantSolicitada = cantSolicitada;
        this.precioActual = precioActual;
        this.subTotal = subTotal;
    }

    public IdDetallePedidoProv getId() {
        return id;
    }

    public void setId(IdDetallePedidoProv id) {
        this.id = id;
    }

    public int getCantSolicitada() {
        return cantSolicitada;
    }

    public void setCantSolicitada(int cantSolicitada) {
        this.cantSolicitada = cantSolicitada;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "detallePedidoProv{" + "id=" + id + ", cantSolicitada=" + cantSolicitada + ", precioActual=" + precioActual + ", subTotal=" + subTotal + '}';
    }
    
}
