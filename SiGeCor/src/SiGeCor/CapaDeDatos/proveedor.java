
package SiGeCor.CapaDeDatos;

public class proveedor {
    private Long cuitProveedor=null;
    private String nombreProveedor;
    private String direccionProveedor;
    private int telefonoProveedor;
    private boolean estadoProveedor;

    public proveedor(String nombreProveedor, String direccionProveedor, int telefonoProveedor, boolean estadoProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.estadoProveedor = estadoProveedor;
    }

    public proveedor() {
        this.nombreProveedor="";
        this.direccionProveedor="";
        this.telefonoProveedor=0;
        this.estadoProveedor=false;
    }

    public Long getCuitProveedor() {
        return cuitProveedor;
    }

    public void setCuitProveedor(Long cuitProveedor) {
        this.cuitProveedor = cuitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public boolean isEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(boolean estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    @Override
    public String toString() {
        return "proveedor{" + "cuitProveedor=" + cuitProveedor + ", nombreProveedor=" + nombreProveedor + ", direccionProveedor=" + direccionProveedor + ", telefonoProveedor=" + telefonoProveedor + ", estadoProveedor=" + estadoProveedor + '}';
    }
    
     
}

