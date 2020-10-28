package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void fieldswitch() {
        Language lang = new Language("dk");
        String[] chosenLang = lang.returnLang();
        Field f1 = new Field(chosenLang);

        f1.fieldswitch(2);
        assertEquals(250,f1.Money);

        f1.fieldswitch(3);
        assertEquals(-100, f1.Money);

        f1.fieldswitch(4);
        assertEquals(100,f1.Money);

        f1.fieldswitch(5);
        assertEquals(-20,f1.Money);

        f1.fieldswitch(6);
        assertEquals(180,f1.Money);

        f1.fieldswitch(7);
        assertEquals(0,f1.Money);

        f1.fieldswitch(8);
        assertEquals(-70,f1.Money);

        f1.fieldswitch(9);
        assertEquals(60,f1.Money);

        f1.fieldswitch(10);
        assertEquals(-80,f1.Money);

        f1.fieldswitch(11);
        assertEquals(-50,f1.Money);

        f1.fieldswitch(12);
        assertEquals(650,f1.Money);

        f1.fieldswitch(13);
        assertEquals(250,f1.Money);



    }
}