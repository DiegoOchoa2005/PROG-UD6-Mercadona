package net.mercadona.customers;

import java.util.Stack;

import net.mercadona.datainfo.RandomGenerator;

public class Customer {
    private String name;
    private String dni;
    private String phoneNum;
    private String bloodType;
    private boolean isLatam;

    private Stack<String> shoppingBasket = new Stack<>();

    public Customer() {
        this.name = RandomGenerator.generateRandomName();
        this.dni = RandomGenerator.generateRandomDni();
        this.phoneNum = RandomGenerator.generateRandomPhoneNum();
        this.bloodType = RandomGenerator.generateRandomBloodType();
        this.isLatam = RandomGenerator.isLatam();
    }

    public void fillBasket() {
        int numOfProducts = (int) (Math.random() * (20 - 2) + 2);

        for (int i = 0; i < numOfProducts; i++) {
            shoppingBasket.push(RandomGenerator.randomProduct());
        }
    }

    private String showProducts() {
        if (this.shoppingBasket.size() != 0) {
            String productName = "";
            for (int i = 0; i < shoppingBasket.size(); i++) {
                productName += "\tNombre del producto Nº" + (i + 1) + ": " + this.shoppingBasket.get(i) + "\n";
            }
            return productName;
        } else {
            return "\tNo hay productos en la cesta.";
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String confirmLatam = this.isLatam ? "si, por desgracia" : "no, se salva";
        return "===================================\n" +
                "* Nombre:" + this.name + "\n" +
                "* DNI:" + this.dni + "\n" +
                "* Numero de telefono:" + this.phoneNum + "\n" +
                "* Tipo de sangre:" + this.bloodType + "\n" +
                "* ¿Es latino?:" + confirmLatam + "\n" +
                "* Total de productos:" + shoppingBasket.size() + "\n" +
                "* Lista de articulos en la cesta:\n" + this.showProducts() +
                "\n===================================\n";
    }

}
