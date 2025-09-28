package CondicionalSwitchGrupo2;

import javax.swing.*;
import java.util.Scanner;

public class AdoptarSwitch {

    public static void ejecutar(Scanner sc){

        System.out.println("MENU DE LAS MASCOTAS");
        System.out.println("1. perro");
        System.out.println("2. Gato");
        System.out.println("3. Conejo");
        System.out.println("Elija una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has adoptado un perro");
                break;
            case 2:
                System.out.println("Has adoptado un gato");
                break;
            case 3:
                System.out.println("Has adoptado un conejo");
                break;
            default:
                System.out.println("Opcion invalida. ");

        }




    }
}
