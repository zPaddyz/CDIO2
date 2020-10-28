package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void rollDice() {
        Dice d1 = new Dice(4);
        d1.setMAX(6);
        for (int i = 0; i < 100; i++) {
            d1.rollDice();
            assertTrue(d1.getFaceValue() <= d1.getMAX() && d1.getFaceValue() > 0);
        }

    }


    @Test
    void setFaceValue() {
        Dice d1 = new Dice(4);
        d1.setFaceValue(4);
        assertEquals(4, d1.getFaceValue());
    }

    @Test
    void getFaceValue() {
        Dice d1 = new Dice(4);
        d1.setFaceValue(4);
        assertEquals(4, d1.getFaceValue());
    }
}