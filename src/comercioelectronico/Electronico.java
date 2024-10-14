package comercioelectronico;

public class Electronico extends Producto {
    private String marca;
    private int garantiaMeses;

    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
    
    
    public void extenderGarantia(int mesesExtra){
        this.garantiaMeses += mesesExtra;
    }
    
}
