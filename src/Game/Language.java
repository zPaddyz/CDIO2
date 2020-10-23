package Game;

public class Language {

    String lang;
    String[] dk = {"test", "test2"};

    //array that store strings in english
    String[] eng = {"Please enter the amount of sides you wish your dice to have: ", "Enter player 1's name: ",
            "Enter player 2's name: ", " Enter: 'roll' to roll the dice", "roll", " Rolls: ", " Points: ",
            "You win!", "End of game.", "You fell in a crater and have to pay to get out. You pay 100",
            "You stand in front of the palace gates and find a gold coin. You sell it for 100",
            "You ended up in a cold desert. To keep warm you buy a blanket for 20",
            "You have helped building a city, and as pay you get 180", "It is getting very late, you rest in a nearby monastery for free",
            "You have gotten lost in a black cave. To get out you use your lighter that you later will have to refill for 70",
            "You have helped building huts in the mountains. For your work you get 60", "You accidentially drove into the white house, you pay 80",
            "You have fallen down the pit. During the fall you lost 50", "You have inherited a goldmine which earns you 650",
            "You climb the highest tower in the country, and at the top you find 250"};


    public Language(String lang) {
        this.lang = lang;
    }
    //Method that takes in the system language and returns the correct string array to display console text
    public String[] returnLang() {
        switch (this.lang){

            case "en":
                return this.eng;

            case "dk":
                return this.dk;

            default:
                return this.eng;
        }

    }

}