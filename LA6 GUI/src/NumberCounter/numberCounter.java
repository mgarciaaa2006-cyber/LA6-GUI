package NumberCounter;

import javax.swing.*;

public  class numberCounter extends JFrame {
    private JPanel contentPane;
    private JButton increaseButton;
    private JButton decreaseButton;
    private JLabel countLabel;
    private int counter = 0;
    public numberCounter() {
        setTitle("Number Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        increaseButton.addActionListener(_ -> countLabel.setText(String.valueOf(++counter)));

        decreaseButton.addActionListener(_ -> countLabel.setText(String.valueOf(--counter)));
    }
    static void main() {
        new numberCounter().setVisible(true);
    }
}


