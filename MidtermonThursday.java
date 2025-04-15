import javax.swing.*;
import java.awt.*;

public class MidtermonThursday {

    public static void main(String[] args) {

        JFrame frame = new JFrame("335 Midterm on Thursday!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JPanel mainPanel = new JPanel();
        mainPanel.setSize(600, 400);
        mainPanel.setLayout(null);
        frame.add(mainPanel);


        JButton nowPlayingButton = new JButton("Now Playing");
        nowPlayingButton.setBounds(10, 10, 150, 30);
        mainPanel.add(nowPlayingButton);

        JButton mediaGuideButton = new JButton("Media Guide");
        mediaGuideButton.setBounds(10, 50, 150, 30);
        mainPanel.add(mediaGuideButton);


        JButton libraryButton = new JButton("Library");
        libraryButton.setBounds(10, 90, 150, 30);
        mainPanel.add(libraryButton);


        JButton helpInfoButton = new JButton("Help & Info");
        helpInfoButton.setBounds(10, 130, 150, 30);
        mainPanel.add(helpInfoButton);


        JButton servicesButton = new JButton("Services");
        servicesButton.setBounds(10, 170, 150, 30);
        mainPanel.add(servicesButton);


        JButton button0 = new JButton("0");
        button0.setBounds(450, 10, 50, 30);
        mainPanel.add(button0);


        JButton button1 = new JButton("1");
        button1.setBounds(510, 10, 50, 30);
        mainPanel.add(button1);


        JButton button2 = new JButton("2");
        button2.setBounds(450, 50, 50, 30);
        mainPanel.add(button2);


        JButton button3 = new JButton("3");
        button3.setBounds(510, 50, 50, 30);
        mainPanel.add(button3);


        JTextField centerTextField = new JTextField();
        centerTextField.setBounds(170, 10, 280, 300);
        mainPanel.add(centerTextField);


        JButton okButton = new JButton("OK");
        okButton.setBounds(450, 200, 100, 30);
        mainPanel.add(okButton);


        JRadioButton moviesRadioButton = new JRadioButton("Movies");
        moviesRadioButton.setBounds(10, 300, 80, 30);
        mainPanel.add(moviesRadioButton);

        JRadioButton musicRadioButton = new JRadioButton("Music");
        musicRadioButton.setBounds(100, 300, 70, 30);
        mainPanel.add(musicRadioButton);

        JRadioButton videosRadioButton = new JRadioButton("Videos");
        videosRadioButton.setBounds(180, 300, 80, 30);
        mainPanel.add(videosRadioButton);

        JRadioButton dvdRadioButton = new JRadioButton("DVD");
        dvdRadioButton.setBounds(270, 300, 60, 30);
        mainPanel.add(dvdRadioButton);

        JRadioButton webPagesRadioButton = new JRadioButton("Web Pages");
        webPagesRadioButton.setBounds(340, 300, 100, 30);
        mainPanel.add(webPagesRadioButton);


        frame.setVisible(true);
    }
}
