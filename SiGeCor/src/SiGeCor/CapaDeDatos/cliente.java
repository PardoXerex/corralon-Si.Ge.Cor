package SiGeCor.CapaDeDatos;


public class cliente {    
    private Long dniCliente=null;
    private String nombreCliente;
    private String direccionCliente;
    private boolean estadoClie;
    
    public cliente(String nombreCliente, String direccionCliente, boolean estadoClie) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.estadoClie = estadoClie;
    }

    public cliente() {
        this.direccionCliente="";
        this.nombreCliente="";
        this.estadoClie=false;
    }
    
    public Long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public boolean isEstadoClie() {
        return estadoClie;
    }

    public void setEstadoClie(boolean estadoClie) {
        this.estadoClie = estadoClie;
    }

    @Override
    public String toString() {
        return "cliente{" + "cuitCliente=" + dniCliente + ", razonSocial=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", estadoClie=" + estadoClie + '}';
    }
        
    
}
