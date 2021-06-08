package MoiveManagementSystem;

import java.io.File;
import java.io.FileWriter;

public class LogFileUpload extends Movie {

	public LogFileUpload(String name, int number, String genre, String age, String date) {
		super(name, number, genre, age, date);
	}

	public void Upload(int select) {

		String text = "";

		switch (select) {
		case 1:
			text = "Upload";
			break;
		case 2:
			text = "Delete";
			break;
		case 3:
			text = "Update";
			break;
		}
		String txt = "Movie " + text + "\n" + "��ȭ �帣 : " + genre + "\n" + "��ȭ ��ȣ : " + number + "\n" + "��ȭ ���� : " + name
				+ "\n" + "��    �� : " + age + "\n" + "��    ¥ : " + date + "\n" + "====================" + "\n";
		String filePath = "C:\\Users/User/workspace/Log.txt";

		try {

			File file = new File(filePath);

			FileWriter fw = new FileWriter(file, true);

			fw.write(txt);
			fw.flush();

			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}