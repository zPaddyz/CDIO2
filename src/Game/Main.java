package Game;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int dicevalue = 0;
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        Field f1 = new Field();
        System.out.println("Vælg hvor mange sider din terning skal have");
        d1.setMAX(scan.nextInt());
        d2.setMAX(d1.getMAX());
        Player p1 = new Player();
        Player p2 = new Player();
        p1.Name = scan.next();
        p2.Name = scan.next();
        p1.hasTurn = true;

        while(true)
        {
            if (p1.hasTurn == true)
            {

                if (scan.nextInt() == 0)
                {
                    dicevalue = d1.rollDice() + d2.rollDice();
                    if (dicevalue > 12)
                    {
                        dicevalue = dicevalue % 12;
                    }
                    System.out.println(dicevalue);
                    f1.fieldswitch(dicevalue);
                    p1.wallet.setPoint(f1.Money);
                    System.out.println(p1.Name + " Points: " + p1.wallet.getPoint());
                    if (p1.wallet.getPoint() >= 3000) {
                        System.out.println("you win!");
                        System.out.println("End of game");
                        break;
                    }
                    if (dicevalue != 10) {
                        p1.hasTurn = false;
                    }
                }


            }
            else //spiller 2:
            {
                if (scan.nextInt() == 0)
                {
                    dicevalue = d1.rollDice() + d2.rollDice();
                    if (dicevalue > 12)
                    {
                        dicevalue = dicevalue % 12;
                    }
                    System.out.println(dicevalue);
                    f1.fieldswitch(dicevalue);
                    p2.wallet.setPoint(f1.Money);
                    System.out.println(p2.Name + " Points: " + p2.wallet.getPoint());
                    if (p2.wallet.getPoint() >= 3000)
                    {
                        System.out.println("you win!");
                        System.out.println("End of game");
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
