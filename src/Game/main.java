package Game;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(1);
        System.out.println("Vælg hvor mange sider din terning skal have");
        d1.setMAX(scan.nextInt());
        d2.setMAX(d1.getMAX());
    }
}
