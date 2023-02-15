package Main.application;

import Main.UI.UserInput;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class DiceSet {

    private static Random randomizer = new Random();                    //I don't think I like these being static, it would affect all dice tray objects (not that it matters since its only open once at a time?)

    public static int attackRoll(Integer dieSize, Integer inputNumberOfDice) {          //careful of static         typed in 4
        int rollSum = 0;
        int dieCounter = 1;
        while (dieCounter <= inputNumberOfDice) {
            //rollSum += randomizer.nextInt(dieSize) + 1;
            int currentRoll = randomizer.nextInt(dieSize) + 1;
            System.out.println("Roll " + dieCounter + ": " + currentRoll);
            rollSum += currentRoll;
            dieCounter++;
        }
        return rollSum;
    }

    public static String savingThrow(int saveDC) {
        System.out.println("Save DC: " + saveDC);
        int savingThrow = randomizer.nextInt(20) + 1;
        System.out.println("Saving Throw: " + savingThrow);
        if (savingThrow >= saveDC) {
            return  "Awesome! You succeeded the Save!";
        } else {
            return "Oh No! You failed the Save!";
        }
    }

    public static int deathSavingThrow () {
        int deathSavingThrowRoll = randomizer.nextInt(20) + 1;
        System.out.println(deathSavingThrowRoll);

        if (deathSavingThrowRoll == 1) {
            System.out.println("Yikes! You failed two death saving throws!");
        }
        else if (deathSavingThrowRoll == 20) {
            System.out.println("Awesome! You're Conscious with 1 HP!");
        }
        else if (deathSavingThrowRoll <= 10 && deathSavingThrowRoll >= 2) {
            System.out.println("Uh Oh! You failed this death saving throw!");
        } else if (deathSavingThrowRoll <= 19 && deathSavingThrowRoll >= 11) {
            System.out.println("Yeah! You succeeded this death saving throw!");
        }
        return deathSavingThrowRoll;
    }

    public static int abilityCheck(boolean advantageCheck, boolean disadvantageCheck) {
        boolean hasAdvantage = advantageCheck;
        boolean hasDisadvantage = disadvantageCheck;

        int firstRoll = randomizer.nextInt(20) + 1;
        System.out.println("Roll: " + firstRoll);
        int secondRoll = randomizer.nextInt(20) + 1;

        if (hasAdvantage) {
            System.out.println("Additional Roll: " + secondRoll);
            if (firstRoll >= secondRoll) {
                return firstRoll;
            } else {

                return secondRoll;
            }
        } else if (hasDisadvantage) {
            System.out.println("Additional Roll: " + secondRoll);
            if (firstRoll <= secondRoll) {
                return firstRoll;
            } else {
                return secondRoll;
            }
        }
        return firstRoll;
    }

    public static Integer tableRoll(int tableSize) {
        int rollOnTable = randomizer.nextInt(tableSize) + 1;
        return rollOnTable;
    }

}


