import java.io.FileInputStream;

public class LogFileLoad {
	public void FileLoad() {
		try {
			// ����Ʈ ������ �����б�
			String filePath = "C:\\Users/User/workspace/Log.txt"; // ��� ����
			FileInputStream fileStream = null; // ���� ��Ʈ��

			fileStream = new FileInputStream(filePath);// ���� ��Ʈ�� ����
			// ���� ����
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
				System.out.println(new String(readBuffer));
			}

			fileStream.close(); // ��Ʈ�� �ݱ�
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}