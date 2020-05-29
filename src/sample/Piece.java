package sample;

public class Piece {

    private String color;
    private int x;
    private int y;
    private boolean is_king;

    Piece(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;

        this.is_king = false;
    }


    public int get_X() {
        return x;
    }

    public int get_Y() {
        return y;
    }

    public String get_color() {
        return color;
    }

    public boolean is_king() {
        return is_king;
    }



    public void set_X(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set_color(String color) {
        this.color = color;
    }


}
