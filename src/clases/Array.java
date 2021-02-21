package clases;

public class Array {
    private int [] aleatorio;
    private int tamaño;
    public Array(){
        aleatorio = new int [tamaño];
        tamaño = 10;
        for (int i = 0; i < tamaño; i++){
            aleatorio [i] = (int) (Math.random()*100+1);
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public int[] getAleatorio() {
        return aleatorio;
    }

    public void mostrarPares() {
        int numPar = 0;
        int[] par = new int[numPar+1];
        for (int i = 0; i < getTamaño(); i++) {
            if (getAleatorio()[i] % 2 == 0) {
                par[numPar] = getAleatorio()[i];
                numPar++;
            }
        }
        for (int i = 0; i < numPar; i++){
            System.out.print(par[numPar]+" ");
        }
    }


}
