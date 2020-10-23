package Game;

public class Field
{
    String[] currentLang;
    int Money = 0;

    public Field(String[] lang){
        this.currentLang = lang;
    }

    public String fieldswitch(int n)
    {
        switch (n) {

            case 3:
                System.out.println(currentLang[9]);
                Money = -100;
                break;

            case 4:
                System.out.println(currentLang[10]);
                Money = 100;
                break;

            case 5:
                System.out.println(currentLang[11]);
                Money = -20;
                break;


            case 6:
                System.out.println(currentLang[12]);
                Money = 180;
                break;

            case 7:
                System.out.println(currentLang[13]);
                Money = 0;
                break;

            case 8:
                System.out.println(currentLang[14]);
                Money = -70;
                break;

            case 9:
                System.out.println(currentLang[15]);
                Money = 60;
                break;

            case 10:
                System.out.println(currentLang[16]);
                Money = -80;
                break;

            case 11:
                System.out.println(currentLang[17]);
                Money = -50;
                break;

            case 12:
                System.out.println(currentLang[18]);
                Money = 650;
                break;

            default:
                System.out.println(currentLang[19]);
                Money = 250;
                break;
        }
        return "";
    }
}
