package coffeeMachineSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Estimate the coffee machine has
//        EstimateTheNumberOfServing estimateTheNumberOfServing = new EstimateTheNumberOfServing();
        int waterEstimate = 400;
        int milkEstimate = 540;
        int beansEstimate = 120;
//        int cupOfCoffeeMakeByMachine = estimateTheNumberOfServing.cupOfCoffeeMakeByMachine(waterEstimate, milkEstimate, beansEstimate);
        int disposalCup = 9;
        int money = 550;
        int clean = 0;
//        Main Function of Coffe Machine

        while(true) {

            MainFunctionByMachine mainFunctionByMachine = new MainFunctionByMachine();
//        mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
            String actionPerform = mainFunctionByMachine.checkToPerformAction(scanner);

            switch (actionPerform) {
                case "buy":
                    if(clean < 10) {
                        int chooseCoffee = mainFunctionByMachine.buy(scanner);

                        switch (chooseCoffee) {
                            case 1:

                                if (waterEstimate >= 250 && beansEstimate >= 16) {
                                    waterEstimate = mainFunctionByMachine.espressoToMakeWater(waterEstimate);
                                    beansEstimate = mainFunctionByMachine.espressoToMakeBeans(beansEstimate);
                                    money = mainFunctionByMachine.espressoToMakeMoney(money);
                                    disposalCup = mainFunctionByMachine.coffeeToMakeDisposal(disposalCup);
//                            mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                                    IngridentsNeeds ingridentsNeeds = new IngridentsNeeds();
                                    ingridentsNeeds.displayCoffeeReady();
                                    clean += 1;
                                } else {
                                    System.out.println("No ingridents to make a coffee");
                                }
                                break;

                            case 2:
                                if (waterEstimate >= 350 && milkEstimate >= 75 && beansEstimate >= 20) {
                                    waterEstimate = mainFunctionByMachine.latteToMakeWater(waterEstimate);
                                    milkEstimate = mainFunctionByMachine.latteToMakeMilk(milkEstimate);
                                    beansEstimate = mainFunctionByMachine.latteToMakeBeans(beansEstimate);
                                    disposalCup = mainFunctionByMachine.coffeeToMakeDisposal(disposalCup);
                                    money = mainFunctionByMachine.latteToMakeMoney(money);
                                    IngridentsNeeds ingridentsNeeds = new IngridentsNeeds();
                                    ingridentsNeeds.displayCoffeeReady();
//                            mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                                    clean += 1;
                                } else {
                                    System.out.println("No ingridents to make a coffee");
                                }
                                break;

                            case 3:
                                if (waterEstimate >= 200 && milkEstimate >= 100 && beansEstimate >= 12) {
                                    waterEstimate = mainFunctionByMachine.cappuccionToMakeWater(waterEstimate);
                                    milkEstimate = mainFunctionByMachine.cappuccionToMakeMilk(milkEstimate);
                                    beansEstimate = mainFunctionByMachine.cappuccionToMakeBeans(beansEstimate);
                                    disposalCup = mainFunctionByMachine.coffeeToMakeDisposal(disposalCup);
                                    money = mainFunctionByMachine.cappuccionToMakeMoney(money);
                                    IngridentsNeeds ingridentsNeeds = new IngridentsNeeds();
                                    ingridentsNeeds.displayCoffeeReady();
                                    clean += 1;
//                            mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                                } else {
                                    System.out.println("No ingridents to make a coffee");
                                }
                                break;

                            default:
                                System.out.println("Invalid Option.");

                        }
                        break;
                    }else {
                        System.out.println("I need cleaning");
                        break;
                    }

                case "fill":
                    EstimateTheNumberOfServing estimateTheNumberOfServing = new EstimateTheNumberOfServing();
                    waterEstimate += estimateTheNumberOfServing.howManyWaterCoffeeMachine(scanner);
                    milkEstimate += estimateTheNumberOfServing.howManyMilkCoffeeMachine(scanner);
                    beansEstimate += estimateTheNumberOfServing.howManyBeansCoffeeMachine(scanner);
                    disposalCup += estimateTheNumberOfServing.howManyDisposalCupOfCoffeeAdded(scanner);
//                    mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                    break;

                case "take":
                    money = mainFunctionByMachine.take(money);
//                    mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                    break;

                case "clean":
                    clean = 0;
                    System.out.println("I have cleaned");
                    break;

                case "remaning" :
                    mainFunctionByMachine.theCoffeeMachineHas(waterEstimate, milkEstimate, beansEstimate, disposalCup, money);
                    break;

                case "exit" :
                    return;

                default:
                    System.out.print("Invalid Option");
            }

//        Ingridents Needs to Making a multiple cup of coffee
//        IngridentsNeeds ingridentsNeeds = new IngridentsNeeds();
//        int cupOfCoffee = ingridentsNeeds.howManyCupOfCoffeeNeeds(scanner);
//        System.out.println("For "+ cupOfCoffee +" cups of coffee you will need:");
//        int waterNeeds = ingridentsNeeds.howManyWaterNeeds(cupOfCoffee);
//        int milkNeeds = ingridentsNeeds.howManyMilkNeeds(cupOfCoffee);
//        int beansNeeds = ingridentsNeeds.howManyBeansNeeds(cupOfCoffee);
//        ingridentsNeeds.displayNeeds(waterNeeds, milkNeeds, beansNeeds);

//        Checking the cup of coffee make by machine
//        estimateTheNumberOfServing.displayTheCupOfCoffeeMakeByMachine(cupOfCoffeeMakeByMachine, cupOfCoffee);

//            scanner.close();
        }
        //        Starting to making a coffee

    }
}