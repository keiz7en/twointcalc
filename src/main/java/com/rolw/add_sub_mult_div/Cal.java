package com.rolw.add_sub_mult_div;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Cal {
    public Button Multi;
    public TextField stopper;
    @FXML
    private Label Result;
    @FXML
    private Button Addi;
    @FXML
    private TextField firstoper;
    @FXML
    private TextField secondoper;
    @FXML
    private Button Subi;
    @FXML
    private Button Dividei;

    @FXML
    public void initialize(){
    }

    public void add(ActionEvent event) {
        String firstNumber = this.firstoper.getText();
        int FirstVal = Integer.parseInt(firstNumber);
        String secondNumber = this.secondoper.getText();
        int SecondVal = Integer.parseInt(secondNumber);
        int Result = FirstVal + SecondVal;
        String ResultStr = Integer.toString(Result);
        this.Result.setText("Sum is = " + ResultStr);

    }

    public void subtract(ActionEvent event) {
        String firstNumber = this.firstoper.getText();
        int FirstVal = Integer.parseInt(firstNumber);
        String secondNumber = this.secondoper.getText();
        int SecondVal = Integer.parseInt(secondNumber);
        int Result = FirstVal - SecondVal;
        String ResultStr = Integer.toString(Result);
        this.Result.setText("Sum is = " + ResultStr);
    }

    public void multiply(ActionEvent event) {
        String firstNumber = this.firstoper.getText();
        int FirstVal = Integer.parseInt(firstNumber);
        String secondNumber = this.secondoper.getText();
        int SecondVal = Integer.parseInt(secondNumber);
        int Result = FirstVal * SecondVal;
        String ResultStr = Integer.toString(Result);
        this.Result.setText("Sum is = " + ResultStr);
    }

    public void dividiation(ActionEvent event) {
        String firstNumber = this.firstoper.getText();
        int FirstVal = Integer.parseInt(firstNumber);
        String secondNumber = this.secondoper.getText();
        int SecondVal = Integer.parseInt(secondNumber);
        int Result = FirstVal / SecondVal;
        String ResultStr = Integer.toString(Result);
        this.Result.setText("Sum is = " + ResultStr);
    }
}
