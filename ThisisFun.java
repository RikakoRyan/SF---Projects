import javax.swing.*;
import java.awt.*;

public class ThisisFun {

    public static void main(String[] args) {

        JFrame frame = new JFrame("335 is fun");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JPanel mainPanel = new JPanel();
        mainPanel.setSize(600, 400);
        mainPanel.setLayout(null);
        frame.add(mainPanel);


        JButton button1 = new JButton("1");
        button1.setBounds(50, 50, 50, 30);
        mainPanel.add(button1);


        JButton button2 = new JButton("2");
        button2.setBounds(110, 10, 50, 30);
        mainPanel.add(button2);


        JButton button3 = new JButton("3");
        button3.setBounds(110, 50, 50, 30);
        mainPanel.add(button3);


        JButton button4 = new JButton("4");
        button4.setBounds(170, 10, 50, 30);
        mainPanel.add(button4);


        JButton button5 = new JButton("5");
        button5.setBounds(170, 50, 50, 30);
        mainPanel.add(button5);


        JButton button6 = new JButton("6");
        button6.setBounds(230, 10, 50, 30);
        mainPanel.add(button6);


        JButton button7 = new JButton("7");
        button7.setBounds(290, 10, 50, 30);
        mainPanel.add(button7);


        JButton button8 = new JButton("This is not fun");
        button8.setBounds(100, 100, 400, 80);
        mainPanel.add(button8);


        JButton button9 = new JButton("9");
        button9.setBounds(100, 200, 400, 80);
        mainPanel.add(button9);


        JLabel label1 = new JLabel("Label 1");
        label1.setBounds(10, 350, 100, 30);
        mainPanel.add(label1);


        JLabel label2 = new JLabel("Label 2");
        label2.setBounds(490, 350, 100, 30);
        mainPanel.add(label2);


        JLabel label3 = new JLabel("Send help I gvie up");
        label3.setBounds(500, 200, 100, 30);
        mainPanel.add(label3);


        frame.setVisible(true);
    }
}
