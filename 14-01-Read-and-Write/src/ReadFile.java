import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\LENOVO\\Desktop\\test.txt");
			Scanner file = new Scanner (reader);
			/* System.in isiliye nhi h becoz hamm log user se nhi,
			  file se read kar rha h
			 */
			while (file.hasNextLine()) {
				String fileReader =file.nextLine();
				System.out.print(fileReader);
			}
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
