package modelos;

public abstract class Ficha {

    private int x, y;
    private boolean vivo;

    public Ficha(){}

    public Ficha(int x, int y) {
        this.x = x;
        this.y = y;
        this.vivo = vivo;
    }

    public abstract void proxMov(int x, int y);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
