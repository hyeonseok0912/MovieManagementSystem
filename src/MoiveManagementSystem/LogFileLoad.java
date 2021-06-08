package MoiveManagementSystem;

import java.io.FileInputStream;

public class LogFileLoad {
	public void FileLoad() {
		try {

			String filePath = "C:\\Users/User/workspace/Log.txt";
			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);

			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
				System.out.println(new String(readBuffer));
			}

			fileStream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}