package Ejercicio2.Clases;

public class Nota {
    /*
     * Alumnos:
     * Indicara la longitud del array, ya que dice cuantas notas=alumnos va a depositar
     * Entero
     * Modificable: SI
     * Consultable: SI
     *
     * Notas:
     * Tamaño dependera del numero de alumnos
     * Su contenido tiene que estar comprendido entre el 1 y el 10
     * Modificable: NO
     * Consultable: SI
     */

    //Atributos
    private int alumnos;
    private double[] notas;
    private double notaMedia;
    private final int NOTAMAXIMA = 10;
    private final int NOTAMINIMA = 1;

    //METODOS
    //Constructor
    public Nota() {
        alumnos = 10;
        notas = new double[alumnos];
        darNotas(notas);
        notaMedia = notaMedia();
    }

    public Nota(int alumnos) {
        this.alumnos = alumnos;
        notas = new double[alumnos];
        darNotas(notas);
        notaMedia = notaMedia();
    }

    //Nota Maxima
    public double notaMasAlta() {
        double nota = 0;
        if (notas[0] == NOTAMAXIMA) {
            nota = notas[0];
        } else {
            nota = notas[0];
            for (int i = 1; i < notas.length; i++) {
                if (nota > notas[i]) {
                    nota = notas[i];
                }
            }
        }
        return nota;
    }

    //Nota Minima
    public double notaMasBaja() {
        double nota = 0;
        if (notas[0] == NOTAMINIMA) {
            nota = notas[0];
        } else {
            nota = notas[0];
            for (int i = 1; i < notas.length; i++) {
                if (nota > notas[i]) {
                    nota = notas[i];
                }
            }
        }
        return nota;
    }

    //Nota Media
    public double notaMedia(){
        double totalNota = 0;
        for (int i = 0; i < notas.length; i++) {
            totalNota = totalNota + notas[i];
        }
        return totalNota/notas.length;
    }

    //Alumnos Eficientes
    public double alumEficiente(){
        int numEficientes = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= notaMedia){
                numEficientes++;
            }
        }
        return numEficientes;
    }

    //Alumnos Deficienetes
    public double alumDeficiente(){
        int numDeficientes = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < notaMedia){
                numDeficientes++;
            }
        }
        return numDeficientes;
    }

    //Dar Notas
    private void darNotas(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
    }

}
