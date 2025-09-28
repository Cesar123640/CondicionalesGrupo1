package CondicionalSwitchGrupo2;

import javax.swing.*;
import java.util.Scanner;

public class BancoSwitch {

    public static void ejecutar(Scanner sc) {

        double saldo = 1000;
        int opcion;

        do {
            System.out.println("Menu que desea realizar? ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. retirar ");
            System.out.println("4. salir");
            System.out.println("5. Elija una opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que va depositar");
                    double deposito = sc.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Deposito realizado saldo: " + saldo);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que va retirar");
                    double retiro = sc.nextDouble();
                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Retiro realizado nuevo saldo: " + saldo);
                    } else {
                        System.out.println("No tiene suficiente saldo");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo....");
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println();

        } while (opcion != 4);
    }
}
