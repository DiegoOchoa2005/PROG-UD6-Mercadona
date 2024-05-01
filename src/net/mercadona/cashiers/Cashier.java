package net.mercadona.cashiers;

import java.util.LinkedList;
import java.util.Queue;

import net.mercadona.customers.Customer;
import net.mercadona.decorationstuff.ConsoleColors;

public class Cashier {
    private int cashierBoxNum = 1;
    private int totalCustomers = 0;
    private boolean isBoxOpen = false;
    private Queue<Customer> customerQueue = new LinkedList<Customer>();

    public boolean openBox() {
        return this.isBoxOpen = true;
    }

    public boolean closeBox() {
        if (customerQueue.size() != 0) {
            return this.isBoxOpen = true;
        } else {
            return this.isBoxOpen = false;
        }
    }

    public void addClientToQueue() {
        if (isBoxOpen) {
            Customer newCustomer = new Customer();
            newCustomer.fillBasket();
            this.customerQueue.add(newCustomer);
            this.totalCustomers++;
        } else {
            System.out.println(ConsoleColors.changeToBoldRed("\nERROR: No se pudo añadir al cliente.") +
            ConsoleColors.changeToBoldOrange("\nMOTIVO: ") + 
            ConsoleColors.changeToYellow("La caja esta cerrada.\n"));
        }
    }

    public void serveClient() {
        if (this.customerQueue.size() != 0) {
            System.out.println(ConsoleColors.changeToBoldGreen("\nOperación exitosa ") + 
            ConsoleColors.changeToYellow("\nSe ha atendido a ") + 
            ConsoleColors.getAnsiOrange() + this.customerQueue.poll().getName() + ConsoleColors.getAnsiReset());
        } else {
            System.out.println(ConsoleColors.changeToBoldRed("\nERROR: No se pudo atender al cliente.") +
            ConsoleColors.changeToBoldOrange("\nMOTIVO: ") + 
            ConsoleColors.changeToYellow("No hay clientes en fila.\n"));
        }
    }

    private String showCustomer() {
        if (this.customerQueue.size() != 0) {
            Queue<Customer> customerList = new LinkedList<>();
            customerList.addAll(customerQueue);
            String customerName = "";

            for (int i = 0; i < customerQueue.size(); i++) {
                customerName += ConsoleColors.changeToYellow("\t Cliente Nº ") + 
                ConsoleColors.getAnsiYellow() + (i + 1) + ":\n" + ConsoleColors.getAnsiReset() + customerList.poll() + "\n";
            }

            return customerName;
        } else {
            return ConsoleColors.changeToYellow("\tNo hay clientes esperando\n");
        }
    }

    public void viewPendingClients() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return ConsoleColors.changeToBoldBlue("===================================\n") +
                ConsoleColors.changeToCyan("* Número de caja: ") + 
                ConsoleColors.getAnsiGreen() + this.cashierBoxNum + ConsoleColors.getAnsiReset() + "\n" +

                ConsoleColors.changeToCyan("* Total de clientes: ") + 
                ConsoleColors.getAnsiGreen() + this.totalCustomers + ConsoleColors.getAnsiReset() + "\n" +

                ConsoleColors.changeToCyan("* Clientes en la fila:\n") + "\n" + this.showCustomer() +

                ConsoleColors.changeToBoldBlue("===================================\n");
    }
}
