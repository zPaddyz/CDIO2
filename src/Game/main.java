package Game;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int dicevalue = 0;
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        System.out.println("Vælg hvor mange sider din terning skal have");
        d1.setMAX(scan.nextInt());
        d2.setMAX(d1.getMAX());
        Player p1 = new Player();
        Player p2 = new Player();
        p1.Name = scan.nextLine();
        p2.Name = scan.nextLine();

        while(true)
        {
            if (p1.hasTurn == true)
            {
                dicevalue = d1.rollDice() + d2.rollDice();
                if (dicevalue > 12)
                {
                    dicevalue = dicevalue % 12;
                }
                //INDSÆT SWITCH STATEMENT HER:
            }
            else //spiller 2:
            {
                dicevalue = d1.rollDice() + d2.rollDice();
                if (dicevalue > 12)
                {
                    dicevalue = dicevalue % 12;
                }
                //INDSÆT SWITCH STATEMENT HER:
            }
        }
    }
}
