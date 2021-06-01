import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuManager extends JFrame {

	static Scanner input = new Scanner(System.in);

	JPanel panel;
	JButton button1, button2, button3, button4, button5, button6;
	JLabel label1, label2;
	JTextField text;

	public MenuManager() {
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

		MenuManager f = new MenuManager();

	}

	public int number() {
		System.out.print("Movie Number");
		int number = input.nextInt();
		return number;
	}

	public String name() {
		System.out.print("Movie Name");
		String name = input.next();
		return name;
	}

	public int genre() {
		System.out.println("장르를 입력하시오.");
		System.out.println("1. Horror   2. Romance   3. Thriller   4.SF");
		int genre_number = input.nextInt();
		return genre_number;
	}

	public String age() {
		System.out.println("연령을 입력하시오.");
		String age = input.next();
		return age;
	}

	public int number(String update) {
		System.out.print(update + "Movie Number");
		int number = input.nextInt();
		return number;
	}

	public String name(String update) {
		System.out.print(update + "Movie Name");
		String name = input.next();
		return name;
	}

	public int genre(String update) {
		System.out.println(update + "장르를 입력하시오.");
		System.out.println("1. Horror   2. Romance   3. Thriller   4.SF");
		int genre_number = input.nextInt();
		return genre_number;
	}

	public String age(String update) {
		System.out.println(update + "연령을 입력하시오.");
		String age = input.next();
		return age;
	}
}

class Add_Movies extends JFrame {
	JPanel panel;
	JButton button;
	JLabel label1, label2, label3, label4;
	JTextField text1, text2, text3;
	JCheckBox check1, check2, check3, check4;

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
		check1 = new JCheckBox("1. Horror", false);
		check2 = new JCheckBox("2. Romance", false);
		check3 = new JCheckBox("3. Thriller", false);
		check4 = new JCheckBox("4. SF", false);

		label4 = new JLabel("Please enter your age.");
		text3 = new JTextField(10);

		button = new JButton("Exit");

		label1.setPreferredSize(new Dimension(150, 50));
		label2.setPreferredSize(new Dimension(150, 50));
		label3.setPreferredSize(new Dimension(300, 50));
		label4.setPreferredSize(new Dimension(150, 50));

		text1.setPreferredSize(new Dimension(150, 30));
		text2.setPreferredSize(new Dimension(150, 30));
		text3.setPreferredSize(new Dimension(150, 30));

		check1.setPreferredSize(new Dimension(150, 50));
		check2.setPreferredSize(new Dimension(150, 50));
		check3.setPreferredSize(new Dimension(150, 50));
		check4.setPreferredSize(new Dimension(150, 50));

		button.setPreferredSize(new Dimension(300, 50));

		panel.add(label1);
		panel.add(text1);

		panel.add(label2);
		panel.add(text2);

		panel.add(label3);
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check4);

		panel.add(label4);
		panel.add(text3);
		panel.add(button);

		add(panel);
		setVisible(true);
	}
}

class Age extends MenuManager {

	@Override
	public String age() {
		String age = "전체 이용가";
		return age;
	}
}