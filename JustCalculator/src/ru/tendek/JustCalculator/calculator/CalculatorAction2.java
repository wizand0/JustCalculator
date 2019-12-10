package ru.tendek.JustCalculator.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.valueOf;

/**
 * Created by Hi-Tech on 10.05.2017.
 */
public class CalculatorAction2 implements ActionListener {

    private Calculator calc2;

    String t1 = "0", t2 = "0";

    double i, j;

    double result;

    int action;

    public CalculatorAction2(Calculator calc2){
        this.calc2 = calc2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton currentButton = (JButton) e.getSource();

        if(currentButton.getText().equals("C")){
            calc2.setDisplay("");
        }

        if (currentButton.getText().equals("-")){
            t1 = calc2.getDisplay();
            calc2.setDisplay("");
            action = 0;
        }

        if (currentButton.getText().equals("+")){
            t1 = calc2.getDisplay();
            calc2.setDisplay("");
            action = 1;
        }

        if (currentButton.getText().equals("*")){
            t1 = calc2.getDisplay();
            calc2.setDisplay("");
            action = 2;
        }

        if (currentButton.getText().equals("/")){
            t1 = calc2.getDisplay();
            calc2.setDisplay("");
            action = 3;
        }

        if(currentButton.getText().equals("=")){
            t2 = calc2.getDisplay();
            if(t1 != null && t2 != null){

                i = Double.parseDouble(t1);
                j = Double.parseDouble(t2);

                switch (action){
                    case 0 : result = i - j;
                        break;
                    case 1 : result = i + j;
                        break;
                    case 2 : result = i * j;
                        break;
                    case 3 : result = i / j;
                        break;

                }

            }

            calc2.setDisplay(String.valueOf(result));
            t1 = null;
            t2 = null;
        }

    }
}
