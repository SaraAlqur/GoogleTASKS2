import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Googletasks {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Character Counter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(new FlowLayout());

            JLabel promptLabel = new JLabel("Enter text:");
            JTextField textField = new JTextField(20);
            JLabel resultLabel = new JLabel("Character count: 0");

            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    String text = textField.getText();
                    if (text.isEmpty()) {
                        resultLabel.setText("Please enter something.");
                    } else {
                        resultLabel.setText("You entered: \"" + text + "\" (Characters: " + text.length() + ")");
                    }
                }
            });

            frame.add(promptLabel);
            frame.add(textField);
            frame.add(resultLabel);

            frame.setVisible(true);
        });
    }
}

