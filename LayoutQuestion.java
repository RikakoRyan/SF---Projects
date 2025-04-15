import java.awt.*;
import javax.swing.*;

class LayoutQuestion {
	public static void main (String[] args) {

       JFrame frame = new JFrame();
		frame.setTitle("Layout Question");
      	  JButton button = new JButton("hi");
      	  JButton button1 = new JButton("bye");
      	  JButton button2 = new JButton("long name");
     	  JButton button4 = new JButton("1");
	      JButton button5 = new JButton("2");
	      JButton button6 = new JButton("3");
	      JButton button7 = new JButton("4");
	      JButton button8 = new JButton("5");
	      JButton button9 = new JButton("6");
	      JButton button10 = new JButton("7");
          JButton button11 = new JButton("cancel");

JLabel button3 = new JLabel("button:");
JCheckBox button12 = new JCheckBox("bold");
JCheckBox button13 = new JCheckBox("Italic");
JCheckBox button14 = new JCheckBox("underline");
JCheckBox button15 = new JCheckBox("Strikeout");





       button.setBounds(150,0,350,100);
       button1.setBounds(900,0,400,100);
       button2.setBounds(500,0,400,100);
       button3.setBounds(50,0,400,100);
       button4.setBounds(350,100,450,250);
       button5.setBounds(800,100,500,250);
       button6.setBounds(350,350,225,100);
       button7.setBounds(575,350,225,100);
       button8.setBounds(350,450,225,100);
       button9.setBounds(575,450,225,100);
button10.setBounds(800,350,480,200);
       button11.setBounds(0,550,1510,100);
	   button12.setBounds(150,150,100,100);
  	   button13.setBounds(150,250,100,100);
  	   button14.setBounds(150,350,100,100);
       button15.setBounds(150,450,100,100);

              frame.add(button);
	           frame.add(button1);
	           frame.add(button2);
	           frame.add(button3);
	           frame.add(button4);
	           frame.add(button5);
frame.add(button6);
frame.add(button7);
frame.add(button8);
frame.add(button9);
frame.add(button10);
frame.add(button11);
frame.add(button12);
frame.add(button13);
frame.add(button14);
frame.add(button15);


        frame.setSize(1360, 1100);
		        frame.setLayout(null);
        frame.setVisible(true);
}
}