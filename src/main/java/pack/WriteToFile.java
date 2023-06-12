package pack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	/**
	 * Used this class to test with glassfish as that there is no easy standard output, i guess
	 */
	
	public static File file = new File("/Users/telos_matter/Desktop/log.txt");
	public static FileWriter fw = null;
	
	static {
		try {
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write (String s) {
//		try {
//			fw.write(s +"\n");
//			fw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
}
