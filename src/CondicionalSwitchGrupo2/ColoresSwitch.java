package CondicionalSwitchGrupo2;

import java.util.Scanner;

public class ColoresSwitch {

    public static void ejecutar(Scanner sc){


        System.out.println("Ingrese un color:  Rojo,verde,azul");
        String color = sc.nextLine().toLowerCase();

        switch (color) {
            case "rojo":
                System.out.println("Color primario de la luz rojo");
                break;
            case "verde":
                System.out.println("Color primario de la luz verde");
                break;
            case "azul":
                System.out.println("Color primario de la luz azul");
                break;
            default:
                System.out.println("No es uno de los colores primarios seleccionados");


        }
    }
}
