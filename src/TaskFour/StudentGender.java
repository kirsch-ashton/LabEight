package TaskFour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StudentGender {

    public static void main(String[] args){
        JFrame frame = new JFrame("StudentGender");
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JLabel title = new JLabel("Student Information", SwingConstants.CENTER);

        JPanel centerPanel = new JPanel(new GridLayout(0, 1, 0, 10));
        JLabel gender = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton neutralButton = new JRadioButton("Prefer not to say");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleButton);
        buttonGroup.add(femaleButton);
        buttonGroup.add(neutralButton);
        centerPanel.add(gender);
        centerPanel.add(maleButton);
        centerPanel.add(femaleButton);
        centerPanel.add(neutralButton);

        JPanel bottomPanel = new JPanel();
        JLabel selectedText = new JLabel("Selected");
        JTextField selected = new JTextField(15);
        bottomPanel.add(selectedText);
        bottomPanel.add(selected);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(maleButton.isSelected()){
                    selected.setText("Male");
                } else if (femaleButton.isSelected()) {
                    selected.setText(femaleButton.getText());
                } else if (neutralButton.isSelected()) {
                    selected.setText(neutralButton.getText());
                }
            }
        };

        maleButton.addItemListener(itemListener);
        femaleButton.addItemListener(itemListener);
        neutralButton.addItemListener(itemListener);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(centerPanel);
        mainPanel.add(bottomPanel, BorderLayout.PAGE_END);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 240);
        frame.setVisible(true);
    }

}
