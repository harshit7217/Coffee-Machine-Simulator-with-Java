package coffeeMachineSimulator;

import java.util.Scanner;

public class MainFunctionByMachine {
    public void theCoffeeMachineHas(int water, int milk, int beans, int disposalCups, int money){
        System.out.println("The coffee machine has:");
        System.out.println(water +" ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of beans");
        System.out.println(disposalCups + " disposal cups");
        System.out.println("$ "+ money +" of money");
    }

    public String checkToPerformAction(Scanner scanner){
        System.out.println();
        System.out.println("Write action (buy, fill, take, clean, remaning, exit):");
        System.out.print(" > ");
        return scanner.next();
    }

    public int buy(Scanner scanner){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccion:");
        System.out.print(" > ");
        return scanner.nextInt();
    }

    public int espressoToMakeWater(int water){
        return water - 250;
    }

    public int espressoToMakeBeans(int beans){
        return beans - 16;
    }

    public int coffeeToMakeDisposal(int disposal){
        return disposal - 1;
    }

    public int espressoToMakeMoney(int money){
        return money + 4;
    }

    public int latteToMakeWater(int water){
        return water - 350;
    }

    public int latteToMakeMilk(int milk){
        return milk - 75;
    }

    public int latteToMakeBeans(int beans){
        return beans - 20;
    }

    public int latteToMakeMoney(int money){
        return money + 7;
    }

    public int cappuccionToMakeWater(int water){
        return water - 200;
    }

    public int cappuccionToMakeMilk(int milk){
        return milk - 100;
    }

    public int cappuccionToMakeBeans(int beans){
        return beans - 12;
    }

    public int cappuccionToMakeMoney(int money){
        return money + 6;
    }

    public int take(int money){
        System.out.println("I gave you $ "+ money);
        System.out.println();
        return 0;
    }
}
