import javax.swing.*;

public class GoodThingIStudied {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Good Thing I studied!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 302);
        frame.setLayout(null);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");

        button1.setBounds(0, 0, 118, 30);
        button2.setBounds(118, 0, 118, 30);
        button3.setBounds(236, 0, 119, 30);
        button4.setBounds(0, 30, 177, 100);
        button5.setBounds(177, 30, 178, 100);
        button6.setBounds(0, 130, 177, 100);
        button7.setBounds(177, 130, 178, 100);


        JTextField textField = new JTextField();
        textField.setBounds(150, 230, 178, 30);

        JLabel label = new JLabel("Type stuff:");
        label.setBounds(78, 230, 80, 30);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(textField);
        frame.add(label);

        frame.setVisible(true);
    }
}