package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleCalculator extends JFrame {
    private JPanel contentPane;
    private JTextField tfNumber1;
    private JComboBox<String> cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;

    public simpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());
                    int result = 0;

                    String operation = (String) cbOperations.getSelectedItem();

                    switch (operation) {
                        case "+" -> result = num1 + num2;
                        case "-" -> result = num1 - num2;
                        case "*" -> result = num1 * num2;
                        case "/" -> {
                            if (num2 == 0) {
                                lblResult.setText("Error");
                                return;
                            } else {
                                result = num1 / num2;
                            }
                        }
                    }

                    lblResult.setText(String.valueOf(result));

                } catch (NumberFormatException _) {
                    lblResult.setText("Error");
                }
            }
        });
    }

    public static void main(String[] args) {
        new simpleCalculator().setVisible(true);
    }
}
