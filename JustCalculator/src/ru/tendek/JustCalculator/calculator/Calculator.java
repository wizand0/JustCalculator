package ru.tendek.JustCalculator.calculator;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Hi-Tech on 09.05.2017.
 */
public class Calculator {


    public Dimension dim;

    private JPanel calculatorPanel, buttonPanel;

    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    private JButton buttonADD, buttonSUB, buttonDIV, buttonMULTI, buttonEquals, buttonClear;

    private static JTextField display = new JTextField(30);

    public String getDisplay(){
        return display.getText();
    }

    public void setDisplay(String s){
        display.setText(s);
    }

    public Calculator(){

        calculatorPanel = new JPanel();
        BorderLayout l1 = new BorderLayout();
        calculatorPanel.setLayout(l1);
        calculatorPanel.add("North", display);


        buttonPanel = new JPanel();

        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonSUB = new JButton("-");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        buttonADD = new JButton("+");
        button3 = new JButton("3");
        button2 = new JButton("2");
        button1 = new JButton("1");
        buttonMULTI = new JButton("*");
        button0 = new JButton("0");
        buttonEquals = new JButton("=");
        buttonDIV = new JButton("/");
        buttonClear = new JButton("C");

        GridLayout l2 = new GridLayout(4,4);
        buttonPanel.setLayout(l2);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSUB);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonADD);
        buttonPanel.add(button3);
        buttonPanel.add(button2);
        buttonPanel.add(button1);
        buttonPanel.add(buttonMULTI);
        buttonPanel.add(button0);
        buttonPanel.add(buttonEquals);
        buttonPanel.add(buttonDIV);
        buttonPanel.add(buttonClear);
        calculatorPanel.add("Center",buttonPanel);

        CalculatorAction listener = new CalculatorAction(this);

        CalculatorAction2 listener2 = new CalculatorAction2(this);

        button0.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        buttonDIV.addActionListener(listener2);
        buttonADD.addActionListener(listener2);
        buttonMULTI.addActionListener(listener2);
        buttonSUB.addActionListener(listener2);
        buttonClear.addActionListener(listener2);
        buttonEquals.addActionListener(listener2);

        dim = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame window = new JFrame("Calculator");
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        window.setContentPane(calculatorPanel);

        window.pack();

        window.setVisible(true);
        window.setLocation((int)(dim.getWidth()/2-window.getWidth()/2), (int)(dim.getHeight()/2-window.getHeight()/2));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
