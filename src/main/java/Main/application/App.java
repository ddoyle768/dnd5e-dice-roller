package Main.application;

import Main.UI.UserInput;
import Main.UI.UserOutput;

import java.util.Scanner;

public class App {

    public void run() {
        UserInput.promptForUsersName();

        while (true) {
            UserOutput.displayWelcomeMessage();
            UserOutput.displayMainMenuOptions();
            String mainMenuChoice = UserInput.getMainMenuOptions();
            if (mainMenuChoice.equals("1")) {
                String hasAdvantageCheck = UserInput.checkAdvantage();
                if (hasAdvantageCheck.equals("A")) {
                    System.out.println(DiceSet.abilityCheck(true, false));
                } else if (hasAdvantageCheck.equals("D")) {
                    System.out.println(DiceSet.abilityCheck(false, true));
                } else if (hasAdvantageCheck.equals("N")) {
                    System.out.println(DiceSet.abilityCheck(false, false));
                }
                UserInput.pause();
            }
            if (mainMenuChoice.equals("2")) {
                System.out.println("Total Damage: " + handleAttackRoll());
                UserInput.pause();
            }
            if (mainMenuChoice.equals("3")) {
                Integer saveDC = UserInput.getSavingThrowDC();
                System.out.println(DiceSet.savingThrow(saveDC));
                UserInput.pause();
            }
            if (mainMenuChoice.equals("4")) {
                DiceSet.deathSavingThrow();
                UserInput.pause();
            }
            if (mainMenuChoice.equals("5")) {
                Integer tableSize = UserInput.getTableSize();
                System.out.println("Choose Table Option: " + DiceSet.tableRoll(tableSize));
                UserInput.pause();
            }
            if (mainMenuChoice.equals("6")) {
                System.out.println("Thank You For Using My App!");
                break;
            }
        }
    }

    public Integer handleAttackRoll() {
                Integer dieSize = UserInput.getAttackRollDieSize();
                Integer numberOfDice = UserInput.getAttackRollDiceAmount();
                Integer attackRollResult = DiceSet.attackRoll(dieSize, numberOfDice);
                return attackRollResult;
            }
        }

