import java.io.FileInputStream;

public class LogFileLoad {
	public void FileLoad() {
		try {
			// 바이트 단위로 파일읽기
			String filePath = "C:\\Users/User/workspace/Log.txt"; // 대상 파일
			FileInputStream fileStream = null; // 파일 스트림

			fileStream = new FileInputStream(filePath);// 파일 스트림 생성
			// 버퍼 선언
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
				System.out.println(new String(readBuffer));
			}

			fileStream.close(); // 스트림 닫기
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}