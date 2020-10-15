package Game;

import java.util.Scanner;

public class Game {
    public static void TheGame() {
        int dicevalue;
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        Field f1 = new Field();
        System.out.println("Please enter the amount of sides you wish your dice to have: ");
        d1.setMAX(scan.nextInt());
        d2.setMAX(d1.getMAX());
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Enter player 1's name: ");
        p1.Name = scan.next();
        System.out.println("Enter player 2's name: ");
        p2.Name = scan.next();
        p1.hasTurn = true;

        while (true) {
            if (p1.hasTurn) {
                System.out.println(p1.Name + " Enter: 'roll' to roll the dice");
                if (scan.next().toLowerCase().equals("roll")) {
                    dicevalue = d1.rollDice() + d2.rollDice();
                    if (dicevalue > 12) {
                        dicevalue = dicevalue % 12;
                    }
                    System.out.println(p1.Name + " Rolls: " + dicevalue);
                    f1.fieldswitch(dicevalue);
                    p1.wallet.setPoint(f1.Money);
                    System.out.println(p1.Name + " Points: " + p1.wallet.getPoint());
                    if (p1.wallet.getPoint() >= 3000) {
                        System.out.println("You win!");
                        System.out.println("End of game.");
                        break;
                    }
                    if (dicevalue != 10) {
                        p1.hasTurn = false;
                    }
                }


            } else //spiller 2:
            {
                System.out.println(p2.Name + " Enter: 'roll' to roll the dice");
                if (scan.next().toLowerCase().equals("roll")) {
                    dicevalue = d1.rollDice() + d2.rollDice();
                    if (dicevalue > 12) {
                        dicevalue = dicevalue % 12;
                    }
                    System.out.println(p2.Name + " Rolls: " + dicevalue);
                    f1.fieldswitch(dicevalue);
                    p2.wallet.setPoint(f1.Money);
                    System.out.println(p2.Name + " Points: " + p2.wallet.getPoint());
                    if (p2.wallet.getPoint() >= 3000) {
                        System.out.println("You win!");
                        System.out.println("End of game.");
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

