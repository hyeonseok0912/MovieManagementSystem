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
		String txt = "Movie " + text + "\n" + "영화 장르 : " + genre + "\n" + "영화 번호 : " + number + "\n" + "영화 제목 : " + name
				+ "\n" + "연    령 : " + age + "\n" + "날    짜 : " + date + "\n" + "====================" + "\n";
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