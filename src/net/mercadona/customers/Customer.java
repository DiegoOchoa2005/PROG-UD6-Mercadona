package net.mercadona.customers;

import java.util.Stack;

import net.mercadona.datainfo.RandomElements;

public class Customer {
    private String name;
    private String dni;
    private String phoneNum;
    private String bloodType;
    private boolean isLatam;

    private Stack<String> shoppingBasket = new Stack<>();

    public Customer(String dni, String phoneNum, String bloodType, boolean isLatam) {
        this.name = this.saveName();
        this.dni = dni;
        this.phoneNum = phoneNum;
        this.bloodType = bloodType;
        this.isLatam = isLatam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isLatam() {
        return this.isLatam;
    }

    public void setLatam(boolean isLatam) {
        this.isLatam = isLatam;
    }

    public void fillBasket() {
        int numOfProducts = (int) (Math.random() * (20 - 2) + 2);

        for (int i = 0; i < numOfProducts; i++) {
            shoppingBasket.push(RandomElements.randomProduct());
        }
    }

    private String saveName() {
        return RandomElements.randomName();
    }

}
