package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void setHasTurn() {
        Player p1 = new Player();
        assertEquals(false, p1.hasTurn);
        p1.setHasTurn(true);
        assertEquals(true, p1.hasTurn);
    }
}