package Game;

/* *************************************************************************************************************** */
// Titel: CDIO 1 - Terningespil
// Group: 34                                                                                                             *
// Medlemmer:                                                                                                             *
// Sebastian Andreas Almfort        - s163922                                                                                                              *
// Lucas Arleth Lykke               - s205447
// Mike Patrick Nørlev Andersen     - s205417
// Martin Koch                      - s182935
// Anne Sophie Bondegaard Petersen  - s194582
// Jan Engers Møller Pedersen       - s205419
/* *************************************************************************************************************** */

public class Player {

    //the hasTurn boolean is used to determine which players turn it is.
    boolean hasTurn = false;
    //the Name string is used to give the players their own chosen name.
    public String Name;

    //this player method is used to instantiate a new player
    public Player(){

    }
    //we use this method to change between each players turn
    public void setHasTurn(boolean hasTurn) {
        this.hasTurn = hasTurn;
    }
    Wallet wallet = new Wallet();

}
