package modelos;

public class Torre  extends Ficha{

    public Torre() {
    }

    public Torre(int x, int y, String tipo) {
        super(x, y, tipo);
    }

    @Override
    public void proxMov(int x, int y) {
        if (x <= 8 && x >= 1 && x != super.getX() && y == super.getY()) {
            super.setX(x);
        } else if (y <= 8 && y >= 1 && y != super.getX() && x == super.getX()) {
            super.setY(y);
        }else{
            System.out.println("\nEl movimiento no se puede realizar");
        }
    }
}
