package coffeeMachineSimulator;

import java.util.Scanner;

public class IngridentsNeeds {
    public int howManyCupOfCoffeeNeeds(Scanner scanner){
        System.out.println("Write how many cup of coffee you will needs");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int howManyWaterNeeds(int cupOfCoffee){
        return cupOfCoffee * 200;
    }

    public int howManyMilkNeeds(int cupOfCoffee){
        return cupOfCoffee * 50;
    }

    public int howManyBeansNeeds(int cupOfCoffee){
        return cupOfCoffee * 15;
    }

    public void displayNeeds(int water, int milk, int beans){
        System.out.println(water +" ml of water needs");
        System.out.println(milk +" ml of milk needs");
        System.out.println(beans +" g of beans needs");
        System.out.println();
    }

    public void displayCoffeeReady(){
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
}



