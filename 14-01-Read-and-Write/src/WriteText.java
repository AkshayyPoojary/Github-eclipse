import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\LENOVO\\Desktop\\test.txt",true);
			/* true as a append kaam kar rha h.....
			  jo bhi previous msg dala hoga wo bhi print hoga and agar false default hota h
			 */
			writer.write(" naya line add krta hu");
			System.out.println("writing in a file is successfull!!");

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			//printStackTrace batatyega ki konse methods call ue h and kaha error aarha h
		}

	}

}
