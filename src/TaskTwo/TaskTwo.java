package TaskTwo;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class TaskTwo {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Event Demo");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));

        JLabel label = new JLabel("BUTTON EVENT DEMO", SwingConstants.CENTER);
        panel.add(label);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JButton redButton = new JButton("RED");
        JButton greenButton = new JButton("GREEN");
        JButton blueButton = new JButton("BLUE");

        redButton.setBackground(Color.RED);
        redButton.setPreferredSize(new Dimension(90,50));
        greenButton.setBackground(Color.green);
        greenButton.setPreferredSize(new Dimension(90,50));
        blueButton.setBackground(Color.BLUE);
        blueButton.setPreferredSize(new Dimension(90,50));

        buttonsPanel.add(redButton);
        buttonsPanel.add(greenButton);
        buttonsPanel.add(blueButton);

        JPanel bottomPanel = new JPanel();
        JLabel selectText = new JLabel("Selected: ");
        JTextField rlabel = new JTextField(20);
        bottomPanel.setLayout(new GridLayout(2,0));
        bottomPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
        bottomPanel.add(selectText);
        bottomPanel.add(rlabel);

        ActionListener listener = e -> {
            if (e.getSource() == redButton) {
                rlabel.setText("RED");
            } else if (e.getSource() == greenButton) {
                rlabel.setText("GREEN");
            } else if (e.getSource() == blueButton) {
                rlabel.setText("BLUE");
            }
        };

        redButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        blueButton.addActionListener(listener);

        panel.add(buttonsPanel);
        panel.add(bottomPanel);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
