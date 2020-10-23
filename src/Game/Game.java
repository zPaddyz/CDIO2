package Game;

import java.util.Scanner;

public class Game {
    public static void TheGame() {
        int dicevalue;
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        Field f1 = new Field();
        Language langSelector = new Language("eng");
        String[] currentLang = langSelector.returnLang();
        System.out.println(currentLang[0]);
        d1.setMAX(scan.nextInt()); //initiates how many sides the dices in the game should have.
        d2.setMAX(d1.getMAX());
        Player p1 = new Player(); //player object
        Player p2 = new Player();
        System.out.println(currentLang[1]);
        p1.Name = scan.next();
        System.out.println(currentLang[2]);
        p2.Name = scan.next();
        p1.hasTurn = true;

        while (true) {
            if (p1.hasTurn) {
                System.out.println(p1.Name + " " + currentLang[3]);
                if (scan.next().toLowerCase().equals(currentLang[4])) { //write roll into console to throw dices.
                    dicevalue = d1.rollDice() + d2.rollDice(); //checking for sum of dices.
                    if (dicevalue > 12) { //it is possible to have an unlimited dice value, but the board only has 12 fields.
                        if (dicevalue % 12 == 0) {
                            dicevalue = 12;
                        }
                        else {
                            dicevalue = (dicevalue % 12) + 1; //example: you roll 40 which is the same as rolling a 4. (When you reach the limit on the board you go back to field number 2).
                        }
                    }
                    System.out.println(p1.Name + " " + currentLang[5] +" "+ dicevalue);
                    f1.fieldswitch(dicevalue); //calls what field you landed on with a sentence.
                    p1.wallet.setPoint(f1.Money); //setting your points according to the field you landed on.
                    System.out.println(p1.Name + " " + currentLang[6] + " " + p1.wallet.getPoint());
                    if (p1.wallet.getPoint() >= 3000) {
                        System.out.println(currentLang[7]);
                        System.out.println(currentLang[8]);
                        break;
                    }
                    if (dicevalue != 10) { //extra turn if you roll 10
                        p1.hasTurn = false;
                    }
                }


            } else //spiller 2:
            {
                System.out.println(p2.Name + currentLang[3]);
                if (scan.next().toLowerCase().equals(currentLang[4])) {
                    dicevalue = d1.rollDice() + d2.rollDice();
                    if (dicevalue > 12) { //it is possible to have an unlimited dice value, but the board only has 12 fields.
                        if (dicevalue % 12 == 0) {
                            dicevalue = 12;
                        }
                        else {
                            dicevalue = (dicevalue % 12) + 1; //example: you roll 40 which is the same as rolling a 4. (When you reach the limit on the board you go back to field number 2).
                        }
                    }
                    System.out.println(p2.Name + currentLang[5] + dicevalue);
                    f1.fieldswitch(dicevalue);
                    p2.wallet.setPoint(f1.Money);
                    System.out.println(p2.Name + currentLang[6] + p2.wallet.getPoint());
                    if (p2.wallet.getPoint() >= 3000) {
                        System.out.println(currentLang[7]);
                        System.out.println(currentLang[8]);
                        break;
                    }
                    if (dicevalue != 10) {
                        p2.hasTurn = false;
                        p1.hasTurn = true;
                    }
                }

            }
        }
    }
}

