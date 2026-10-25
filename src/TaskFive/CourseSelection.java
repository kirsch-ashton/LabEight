package TaskFive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CourseSelection {
    public static String[] courses = {"BS Information Systems", "BS Computer Science", "BS Information Technology", "Associate in Computer Technology"};

    public static void main(String[] args){
        JFrame frame = new JFrame("CourseElection");
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JLabel title = new JLabel("Course Election", SwingConstants.CENTER);

        JPanel centerPanel = new JPanel(new GridLayout(0,1,0,10));
        JLabel selectCourse = new JLabel("Select Course");
        JComboBox<String> courseList = new JComboBox<>(courses);
        centerPanel.add(selectCourse);
        centerPanel.add(courseList);

        JPanel bottomPanel = new JPanel(new GridLayout(0, 1,0,10));
        JLabel selectedText = new JLabel("Selected");
        JTextField selected = new JTextField(15);
        bottomPanel.add(selectedText);
        bottomPanel.add(selected);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getSource() == courseList){
                    String res = (String) courseList.getSelectedItem();
                    selected.setText(res);
                }
            }
        };

        courseList.addItemListener(itemListener);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 240);
        frame.setVisible(true);
    }

}
