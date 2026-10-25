package TaskOne;
import javax.swing.*;
import java.awt.*;

public class TaskOne {
    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentNameForm");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel title = new JLabel("STUDENT NAME FORM", SwingConstants.CENTER);
        //Center
        JPanel centerPanel = new JPanel();
        JLabel nameLabel = new JLabel("Enter Name:");
        JTextField field = new JTextField(15);
        centerPanel.add(nameLabel);
        centerPanel.add(field);

        //Bottom
        JPanel bottomPanel = new JPanel();
        JButton button = new JButton("Display");
        bottomPanel.add(button);
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hello! " + field.getText());
        });

        panel.add(title);
        panel.add(centerPanel);
        panel.add(bottomPanel);

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}