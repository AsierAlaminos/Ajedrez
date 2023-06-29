package modelos;

public class Alfil  extends Ficha{

    public Alfil() {
    }

    public Alfil(int x, int y, String tipo) {
        super(x, y, tipo);
    }

    @Override
    public void proxMov(int x, int y) {
        if ((x != super.getX() && y != super.getY()) && (x >= 1 && x <= 8 && y >= 1 && y <= 8)){
            if (x - super.getX() == y - super.getY())
                super.setX(x);
                super.setY(y);
        }
    }
}
