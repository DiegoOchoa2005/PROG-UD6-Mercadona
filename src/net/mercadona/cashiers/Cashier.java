package net.mercadona.cashiers;

import java.util.LinkedList;
import java.util.Queue;

import net.mercadona.customers.Customer;

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
            System.out.println("ERROR: No se pudo cerrar la caja.\nMOTIVO: hay clientes esperando en la fila.");
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
            System.out.println("ERROR: No se pudo añadir al cliente.\nMOTIVO: La caja esta cerrada.");
        }
    }

    public void serveClient() {
        if (this.customerQueue.size() != 0) {
            System.out.println("Se ha atendido a " + this.customerQueue.poll());
        } else {
            System.out.println("ERROR: No se pudo atender al cliente.\nMOTIVO: No hay clientes en fila.");
        }
    }

    private String showCustomer() {
        if (this.customerQueue.size() != 0) {
            Queue<Customer> customerList = new LinkedList<>();
            customerList.addAll(customerQueue);
            String customerName = "";

            for (int i = 0; i < customerQueue.size(); i++) {
                customerName += "\tCliente Nº " + (i + 1) + ":\n" + customerList.poll() + "\n";
            }
            
            return customerName;
        } else {
            return "\tNo hay clientes esperando";
        }
    }

    public void viewPendingClients() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "===================================\n" +
                "* Número de caja:" + this.cashierBoxNum + "\n" +
                "* Total de clientes:" + this.totalCustomers + "\n" +
                "* Clientes en la fila:\n" + "\n" + this.showCustomer() +
                "\n===================================\n";
    }
}
