package modelos;

import java.util.ArrayList;

public class Tablero {

    private Ficha casillas[][];
    private char col[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private ArrayList<Peon> peonesBlancas;
    private ArrayList<Peon> peonesNegras;
    private ArrayList<Torre> torresBlancas;
    private ArrayList<Torre> torresNegras;
    private ArrayList<Alfil> alfilesBlancas;
    private ArrayList<Alfil> alfilesNegras;
    private ArrayList<Caballo> caballosBlancas;
    private ArrayList<Caballo> caballosNegras;
    private Reina reinaBlancas;
    private Reina reinaNegras;
    private Rey reyBlancas;
    private Rey reyNegras;

    public Tablero() {
        this.casillas = new Ficha[8][8];
    }

    public void crearFichas(){
        this.peonesBlancas = crearPeones(1);
        this.peonesNegras = crearPeones(6);
        this.torresBlancas = crearTorres(0);
        this.torresNegras = crearTorres(7);
        this.alfilesBlancas = crearAlfil(0);
        this.alfilesNegras = crearAlfil(7);
        this.caballosBlancas = crearCaballos(0);
        this.caballosNegras = crearCaballos(7);
        this.reinaBlancas = new Reina(3, 0, "Q");
        this.reinaNegras = new Reina(3, 7, "Q");
        this.reyBlancas = new Rey(4, 0, "K");
        this.reyNegras = new Rey(4, 7, "K");
    }

    public void colocarFichas(){
        for (Peon peon : this.peonesBlancas) {
            this.casillas[peon.getY()][peon.getX()] = peon;
        }

        for (Peon peon : this.peonesNegras) {
            this.casillas[peon.getY()][peon.getX()] = peon;
        }

        for (Torre torre : this.torresBlancas){
            this.casillas[torre.getY()][torre.getX()] = torre;
        }

        for (Torre torre : this.torresNegras){
            this.casillas[torre.getY()][torre.getX()] = torre;
        }

        for (Alfil alfil : this.alfilesBlancas){
            this.casillas[alfil.getY()][alfil.getX()] = alfil;
        }
        for (Alfil alfil : this.alfilesNegras){
            this.casillas[alfil.getY()][alfil.getX()] = alfil;
        }

        for (Caballo caballo : this.caballosBlancas){
            this.casillas[caballo.getY()][caballo.getX()] = caballo;
        }
        for (Caballo caballo : this.caballosNegras){
            this.casillas[caballo.getY()][caballo.getX()] = caballo;
        }

        this.casillas[this.reinaBlancas.getY()][this.reinaBlancas.getX()] = this.reinaBlancas;
        this.casillas[this.reinaNegras.getY()][this.reinaNegras.getX()] = this.reinaNegras;

        this.casillas[this.reyBlancas.getY()][this.reyBlancas.getX()] = this.reyBlancas;
        this.casillas[this.reyNegras.getY()][this.reyNegras.getX()] = this.reyNegras;

    }

    public void moverFicha(Ficha ficha){

    }

    public void mostrarFichas(){
        for (int i = 0; i < this.casillas.length; i++) {
            for (Ficha ficha : this.casillas[i]) {
                if (ficha == null)
                    System.out.print(" V");
                else
                    System.out.printf(" %s", ficha.getTipo());
            }
            System.out.println();
        }
    }

    private ArrayList<Peon> crearPeones(int fila){
        ArrayList<Peon> peones = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            peones.add(new Peon(i, fila, "P"));
        }
        return peones;
    }

    private ArrayList<Torre> crearTorres(int fila){
        ArrayList<Torre> torres = new ArrayList<>();
        torres.add(new Torre(0, fila, "T"));
        torres.add(new Torre(7, fila, "T"));
        return torres;
    }

    private ArrayList<Alfil> crearAlfil(int fila){
        ArrayList<Alfil> alfiles = new ArrayList<>();
        alfiles.add(new Alfil(2, fila, "A"));
        alfiles.add(new Alfil(5, fila, "A"));
        return alfiles;
    }

    private ArrayList<Caballo> crearCaballos(int fila){
        ArrayList<Caballo> caballos = new ArrayList<>();
        caballos.add(new Caballo(1, fila, "C"));
        caballos.add(new Caballo(6, fila, "C"));
        return caballos;
    }

    public Ficha[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Ficha[][] casillas) {
        this.casillas = casillas;
    }

    public char[] getCol() {
        return col;
    }

    public void setCol(char[] col) {
        this.col = col;
    }
}
