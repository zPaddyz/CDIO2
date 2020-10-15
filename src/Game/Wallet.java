package Game;

public class Wallet {
    //point is used to manage our players score
    private int point = 1000;


    public Wallet(){

    }
    public void setPoint(int point) {
        // if the player roll 2 i.e two 1s then the player loses all his/her points
        this.point += point;
        if(point < 0) {
            point = 0;
        }
    }
    //getPoint returns point and is required because point is set to private
    public int getPoint() {
        return point;
    }

}
