package com.example.javafxpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.*;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label MyMessage = new Label("Nothing.");


    protected void onHelloButtonClick() {welcomeText.setText("Welcome to JavaFX Application!");}

    public void generateRandom(ActionEvent event){

        int rand = (int)(Math.random() * 5) + 1;
        //System.out.println(Integer.toString(rand));
        MyMessage.setText(Integer.toString(rand));

    }
}