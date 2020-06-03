package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {

    private int white_units;
    private int black_units;
    private List<Piece> pieces_list = new LinkedList<Piece>();
    private List<Piece> white_pieces_list = new LinkedList<Piece>();
    private List<Piece> black_pieces_list = new LinkedList<Piece>();
    private Field [][] fields;

    // valid_moves_method



    Board(){

        fields = new Field[8][8];
        this.white_units = 12;
        this.black_units = 12;
    }

    public void setup_board(){

        // Make a list of pieces and fields

        for(int row = 0; row <8; row++ )
            for(int col = 0; col < 8; col++)
            {
                if(row <= 2 && ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0))){
                    Piece p = new Piece("white", col, row);
                    pieces_list.add(p);
                    white_pieces_list.add(p);
                    fields[row][col] = new Field(row, col, true);
                    //System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                    //System.out.print( "row: " + row + " " + "col: "+ col + "\n");
                }
                else if(row >= 5 && ((row % 2 != 0 && col % 2 != 0) || (row % 2 == 0 && col % 2 == 0))){
                    Piece p = new Piece("black", col, row);
                    pieces_list.add(p);
                    black_pieces_list.add(p);
                    fields[row][col] = new Field(row, col, true);
                    //System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                    //System.out.print( "row: " + row + " " + "col: "+ col + "\n");
                }
                else{
                    fields[row][col] = new Field(row, col, false);
                    //System.out.print("pole Row: "+ fields[row][col].get_row() + " Col: " + fields[row][col].get_col() + " taken: " + fields[row][col].get_is_taken() + " \n");
                }
            }

    }

    public List<Field> valid_moves(Piece piece){

        int row = piece.get_row();
        int col = piece.get_col();
        String color = piece.get_color();
        boolean is_king = piece.is_king();

        List<Field> valid_moves_list = new LinkedList<Field>();

        if(is_king == false){
            if(color.equals("white")){

                if( (row + 1 <= 7) && (col + 1 <= 7) && !(fields[row + 1][col + 1].get_is_taken()) )
                    valid_moves_list.add(fields[row + 1][col + 1]);

                if( (row + 1 <= 7) && (col - 1 >= 0) && !(fields[row + 1][col - 1].get_is_taken()) )
                    valid_moves_list.add(fields[row + 1][col - 1]);
            }
            else {

                if( (row - 1 >= 0) && (col + 1 <= 7) && !(fields[row - 1][col + 1].get_is_taken()) )
                    valid_moves_list.add(fields[row - 1][col + 1]);

                if( (row - 1 >= 0) && (col - 1 >= 0) && !(fields[row - 1][col - 1].get_is_taken()) )
                    valid_moves_list.add(fields[row - 1][col - 1]);

            }
        }

        if(valid_moves_list.size() == 0){
            System.out.print("No valid moves");
        }
        else{
            for(int i=0; i<valid_moves_list.size(); i++){
                System.out.println("Valid move in row: " + valid_moves_list.get(i).get_row() + " and col: " + valid_moves_list.get(i).get_col());
            }
        }

        return valid_moves_list;
    }

    public void move_piece(Piece piece){

        if(fields[piece.get_row()][piece.get_col()].get_is_taken()){ // Wywala błąd tablicy fields przy używaniu pustego pola

            List<Field> valid_moves = valid_moves(piece);
            List<Integer> new_position = select_position(1,2);

            while(select_position().get(0) != valid_moves)

        }
        else{
            System.out.print("Piece doesn't exist on this field");
            return;
        }



    }

    public List<Integer> select_position(int row, int col){ // tymczasowe argumenrty, tu będziemy przekazywać kliknięcie

        List<Integer> new_position = new LinkedList<Integer>();
        new_position.add(row);
        new_position.add(col);
        // row on index 0, col on index 1

        return new_position;
    }

    public Piece get_piece(int row, int col, List<Integer> integers){

        for( int i = 0; i < pieces_list.size(); i++){
            if(pieces_list.get(i).get_row() == row && pieces_list.get(i).get_col() == col)
                return pieces_list.get(i);
        }

        return new Piece("wrong_cords", -1, -1);
    }

}
