package net.mercadona.menu;

import net.mercadona.cashiers.Cashier;

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
        System.out.println("""
                1. Abrir caja
                2. Añadir un nuevo cliente a la cola
                3. Atender un cliente
                4. Ver clientes pendientes
                5. Cerrar supermercado
                """);
    }

    public static void optionMenu(String userOption) {
        switch (userOption) {
            case "1":
                cashier.openBox();
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
                    System.out.println("ERROR: No se pudo cerrar la caja.\nMOTIVO: hay clientes esperando en la fila.");
                } else {
                    keepAsking = false;
                }
                break;

            default:
                System.out.println("Opción invalida.");
                break;
        }
    }
}
