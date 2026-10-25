package TaskThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class TaskThree {
    private static final ArrayList<String> selectedSkills = new ArrayList<>();
    private static JTextArea textArea;

    public static void main(String[] args){
        JFrame frame = new JFrame("StudentSkills");
        JPanel panel = new JPanel(new BorderLayout(10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JLabel label = new JLabel("Student Skills", SwingConstants.CENTER);
        panel.add(label, BorderLayout.PAGE_START);

        JPanel middlePanel = new JPanel(new GridLayout(6,1));
        JLabel midTitle = new JLabel("Select your skills");
        JCheckBox c1 = new JCheckBox("Java");
        JCheckBox c2 = new JCheckBox("Web Development");
        JCheckBox c3 = new JCheckBox("Database");
        JCheckBox c4 = new JCheckBox("Networking");
        JCheckBox c5 = new JCheckBox("Cybersecurity");
        middlePanel.add(midTitle);
        middlePanel.add(c1);
        middlePanel.add(c2);
        middlePanel.add(c3);
        middlePanel.add(c4);
        middlePanel.add(c5);
        panel.add(middlePanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout(5,5));
        JLabel botTitle = new JLabel("Selected Skills");
        textArea = new JTextArea(5,30);

        bottomPanel.add(botTitle, BorderLayout.NORTH);
        bottomPanel.add(textArea);
        panel.add(bottomPanel, BorderLayout.PAGE_END);

        ItemListener skillListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox source = (JCheckBox) e.getSource();
                String skillName = source.getText();

                if(e.getStateChange() == ItemEvent.SELECTED){
                    if (!selectedSkills.contains(skillName)) {
                        selectedSkills.add(skillName);
                    }
                } else if (e.getStateChange() == ItemEvent.DESELECTED){
                        selectedSkills.remove(skillName);
                }
                updateTextArea();
            }
        };

        c1.addItemListener(skillListener);
        c2.addItemListener(skillListener);
        c3.addItemListener(skillListener);
        c4.addItemListener(skillListener);
        c5.addItemListener(skillListener);

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,320);
        frame.setVisible(true);
    }

    private static void updateTextArea() {
        StringBuilder sb = new StringBuilder();
        for (String skill : selectedSkills) {
            sb.append(skill).append("\n");
        }
        textArea.setText(sb.toString());
    }
}
