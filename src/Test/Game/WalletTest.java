package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void setPoint() {
        Wallet w1 = new Wallet();
        w1.setPoint(500);
        w1.setPoint(500);
        assertEquals(2000, w1.getPoint());
        w1.setPoint(-50000);
        assertEquals(0,w1.getPoint());
    }

    @Test
    void getPoint() {
        Wallet w1 = new Wallet();
        assertEquals(1000, w1.getPoint());
    }
}