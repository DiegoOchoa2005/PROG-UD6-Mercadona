package net.mercadona.customers;

import java.util.Stack;

import net.mercadona.datainfo.RandomGenerator;
import net.mercadona.decorationstuff.ConsoleColors;

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
                productName += "\t\tNombre del producto Nº" + (i + 1) + ": " + this.shoppingBasket.get(i) + "\n";
            }
            return productName;
        } else {
            return ConsoleColors.changeToOrange("\tNo hay productos en la cesta.");
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String confirmLatam = this.isLatam ? ConsoleColors.changeToRed("si, por desgracia") : "no, se salva";
        return ConsoleColors.changeToBoldCyan("\t===================================\n") +
                ConsoleColors.changeToBlue("\t* Nombre: ") + ConsoleColors.getAnsiGreen() + 
                this.name + "\n" +

                ConsoleColors.changeToBlue("\t* DNI: ") + ConsoleColors.getAnsiGreen() + 
                this.dni + "\n" +

                ConsoleColors.changeToBlue("\t* Numero de telefono: ") + ConsoleColors.getAnsiGreen() + 
                this.phoneNum + "\n" +

                ConsoleColors.changeToBlue("\t* Tipo de sangre: ") + ConsoleColors.getAnsiGreen() + 
                this.bloodType + "\n" +

                ConsoleColors.changeToBlue("\t* ¿Es latino?: ") + ConsoleColors.getAnsiGreen() + 
                confirmLatam + "\n" +

                ConsoleColors.changeToBlue("\t* Total de productos: ") + ConsoleColors.getAnsiGreen() + 
                shoppingBasket.size() + "\n" +

                ConsoleColors.changeToBlue("\t* Lista de articulos en la cesta:\n") + 
                ConsoleColors.getAnsiYellow() + this.showProducts() +
                
                ConsoleColors.changeToBoldCyan("\n\t===================================\n");
    }

}
