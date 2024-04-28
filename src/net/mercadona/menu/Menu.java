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
        if (userOption.equals("1")) {
            cashier.openBox();
        } else if (userOption.equals("2")) {
            cashier.addClientToQueue();
        } else if (userOption.equals("3")) {
            cashier.serveClient();
        } else if (userOption.equals("4")) {
            cashier.viewPendingClients();
        } else if (userOption.equals("5")) {
            if (cashier.closeBox()) {
            } else {
                keepAsking = false;
            }
        } else {
            System.out.println("Opción invalida.");
        }
    }
}
