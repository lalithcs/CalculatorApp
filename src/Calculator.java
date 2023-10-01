import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}