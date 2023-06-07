package modelos;

public abstract class Ficha {

    private String posicion;
    private boolean vivo;

    public Ficha(){}

    public Ficha(String posicion) {
        this.posicion = posicion;
        this.vivo = true;
    }

    public abstract void proxMov(String mov);

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
