package SiGeCor.CapaDeDatos;

import java.sql.Date;


public class catalogo{
    private IdCatalogo id;
    private float precioUnitario;
    private Date fechaVigencia;  
    
    public class IdCatalogo{
       private Long cuitProveedor;
       private Long codigoProd;

        public IdCatalogo(Long cuitProveedor, Long codigoProd) {
            this.cuitProveedor = cuitProveedor;
            this.codigoProd = codigoProd;
        }

        public Long getCuitProveedor() {
            return cuitProveedor;
        }

        public void setCuitProveedor(Long cuitProveedor) {
            this.cuitProveedor = cuitProveedor;
        }

        public Long getCodigoProd() {
            return codigoProd;
        }

        public void setCodigoProd(Long codigoProd) {
            this.codigoProd = codigoProd;
        }
               
    }

    public catalogo(IdCatalogo id) {
        this.id = id;
    }
    
    public catalogo(Long cuitProv,Long codProd,float precioUnitario,Date fecha){
        this.id= new IdCatalogo(cuitProv, codProd);
        this.precioUnitario=precioUnitario;
        this.fechaVigencia=fecha;
    }

    public IdCatalogo getId() {
        return id;
    }

    public void setId(IdCatalogo id) {
        this.id = id;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
    
    @Override
    public String toString() {
        return "catalogo{" + "id=" + id + ", precioUnitario=" + precioUnitario + ", fechaVigencia=" + fechaVigencia + '}';
    }
    
    
    
    
}
