package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {

    private int white_units;
    private int black_units;
    private List<Piece> pieces_list = new LinkedList<Piece>();
    private Field [][] fields;



    Board(){

        fields = new Field[8][8];
        this.white_units = 12;
        this.black_units = 12;
    }

    public void setup_board(){

        // Make a list of pieces

        for(int row = 0; row <8; row++ )
            for(int col = 0; col < 8; col++)
            {
                if(row <= 2 && ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0))){
                    pieces_list.add(new Piece("white", col, row));
                    fields[row][col] = new Field(row, col, true);
                    System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                    System.out.print( "row: " + row + " " + "col: "+ col + "\n");
                }
                else if(row >= 5 && ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0))){
                    pieces_list.add(new Piece("black", col, row));
                    fields[row][col] = new Field(row, col, true);
                    System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                    System.out.print( "row: " + row + " " + "col: "+ col + "\n");
                }
                else{
                    fields[row][col] = new Field(row, col, false);
                    System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                }
            }




    }



}
