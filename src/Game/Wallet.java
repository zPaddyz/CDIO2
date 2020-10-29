package Game;

public class Wallet {
    //point is used to manage our players score
    private int point = 1000;


    public Wallet(){

    }
    public void setPoint(int point) {
        this.point += point;
        if(this.point < 0) {
             this.point = 0;
        }
    }
    //getPoint returns point and is required because point is set to private
    public int getPoint() {
        return point;
    }

}
