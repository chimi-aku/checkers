package sample;

public class Field {

    private int x;
    private int y;
    private boolean is_taken;

    Field(int x, int y){
        this.x = x;
        this.y = y;
        this.is_taken = false;
    }



    public int get_X() {
        return x;
    }

    public int get_Y() {
        return y;
    }

    public boolean get_is_taken(){
        return is_taken;
    }


    public void set_is_taken(boolean is_taken) {
        this.is_taken = is_taken;
    }
}
