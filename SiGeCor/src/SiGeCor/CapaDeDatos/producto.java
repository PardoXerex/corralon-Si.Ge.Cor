
package SiGeCor.CapaDeDatos;

public class producto {
    private Long codigoProducto=null;
    private String nombreProducto;
    private String descripcionProd;

    public producto(String nombreProducto, String descripcionProd) {
        this.nombreProducto = nombreProducto;
        this.descripcionProd = descripcionProd;
    }

    public producto() {
        this.nombreProducto="";
        this.descripcionProd="";
    }
    

    public Long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    @Override
    public String toString() {
        return "producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", descripcionProd=" + descripcionProd + '}';
    }
    
}
