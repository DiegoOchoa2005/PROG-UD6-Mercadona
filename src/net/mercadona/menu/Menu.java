package net.mercadona.menu;

import net.mercadona.cashiers.Cashier;
import net.mercadona.decorationstuff.ConsoleColors;

public class Menu {
    private static boolean keepAsking;
    private static Cashier cashier = new Cashier();

    public static void setKeepAsking(boolean isKeepAsking) {
        keepAsking = true;
    }

    public static boolean getKeepAsking() {
        return keepAsking;
    }

    public static void showMainMenu() {
        String borderMenu = "**************************************";
        String optionsMenu = """
                * 1. Abrir caja
                * 2. Añadir un nuevo cliente a la cola
                * 3. Atender un cliente
                * 4. Ver clientes pendientes
                * 5. Cerrar supermercado
                """;
        System.out.println(ConsoleColors.changeToBoldRed("\n" + borderMenu + "\n") + ConsoleColors.changeToYellow(optionsMenu)
        + ConsoleColors.changeToBoldRed(borderMenu + "\n")
        );
    }

    public static void optionMenu(String userOption) {
        switch (userOption) {
            case "1":
                if (!cashier.isBoxOpen()) {
                    cashier.openBox();
                    System.out.println(ConsoleColors.changeToBoldGreen("¡Caja abierta!"));
                } else {
                    System.out.println(ConsoleColors.changeToBoldRed("¡La caja ya esta abierta!"));
                }
                break;
            case "2":
                cashier.addClientToQueue();
                break;
            case "3":
                cashier.serveClient();
                break;
            case "4":
                cashier.viewPendingClients();
                break;
            case "5":
                if (cashier.closeBox()) {
                    System.out.println(ConsoleColors.changeToBoldRed("\nERROR: No se pudo cerrar la caja.") +
                    ConsoleColors.changeToBoldOrange("\nMOTIVO: ") + 
                    ConsoleColors.changeToYellow("Hay clientes en fila.\n"));
                } else {
                    System.out.println(ConsoleColors.changeToYellow("Finalizando Programa..."));
                    System.out.println(ConsoleColors.changeToBoldGreen("¡Muchas gracias por usar nuestro menu!"));
                    keepAsking = false;
                }
                break;

            default:
                System.out.println(ConsoleColors.changeToBoldRed("\nERROR: Opción inválida."));
                break;
        }
    }
}
