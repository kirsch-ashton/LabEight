package TaskSix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StudentComments {

    public static void main(String[] args){
        JFrame frame = new JFrame("CourseElection");
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JLabel title = new JLabel("Course Election", SwingConstants.CENTER);

        JPanel centerPanel = new JPanel(new GridLayout(0,1,0,10));
        JLabel enterComments = new JLabel("Enter comments:");
        JTextArea textArea = new JTextArea(5,30);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED ,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JButton clear = new JButton("CLEAR");
        centerPanel.add(enterComments);
        centerPanel.add(scrollPane);
        centerPanel.add(clear);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        frame.add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 340);
        frame.setVisible(true);
    }

}
