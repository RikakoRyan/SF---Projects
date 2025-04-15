import javax.swing.*;
import java.awt.*;

public class IDigLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame("I Dig Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JPanel mainPanel = new JPanel();
        mainPanel.setSize(600, 400);
        mainPanel.setLayout(null);
        frame.add(mainPanel);



        JButton button1 = new JButton("1");
        button1.setBounds(10, 10, 50, 30);
        mainPanel.add(button1);


        JTextField textField = new JTextField("text");
        textField.setBounds(70, 10, 520, 30);
        mainPanel.add(textField);


        JButton button2 = new JButton("2");
        button2.setBounds(10, 50, 580, 30);
        mainPanel.add(button2);


        JButton button3 = new JButton("3");
        button3.setBounds(10, 90, 580, 30);
        mainPanel.add(button3);


        JButton button4 = new JButton("4");
        button4.setBounds(10, 130, 280, 80);
        mainPanel.add(button4);


        JButton button5 = new JButton("5");
        button5.setBounds(300, 130, 290, 30);
        mainPanel.add(button5);


        JButton button6 = new JButton("6");
        button6.setBounds(10, 220, 130, 30);
        mainPanel.add(button6);


        JButton button7 = new JButton("7");
        button7.setBounds(150, 220, 140, 30);
        mainPanel.add(button7);


        JButton button8 = new JButton("8");
        button8.setBounds(300, 170, 290, 80);
        mainPanel.add(button8);


        JLabel label9 = new JLabel("Pretty tricky!");
        label9.setBounds(10, 300, 580, 30);
        mainPanel.add(label9);


        frame.setVisible(true);
    }
}
