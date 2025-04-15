import javax.swing.*;
import java.awt.*;

public class Title {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JPanel mainPanel = new JPanel();
        mainPanel.setSize(300, 200);
        mainPanel.setLayout(null);
        frame.add(mainPanel);


        JRadioButton hueyRadioButton = new JRadioButton("Huey");
        hueyRadioButton.setBounds(10, 30, 60, 20);
        mainPanel.add(hueyRadioButton);

        JRadioButton dueyRadioButton = new JRadioButton("Duey");
        dueyRadioButton.setBounds(70, 30, 60, 20);
        mainPanel.add(dueyRadioButton);

        JRadioButton louieRadioButton = new JRadioButton("Louie");
        louieRadioButton.setBounds(130, 30, 60, 20);
        louieRadioButton.setSelected(true);
        mainPanel.add(louieRadioButton);


        JTextArea textArea = new JTextArea("Monospaced\nSansSerif\nSerif");
        textArea.setBounds(10, 60, 80, 60);
        textArea.setEditable(false);
        mainPanel.add(textArea);


        JLabel louieLabel = new JLabel("Louie");
        louieLabel.setBounds(100, 80, 100, 30);
        louieLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        louieLabel.setForeground(Color.BLUE);
        mainPanel.add(louieLabel);


        frame.setVisible(true);
    }
}
