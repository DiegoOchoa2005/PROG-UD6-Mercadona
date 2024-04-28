package net.mercadona.customers;

import java.util.Stack;

import net.mercadona.datainfo.RandomElements;

public class Customer {
    private String name;
    private String dni;
    private String phoneNum;
    private String bloodType;
    private boolean isLatam;

    private String[] bloodTypes = { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" };

    private Stack<String> shoppingBasket = new Stack<>();

    public Customer() {
        this.name = this.randomCustomerName();
        this.dni = this.getDni();
        this.phoneNum = this.getPhoneNum();
        this.bloodType = this.getBloodType();
        this.isLatam = this.isLatam();
    }

    public void fillBasket() {
        int numOfProducts = (int) (Math.random() * (20 - 2) + 2);

        for (int i = 0; i < numOfProducts; i++) {
            shoppingBasket.push(RandomElements.randomProduct());
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

    private String randomCustomerName() {
        return RandomElements.randomName();
    }

    private String getDni() {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numDni = (int) (Math.random() * (90000000 - 10000000) + 10000000);
        int rest = numDni % 23;
        String letraDni = String.valueOf(letters.charAt(rest));

        return numDni + letraDni;
    }

    private String getPhoneNum() {
        String numPhone = String.valueOf((int) (Math.random() * (699999999 - 600000000) + 600000000));
        return "+34 " + numPhone;
    }

    private String getBloodType() {
        int bloodSelected = (int) (Math.random() * (bloodTypes.length + 1) - 1);
        return bloodTypes[bloodSelected];
    }

    // Estoy practicando pa' trabajar en el tranvia
    public boolean isLatam() {
        int latamSelector = (int) (Math.random() * (10 - 1) + 1);
        return latamSelector == 1 ? true : false;
    }

    @Override
    public String toString() {
        String confirmLatam = this.isLatam == true ? "si, por desgracia" : "no, se salva";
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
