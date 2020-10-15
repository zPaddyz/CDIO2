package Game;
public class Field
{
    int Money = 0;
    public String fieldswitch(int n)
    {
        switch (n) {

            case 3:
                System.out.println("You fell in a crater and have to pay to get out. You pay 100");
                Money = -100;
                break;

            case 4:
                System.out.println("You stand in front of the palace gates and find a gold coin. You sell it for 100");
                Money = 100;
                break;

            case 5:
                System.out.println("You ended up in a cold desert. To keep warm you buy a blanket for 20");
                Money = -20;
                break;


            case 6:
                System.out.println("You have helped building a city, and as pay you get 180");
                Money = 180;
                break;

            case 7:
                System.out.println("It is getting very late, you rest in a nearby monastery for free");
                Money = 0;
                break;

            case 8:
                System.out.println("You have gotten lost in a black cave. To get out you use your lighter that you later will have to refill for 70");
                Money = -70;
                break;

            case 9:
                System.out.println("You have helped building huts in the mountains. For your work you get 60");
                Money = 60;
                break;

            case 10:
                System.out.println("You accidentially drove into the white house, you pay 80");
                Money = -80;
                break;

            case 11:
                System.out.println("You have fallen down the pit. During the fall you lost 50");
                Money = -50;
                break;

            case 12:
                System.out.println("You have inherited a goldmine which earns you 650");
                Money = 650;
                break;

            default:
                System.out.println("You climb the highest tower in the country, and at the top you find 250");
                Money = 250;
                break;
        }
        return "";
    }
}
