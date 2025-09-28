package CondicionalSwitchGrupo2;

import java.util.Scanner;

public class VocalSwitch {

    public static void ejecutar(Scanner sc){

        System.out.println("Ingrese una letra");
        String texto = sc.next();
        char letra = Character.toLowerCase(texto.charAt(0));

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println("El valor ingresado es una vocal");
                break;
            default:
                System.out.println("No es una vocal");





        }

    }
}
