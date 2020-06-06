package sample;

import java.lang.String;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.lang.reflect.Array;


public class Controller {

    @FXML
    private Button r0c0;
    @FXML
    private Button r0c1;
    @FXML
    private Button r0c2;
    @FXML
    private Button r0c3;
    @FXML
    private Button r0c4;
    @FXML
    private Button r0c5;
    @FXML
    private Button r0c6;
    @FXML
    private Button r0c7;
    @FXML
    private Button r1c0;
    @FXML
    private Button r1c1;
    @FXML
    private Button r1c2;
    @FXML
    private Button r1c3;
    @FXML
    private Button r1c4;
    @FXML
    private Button r1c5;
    @FXML
    private Button r1c6;
    @FXML
    private Button r1c7;
    @FXML
    private Button r2c0;
    @FXML
    private Button r2c1;
    @FXML
    private Button r2c2;
    @FXML
    private Button r2c3;
    @FXML
    private Button r2c4;
    @FXML
    private Button r2c5;
    @FXML
    private Button r2c6;
    @FXML
    private Button r2c7;
    @FXML
    private Button r3c0;
    @FXML
    private Button r3c1;
    @FXML
    private Button r3c2;
    @FXML
    private Button r3c3;
    @FXML
    private Button r3c4;
    @FXML
    private Button r3c5;
    @FXML
    private Button r3c6;
    @FXML
    private Button r3c7;
    @FXML
    private Button r4c0;
    @FXML
    private Button r4c1;
    @FXML
    private Button r4c2;
    @FXML
    private Button r4c3;
    @FXML
    private Button r4c4;
    @FXML
    private Button r4c5;
    @FXML
    private Button r4c6;
    @FXML
    private Button r4c7;
    @FXML
    private Button r5c0;
    @FXML
    private Button r5c1;
    @FXML
    private Button r5c2;
    @FXML
    private Button r5c3;
    @FXML
    private Button r5c4;
    @FXML
    private Button r5c5;
    @FXML
    private Button r5c6;
    @FXML
    private Button r5c7;
    @FXML
    private Button r6c0;
    @FXML
    private Button r6c1;
    @FXML
    private Button r6c2;
    @FXML
    private Button r6c3;
    @FXML
    private Button r6c4;
    @FXML
    private Button r6c5;
    @FXML
    private Button r6c6;
    @FXML
    private Button r6c7;
    @FXML
    private Button r7c0;
    @FXML
    private Button r7c1;
    @FXML
    private Button r7c2;
    @FXML
    private Button r7c3;
    @FXML
    private Button r7c4;
    @FXML
    private Button r7c5;
    @FXML
    private Button r7c6;
    @FXML
    private Button r7c7;


    @FXML
    private ImageView wp1;
    @FXML
    private ImageView wp2;
    @FXML
    private ImageView wp3;
    @FXML
    private ImageView wp4;
    @FXML
    private ImageView wp5;
    @FXML
    private ImageView wp6;
    @FXML
    private ImageView wp7;
    @FXML
    private ImageView wp8;
    @FXML
    private ImageView wp9;
    @FXML
    private ImageView wp10;
    @FXML
    private ImageView wp11;
    @FXML
    private ImageView wp12;

    @FXML
    private ImageView bp1;
    @FXML
    private ImageView bp2;
    @FXML
    private ImageView bp3;
    @FXML
    private ImageView bp4;
    @FXML
    private ImageView bp5;
    @FXML
    private ImageView bp6;
    @FXML
    private ImageView bp7;
    @FXML
    private ImageView bp8;
    @FXML
    private ImageView bp9;
    @FXML
    private ImageView bp10;
    @FXML
    private ImageView bp11;
    @FXML
    private ImageView bp12;





    @FXML
    public int[] click_on_field(ActionEvent e){

        Button btn = (Button) e.getSource();
        String id = btn.getId();
        //System.out.print(id);

        int row = Character.getNumericValue(id.charAt(1));
        int col = Character.getNumericValue(id.charAt(3));
        System.out.print("\nPole: " + row + " " + col + "\n");

        int [] cords = new int[2];
        cords[0] = row;
        cords[1] = col;

        return cords;

    }

    @FXML
    public void click_on_piece(MouseEvent e){

        System.out.print("pionek\n");

    }



}
