package MovieManagementSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MovieManagementSystemGui extends JFrame {

   static Scanner input = new Scanner(System.in);

   JPanel panel;
   JButton button1, button2, button3, button4, button5, button6;
   JLabel label1, label2;
   JTextField text;

   public MovieManagementSystemGui() {
      setSize(350, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Movie");
      setLocationRelativeTo(null);

      panel = new JPanel();
      label1 = new JLabel("Select one number between 1 - 6");
      button1 = new JButton("Add Movies");
      button2 = new JButton("Delete Movies");
      button3 = new JButton("Edit Movies");
      button4 = new JButton("View Movies");
      button5 = new JButton("Exit");
      button6 = new JButton("FileLog");

      label1.setPreferredSize(new Dimension(300, 100));
      button1.setPreferredSize(new Dimension(300, 50));
      button2.setPreferredSize(new Dimension(300, 50));
      button3.setPreferredSize(new Dimension(300, 50));
      button4.setPreferredSize(new Dimension(300, 50));
      button5.setPreferredSize(new Dimension(300, 50));
      button6.setPreferredSize(new Dimension(300, 50));

      panel.add(label1);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);

      button1.addActionListener((ActionListener) new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            new Add_Movies();
         }
      });

      add(panel);
      setVisible(true);
   }

   public static void main(String[] args) {

	   MovieManagementSystemGui f = new MovieManagementSystemGui();

   }
}

class Add_Movies extends JFrame {
   JPanel panel;
   JButton button1, button2;
   JLabel label1, label2, label3, label4;
   JTextField text1, text2, text3, text4;

   public Add_Movies() {
      setSize(350, 700);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Movie");
      setLocationRelativeTo(null);

      panel = new JPanel();

      label1 = new JLabel("Movie Number.");
      text1 = new JTextField(10);

      label2 = new JLabel("Movie Name.");
      text2 = new JTextField(10);

      label3 = new JLabel("Choose a genre.");
      text3 = new JTextField(10);

      label4 = new JLabel("Please enter your age.");
      text4 = new JTextField(10);

      button1 = new JButton("save");
      button2 = new JButton("Exit");

      label1.setPreferredSize(new Dimension(150, 50));
      label2.setPreferredSize(new Dimension(150, 50));
      label3.setPreferredSize(new Dimension(150, 50));
      label4.setPreferredSize(new Dimension(150, 50));

      text1.setPreferredSize(new Dimension(150, 30));
      text2.setPreferredSize(new Dimension(150, 30));
      text3.setPreferredSize(new Dimension(150, 30));
      text4.setPreferredSize(new Dimension(150, 30));

      button1.setPreferredSize(new Dimension(300, 50));
      button2.setPreferredSize(new Dimension(300, 50));

      panel.add(label1);
      panel.add(text1);

      panel.add(label2);
      panel.add(text2);

      panel.add(label3);
      panel.add(text3);

      panel.add(label4);
      panel.add(text4);
      panel.add(button1);
      panel.add(button2);

      button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String number = text1.getText();
            String name = text2.getText();
            String genre = text3.getText();
            String age = text4.getText();

            String txt = "영화 장르 : " + genre + "\n"
                  + "영화 번호 : " + number + "\n"
                  + "영화 제목 : " + name + "\n"
                  + "연    령 : " + age + "\n"
                  + "====================" + "\n";
            
            String fileName = "C:\\Users/User/workspace/Log.txt";

            try {

               File file = new File(fileName);

               FileWriter fw = new FileWriter(file, true);

               fw.write(txt);
               fw.flush();

               
               fw.close();

            } catch (Exception e) {
               e.printStackTrace();
            }
            dispose();
         }
      });
      
      button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            dispose();
         }
      });

      add(panel);
      setVisible(true);
   }
}