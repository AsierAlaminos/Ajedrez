import modelos.Tablero;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.crearFichas();
        tablero.colocarFichas();
        tablero.mostrarFichas();
   }

}
