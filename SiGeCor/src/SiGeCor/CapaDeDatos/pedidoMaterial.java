
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class pedidoMaterial {
    
    private IdPedidoMaterial id;
    private int cantSolicitada;
    private float subTotalMat;
    
    public pedidoMaterial(IdPedidoMaterial id) {
        this.id = id;
    }
    public class IdPedidoMaterial{
        private Long codigoPedidoClie;
        private Long codigoMaterial;

        public IdPedidoMaterial(Long codigoPedidoProv, Long codigoMaterial) {
            this.codigoPedidoClie = codigoPedidoProv;
            this.codigoMaterial = codigoMaterial;
        }

        public Long getCodigoPedidoClie() {
            return codigoPedidoClie;
        }

        public void setCodigoPedidoClie(Long codigoPedidoClie) {
            this.codigoPedidoClie = codigoPedidoClie;
        }

        public Long getCodigoMaterial() {
            return codigoMaterial;
        }

        public void setCodigoMaterial(Long codigoMaterial) {
            this.codigoMaterial = codigoMaterial;
        }
        
    }

    public pedidoMaterial(Long codigoPedidoProv, Long codigoMaterial, int cantSolicitada, float subTotalMat) {
        this.id = new IdPedidoMaterial(codigoPedidoProv, codigoMaterial);
        this.cantSolicitada = cantSolicitada;
        this.subTotalMat = subTotalMat;
    }

    public IdPedidoMaterial getId() {
        return id;
    }

    public void setId(IdPedidoMaterial id) {
        this.id = id;
    }

    public int getCantSolicitada() {
        return cantSolicitada;
    }

    public void setCantSolicitada(int cantSolicitada) {
        this.cantSolicitada = cantSolicitada;
    }

    public float getSubTotalMat() {
        return subTotalMat;
    }

    public void setSubTotalMat(float subTotalMat) {
        this.subTotalMat = subTotalMat;
    }

    @Override
    public String toString() {
        return "pedidoMaterial{" + "id=" + id + ", cantSolicitada=" + cantSolicitada + ", subTotalMat=" + subTotalMat + '}';
    }
    
}
