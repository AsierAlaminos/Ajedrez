package modelos;

import java.util.ArrayList;

public class Tablero {

    private Object casillas[];
    private char col[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

    public Tablero() {
        this.casillas = new Object[64];
    }

    public void colocarFichas(){
        ArrayList<Peon> peonesB = crearPeones(2);
        ArrayList<Peon> peonesN = crearPeones(7);
        ArrayList<Torre> torresB = crearTorres(1);
        ArrayList<Torre> torresN = crearTorres(8);
        ArrayList<Alfil> alfilesB = crearAlfil(1);
        ArrayList<Alfil> alfilesN = crearAlfil(8);
        ArrayList<Caballo> caballosB = crearCaballos(1);
        ArrayList<Caballo> caballosN = crearCaballos(8);
        Reina reinaB = new Reina("d1");
        Reina reinaN = new Reina("d8");
        Rey reyB = new Rey("e1");
        Rey reyN = new Rey("e8");
    }

    private ArrayList<Peon> crearPeones(int fila){
        ArrayList<Peon> peones = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            peones.add(new Peon(String.format("%c%d", col[i], fila)));
        }
        return peones;
    }

    private ArrayList<Torre> crearTorres(int fila){
        ArrayList<Torre> torres = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            torres.add(new Torre(String.format("%c%d", col[i * 8], fila)));
        }
        return torres;
    }

    private ArrayList<Alfil> crearAlfil(int fila){
        ArrayList<Alfil> alfiles = new ArrayList<>();
        alfiles.add(new Alfil(String.format("%c%d", col[2], fila)));
        alfiles.add(new Alfil(String.format("%c%d", col[5], fila)));
        return alfiles;
    }

    private ArrayList<Caballo> crearCaballos(int fila){
        ArrayList<Caballo> caballos = new ArrayList<>();
        caballos.add(new Caballo(String.format("%c%d", col[1], fila)));
        caballos.add(new Caballo(String.format("%c%d", col[6], fila)));
        return caballos;
    }

    public Object[] getCasillas() {
        return casillas;
    }

    public void setCasillas(Object[] casillas) {
        this.casillas = casillas;
    }

    public char[] getCol() {
        return col;
    }

    public void setCol(char[] col) {
        this.col = col;
    }
}
