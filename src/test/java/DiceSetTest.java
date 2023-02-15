import Main.application.DiceSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceSetTest {

    private DiceSet diceSet;

    @Before
    public void setup() {
        diceSet = new DiceSet();
    }

    @Test
    public void attackRoll_works_correctly_5d4() {
        boolean expectedvalue = true;
        boolean didDiceRollerWork = true;

        for (int i = 1; i <= 5; i++) {
            int currentRoll = diceSet.attackRoll(4, 5);
            if (currentRoll <= 0 || currentRoll > 20) {
                didDiceRollerWork = false;
            }
        }
        Assert.assertEquals(expectedvalue, didDiceRollerWork);
    }

    @Test
    public void attackRoll_works_correctly_8d12() {
        boolean expectedvalue = true;
        boolean didDiceRollerWork = true;

        for (int i = 1; i <= 5; i++) {
            int currentRoll = diceSet.attackRoll(12, 8);
            if (currentRoll <= 0 || currentRoll > 96) {
                didDiceRollerWork = false;
            }
        }
        Assert.assertEquals(expectedvalue, didDiceRollerWork);
    }

    @Test
    public void attackRoll_works_correctly_2d10() {
        boolean expectedvalue = true;
        boolean didDiceRollerWork = true;

        for (int i = 1; i <= 5; i++) {
            int currentRoll = diceSet.attackRoll(10, 2);
            if (currentRoll <= 0 || currentRoll > 20) {
                didDiceRollerWork = false;
            }
        }
        Assert.assertEquals(expectedvalue, didDiceRollerWork);
    }
}
