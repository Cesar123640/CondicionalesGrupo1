package CondicionalSwitchGrupo2;

import CondicionalesGrupo1.DiasDeLaSemana;
import CondicionalesGrupo1.NumeroRomanoSwitch;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {

            System.out.println("==== MENU EJERCICIOS DE CONDICIONALES SWITCH (1-7) GRUPO #2 =====");
            System.out.println("1. Dias de la semana");
            System.out.println("2. Meses del año");
            System.out.println("3. Definir si es vocal");
            System.out.println("4. Colores primarios");
            System.out.println("5. Adoptar mascota");
            System.out.println("6. Consultar/ depositar/ retirar");
            System.out.println("7. Numero a romano");
            System.out.println("0. salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    DiasDeLaSemanaSwitch.ejecutar(teclado);
                    break;
                case 2:
                    MesesDelAñoSwitch.ejecutar(teclado);
                    break;
                case 3:
                    VocalSwitch.ejecutar(teclado);
                    break;
                case 4:
                    ColoresSwitch.ejecutar(teclado);
                    break;
                case 5:
                    AdoptarSwitch.ejecutar(teclado);
                    break;
                case 6:
                    BancoSwitch.ejecutar(teclado);
                    break;
                case 7:
                    NumeroRomanoSwitch.ejecutar(teclado);
                    break;
                case 0:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();

        } while (opcion != 0);

    }
}

