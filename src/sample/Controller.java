package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Controller {

    private Rectangle r7c0;

    @FXML
    public void click_on_field(MouseEvent e){
        System.out.print("xD");
        System.out.print(e.getID());
    }

}
