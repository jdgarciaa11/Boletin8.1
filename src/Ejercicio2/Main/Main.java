package Ejercicio2.Main;

import Ejercicio2.Clases.Menu;
import Ejercicio2.Clases.Nota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nota dam = new Nota(5);
        Boolean salir = false;
        int opc;
        Scanner scan = new Scanner(System.in);
        while (!salir){
            System.out.print(Menu.menuEjer2());
            opc = scan.nextInt();
            switch (opc){
                case 1 -> System.out.println(dam.notaMasAlta());
                case 2 -> System.out.println(dam.notaMasBaja());
                case 3 -> System.out.println(dam.notaMedia());
                case 4 -> System.out.println(dam.alumEficiente());
                case 5 -> System.out.println(dam.alumDeficiente());
                case 6 -> salir = true;
                default -> throw new IllegalArgumentException("OPCION BETWEEN 1 6");
            }
        }
    }
}
