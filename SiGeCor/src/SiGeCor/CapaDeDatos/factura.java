
package SiGeCor.CapaDeDatos;

import java.sql.Date;

public class factura {
    
    public class IdFactura{
        private Long codigoFcatura;
        private Long dniCliente;
        private Date fechaFactura;

        public IdFactura(Long codigoFcatura, Long dniCliente, Date fechaFactura) {
            this.codigoFcatura = codigoFcatura;
            this.dniCliente = dniCliente;
            this.fechaFactura= fechaFactura;
        }

        public Long getCodigoFcatura() {
            return codigoFcatura;
        }

        public void setCodigoFcatura(Long codigoFcatura) {
            this.codigoFcatura = codigoFcatura;
        }

        public Long getDniCliente() {
            return dniCliente;
        }

        public void setDniCliente(Long dniCliente) {
            this.dniCliente = dniCliente;
        }

        public Date getFechaFactura() {
            return fechaFactura;
        }

        public void setFechaFactura(Date fechaFactura) {
            this.fechaFactura = fechaFactura;
        }
        
        
    }
    
    private IdFactura id;
    private boolean estadoFcatura;

    public factura(IdFactura id) {
        this.id = id;
    }
    
    public factura(Long codFactura, Long docCliente, Date fechaFactura, boolean estadoFcatura) {
        this.id = new IdFactura(codFactura, docCliente, fechaFactura);
        this.estadoFcatura = estadoFcatura;
    }

    public IdFactura getId() {
        return id;
    }

    public void setId(IdFactura id) {
        this.id = id;
    }

    public boolean isEstadoFcatura() {
        return estadoFcatura;
    }

    public void setEstadoFcatura(boolean estadoFcatura) {
        this.estadoFcatura = estadoFcatura;
    }

    @Override
    public String toString() {
        return "factura{" + "id=" + id + ", estadoFcatura=" + estadoFcatura + '}';
    }
    
    
        
}
