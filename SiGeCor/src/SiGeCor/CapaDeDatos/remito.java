
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class remito {
    
    private IdRemito id;
    private float subTotalRemito;
    private float totalRemito;
    
    public class IdRemito{
        private Long codigoPedidoProv;
        private Long cuitProveedor;

        public IdRemito(Long codigoPedidoProv, Long cuitProveedor) {
            this.codigoPedidoProv = codigoPedidoProv;
            this.cuitProveedor = cuitProveedor;
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
        
    }
    
    public remito(IdRemito id) {
        this.id = id;
    }

    public remito(Long codPedProv, Long cuitProv, float subTotalRemito, float totalRemito) {
        this.id = new IdRemito(codPedProv, cuitProv);
        this.subTotalRemito = subTotalRemito;
        this.totalRemito = totalRemito;
    }

    public IdRemito getId() {
        return id;
    }

    public void setId(IdRemito id) {
        this.id = id;
    }

    public float getSubTotalRemito() {
        return subTotalRemito;
    }

    public void setSubTotalRemito(float subTotalRemito) {
        this.subTotalRemito = subTotalRemito;
    }

    public float getTotalRemito() {
        return totalRemito;
    }

    public void setTotalRemito(float totalRemito) {
        this.totalRemito = totalRemito;
    }
    
    @Override
    public String toString() {
        return "remito{" + "id=" + id + ", subTotalRemito=" + subTotalRemito + ", totalRemito=" + totalRemito + '}';
    }   
    
}
