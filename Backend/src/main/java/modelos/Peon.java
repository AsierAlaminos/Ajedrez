package modelos;

public class Peon extends Ficha{

    public Peon() {}

    public Peon(int x, int y) {
        super(x, y);
    }

    @Override
    public void proxMov(int x, int y) {
        if (x == super.getX() && y == super.getY() + 1) {
            super.setX(x);
            super.setY(y);
        }else {
            System.out.println("\nEl movimiento no se puede realizar");
        }
    }
}
