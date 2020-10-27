package Game;
//Class that takes care of language support by returning the array that holds the wanted language
public class Language {

    String lang;
    //array that stores string in danish
    String[] dk = {"Skriv venligst hvor mange sider din terning skal have: ", "Skriv spiller 1's navn: ", "Skriv spiller 2's navn",
    "Skriv: 'slå' for at slå med terningen", "slå", " Slår: ", " Point: ", "Du vinder!", "Spillet er slut",
    "Du faldt ned i et krater, og skal betale for at komme op. Du betaler 100",
    "Du står foran paladsets porte, og finder en guldmønt. Den sælger du for 100",
    "Du ender i en kold ørken. For at varme dig køber du et tæppe til 20", "Du har hjulpet med at bygge byen, og som betaling for du 180",
    "Det er ved at blive sent, du sover gratis i et kloster", "Du er faret vild i en mørk grotte. Du bruger din lighter som lys. Den koster 70 at fylde op",
    "Du har hjulpet til med at bygge en bjerghytte. Du får 60 for dit arbejde", "Du er nødt til at klatre over varulvemuren. Du må betale 80 for stormhat-eliksir.",
    "Du er faldet ned i hullet. Du tabte 50 under faldet", "Du har arvet en guldmine. Dette giver 650",
    "Du klatrer op i det højeste tårn i landet. På toppen finder du 250","Venligst brug et tal mellem 1-1073741823", "Tallet er for stort brug tal mellem 1-1073741823"};

    //array that store strings in english
    String[] eng = {"Please enter the amount of sides you wish your dice to have: ", "Enter player 1's name: ",
            "Enter player 2's name: ", " Enter: 'roll' to roll the dice", "roll", " Rolls: ", " Points: ",
            "You win!", "End of game.", "You fell in a crater and have to pay to get out. You pay 100",
            "You stand in front of the palace gates and find a gold coin. You sell it for 100",
            "You ended up in a cold desert. To keep warm you buy a blanket for 20",
            "You have helped building a city, and as payment you get 180", "It is getting very late, you rest in a nearby monastery for free",
            "You have gotten lost in a black cave. To get out you use your lighter that you later will have to refill for 70",
            "You have helped building huts in the mountains. For your work you get 60", "You need to climb over the Werewall, you have to pay 80 for wolfsbane potion",
            "You have fallen down the pit. During the fall you lost 50", "You have inherited a goldmine which earns you 650",
            "You climb the highest tower in the country, and at the top you find 250", "Please use a numeric number between 1-1073741823", "Number too large, use a number between 1-1073741823"};


    public Language(String lang) {
        this.lang = lang;
    }
    //Method that takes in a language choice as a string and returns the correct string array to display console text
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