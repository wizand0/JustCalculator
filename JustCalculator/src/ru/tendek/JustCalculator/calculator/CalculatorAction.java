package ru.tendek.JustCalculator.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Hi-Tech on 10.05.2017.
 */
public class CalculatorAction implements ActionListener {

    private ru.tendek.JustCalculator.calculator.Calculator calc;

    public CalculatorAction(ru.tendek.JustCalculator.calculator.Calculator calc){
        this.calc = calc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton currentButton = (JButton) e.getSource();

        String t1 = calc.getDisplay();
        String t2 = currentButton.getText();

        calc.setDisplay(t1+t2);
    }
}
