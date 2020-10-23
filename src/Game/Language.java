package Game;

public class Language {

    String lang;
    String[] eng = new String[22];
    String[] dk = new String[22];



    public Language(String lang) {
        this.lang = lang;
    }
    //Method that takes in the system language and returns the correct string array to display console text
    private String[] returnLang(String input) {
        switch (input){

            case "en":
                return this.eng;

            case "dk":
                return this.dk;

        }
        return eng;
    }

}