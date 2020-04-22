/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_fx_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author sr computer
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    Float data = 0f;
    int operation;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button sub;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button mul;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button cl;

    @FXML
    private Button div;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == cl) {
            display.setText("");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");

        } else if (event.getSource() == sub) {
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        } else if (event.getSource() == mul) {
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");

        } else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        }
        else if(event.getSource()==equal)
        { 
            Float sec; 
            sec=Float.parseFloat(display.getText()); 
            switch(operation)
            { 
                case 1: 
                Float ans=data+sec; 
                display.setText(String.valueOf(ans));
                break; 
                case 2: 
                 ans=data-sec; 
                display.setText(String.valueOf(ans));
                break; 
                case 3: 
                 ans=data*sec; 
                display.setText(String.valueOf(ans));
                break; 
                case 4: 
                   
                    ans=data/sec; 
                   
                   
                    display.setText(String.valueOf(ans));
                    break; 
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
