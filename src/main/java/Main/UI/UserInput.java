package Main.UI;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);
    private static String usersName;

    public static String getUsersName() {
        return usersName;
    }

    public static String promptForUsersName() {
        System.out.println("What is your name?");
        usersName = scanner.nextLine();
        return usersName;
    }


    public static String getMainMenuOptions() {                             //Need to add a check if they entered an incorrect value
        System.out.println("What would you like to do " + usersName + "?");
        String mainMenuInputChoice = scanner.nextLine().trim();
        return mainMenuInputChoice;
    }

    public static String checkAdvantage() {

        System.out.println("For this ability check, do you have...");       //Need to add a check if they enter an incorrect value
        System.out.println("(A)dvantage");
        System.out.println("(D)isadvantage");
        System.out.println("(N)either");

        String checkAdvantage = scanner.nextLine().trim().toUpperCase();
        if (checkAdvantage != "A" && checkAdvantage != "D" && checkAdvantage != "N") {
            System.err.println("Please choose one of the valid listed options");
            checkAdvantage = "";
        }
        return checkAdvantage;
    }

    public static Integer getAttackRollDieSize() {
        boolean isDieSizeMenu = true;
        Integer usableDieSize = 0;

        System.out.println("What size die would you like to roll?");
        while (usableDieSize == 0) {

        System.out.println("Valid damage die sizes: d2, d4, d6, d8, d10, d12");
        System.out.print("d");


            String dieSize = scanner.nextLine();
            usableDieSize = Integer.parseInt(dieSize);

            if (usableDieSize != 2 && usableDieSize != 4 && usableDieSize != 6 && usableDieSize != 8 && usableDieSize != 10 && usableDieSize != 12) { //breaks on 7
                System.err.println("Invalid Attack Roll Dice Size. Please enter a valid die size");         //Need to fix this. Keeps printing in middle of new prompt
                                                                                                            //Not stopping here, moves onto dice amount
            }
        }return usableDieSize;
    }
    public static Integer getAttackRollDiceAmount() {
        boolean isDiceAmountMenu = true;
        Integer usableNumberOfDice = 0;

        while (isDiceAmountMenu) {
            System.out.println("How many dice would you like to roll?");
            String numberOfDice = scanner.nextLine();
            usableNumberOfDice = Integer.parseInt(numberOfDice);
            if (usableNumberOfDice <= 0) {
                System.err.println("Invalid Attack Roll Dice Amount. Please enter a valid dice amount");
            } else {

            }
            isDiceAmountMenu = false;
        }return usableNumberOfDice;
    }

    public static Integer getSavingThrowDC() {
        System.out.println("What is the Saving Throw DC?");
        String saveDC = scanner.nextLine();
        Integer usableSaveDC = Integer.parseInt(saveDC);
        return usableSaveDC;
    }

    public static Integer getTableSize() {
        System.out.println("How many entries are on your table?");
        String tableSize = scanner.nextLine();
        Integer usableTableSize = Integer.parseInt(tableSize);
        return usableTableSize;
    }

    public static void pause() {
        System.out.println("Please Press Enter to Continue...");
        scanner.nextLine();
    }
}
