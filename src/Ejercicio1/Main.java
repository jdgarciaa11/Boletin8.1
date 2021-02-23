package Ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int []numAleatorio1 = new int [10];
//        for (int i = 0; i < numAleatorio1.length; i++){
//            numAleatorio1 [i] = (int) (Math.random()*100+1);
//        }
//        recorrerArray(numAleatorio1.length, numAleatorio1);
//        int []numPar = new int [numAleatorio1.length];
//        int par = 0;
//        for (int i = 0; i < numAleatorio1.length; i++) {
//            if (numAleatorio1[i] % 2 == 0) {
//                numPar[par] = numAleatorio1[i];
//                par++;
//            }
//        }
//        System.out.println();
//        recorrerArray(par, numPar);

//        int []numAleatorio2 = new int [20];
//        for (int i = 0; i < 20; i++){
//            numAleatorio2 [i] = (int) (Math.random()*200+100);
//            if(numAleatorio2[1] != 0){
//                if (numAleatorio2[i-1] == numAleatorio2[i]){
//                    numAleatorio2 [i] = (int) (Math.random()*200+100);
//                }
//            }
//        }
//        recorrerArray(numAleatorio2.length, numAleatorio2);

//        int []numAleatorio3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int []primos = new int [numAleatorio3.length];
//        int primo = 0;
//        for(int i = 0; i < numAleatorio3.length; i++){
//            if (isPrime(numAleatorio3[i])){
//                primos[primo] = numAleatorio3[i];
//                primo++;
//            }
//        }
//        recorrerArray(primo, primos);

//        int []numAleatorio4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int []numAleatorio4DelReves = new int [numAleatorio4.length];
//        arrayDelReves(numAleatorio4, numAleatorio4DelReves);
//        recorrerArray(numAleatorio4DelReves.length, numAleatorio4DelReves);

//        int []numAleatorio5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(posicionNumero(5,numAleatorio5));

    }

    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void recorrerArray(int longitud, int []array){
        for (int i = 0; i < longitud; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int posicionNumero(int numero, int []array){
        int resultado = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == numero){
                resultado = i;
            }
        }
        return resultado;
    }

    public static void arrayDelReves(int []arrayOrigen, int []arrayDestino){
        for(int i = 0; i < arrayOrigen.length; i++){
            arrayDestino[i] = arrayOrigen[(arrayOrigen.length-i)-1];
        }
    }

}
