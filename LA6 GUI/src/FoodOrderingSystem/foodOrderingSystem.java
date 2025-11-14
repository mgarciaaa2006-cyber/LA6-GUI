package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class foodOrderingSystem extends JFrame{
    private JPanel contentPane;
    private JButton btnOrder;
    private JRadioButton rb15;
    private JRadioButton rb10;
    private JRadioButton rb5;
    private JRadioButton rbNone;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private double sum = 0;
    private double total = 0;

    public foodOrderingSystem() {
        setTitle("Food Ordering System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(cPizza.isSelected()) {
                        sum += 100;
                    }
                    if(cBurger.isSelected()) {
                        sum += 80;
                    }
                    if(cFries.isSelected()) {
                        sum += 65;
                    }
                    if(cSoftDrinks.isSelected()) {
                        sum += 55;
                    }
                    if(cTea.isSelected()) {
                        sum += 50;
                    }
                    if(cSundae.isSelected()) {
                        sum += 40;
                    }

                    if(rb5.isSelected()) {
                        total = sum - (sum * 0.05);
                    }
                    else if(rb10.isSelected()) {
                        total = sum - (sum * 0.10);
                    }
                    else if(rb15.isSelected()) {
                        total = sum - (sum * 0.15);
                    }
                    else if(rbNone.isSelected()) {
                        total = sum;
                    }
                    JOptionPane.showMessageDialog(null,"The total price is Php" + String.format("%.2f", total));
                    sum = 0;
                    total = 0;
            }
        });

    }

    static void main() {
        new foodOrderingSystem().setVisible(true);
    }
}
