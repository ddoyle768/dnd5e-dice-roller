package Main.UI;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class UserOutput {


    public static void displayWelcomeMessage () {
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Welcome to the D&D 5e Dice Roller 1.0");
        System.out.println("*** " + UserInput.getUsersName() + "! ***");
        System.out.println("*************************************");
        System.out.println();
    }

    public static void displayMainMenuOptions () {
        System.out.println("1) Ability Check");
        System.out.println("2) Attack Roll");
        System.out.println("3) Saving Throw");
        System.out.println("4) Death Saving Throw");
        System.out.println("5) Table Roll");
        System.out.println("6) Exit");
    }


}
