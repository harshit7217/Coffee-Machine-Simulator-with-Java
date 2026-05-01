package coffeeMachineSimulator;

import java.util.Scanner;

public class EstimateTheNumberOfServing {

    public int howManyWaterCoffeeMachine(Scanner scanner){
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int howManyMilkCoffeeMachine(Scanner scanner){
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int howManyBeansCoffeeMachine(Scanner scanner){
        System.out.println("Write how many g of beans the coffee machine has:");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int howManyDisposalCupOfCoffeeAdded(Scanner scanner){
        System.out.println("Write how many disposal cup the coffee machine has:");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int cupOfCoffeeMakeByMachine(int water, int milk, int beans){
        int accordingToWater = water / 200;
        int accordingToMilk = milk / 50;
        int accordingToBeans = beans / 15;
        return Math.min(accordingToBeans, Math.min(accordingToMilk, accordingToWater));
    }

    public void displayTheCupOfCoffeeMakeByMachine(int cupOfCoffeeMakeByMachine, int cupOfCoffeeNeedsByUser){
        if(cupOfCoffeeMakeByMachine == cupOfCoffeeNeedsByUser){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(cupOfCoffeeMakeByMachine > cupOfCoffeeNeedsByUser){
            int moreCupOfCoffeeMakeByMachine = cupOfCoffeeMakeByMachine - cupOfCoffeeNeedsByUser;
            System.out.println("Yes, I can make that amount of coffee (and even "+ moreCupOfCoffeeMakeByMachine +" more than that)");
        }else {
            System.out.println("No, I can make only "+ cupOfCoffeeMakeByMachine + " cup's of Coffee");
        }
        System.out.println();
    }
}
