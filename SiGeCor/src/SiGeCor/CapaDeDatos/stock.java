
package SiGeCor.CapaDeDatos;


public class stock {
    private Long codMaterial=null;    
    private String nombreMaterial;
    private String descripcionMaterial;
    private int cantidadExistente;
    private int stockMinimo;
    private int stockMaximo;
    private boolean estadoMaterial;

    public stock(String nombreMaterial, String descripcionMaterial, int cantidadExistente, int stockMinimo, int stockMaximo, boolean estadoMaterial) {
        this.nombreMaterial = nombreMaterial;
        this.descripcionMaterial = descripcionMaterial;
        this.cantidadExistente = cantidadExistente;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.estadoMaterial = estadoMaterial;
    }

    public stock() {
        this.nombreMaterial = "";
        this.descripcionMaterial = "";
        this.cantidadExistente = 0;
        this.stockMinimo = 0;
        this.stockMaximo = 0;
        this.estadoMaterial = false;
    }

    public Long getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(Long codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEstadoMaterial() {
        return estadoMaterial;
    }

    public void setEstadoMaterial(boolean estadoMaterial) {
        this.estadoMaterial = estadoMaterial;
    }

    @Override
    public String toString() {
        return "stock{" + "codMaterial=" + codMaterial + ", nombreMaterial=" + nombreMaterial + ", descripcionMaterial=" + descripcionMaterial + ", cantidadExistente=" + cantidadExistente + ", stockMinimo=" + stockMinimo + ", stockMaximo=" + stockMaximo + ", estadoMaterial=" + estadoMaterial + '}';
    }
    
    
}
