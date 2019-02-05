import java.io.*;

public class FileHelpers {

	// https://wiki.sei.cmu.edu/confluence/display/java/FIO04-J.+Release+resources+when+they+are+no+longer+needed
	// FIO04-J. Release resources when they are no longer needed
	public static String ReadFileContents(File f) throws IOException, FileNotFoundException
	{
		FileInputStream stream = new FileInputStream(f.getPath());
		  BufferedReader bufRead =
		      new BufferedReader(new InputStreamReader(stream));
		  StringBuilder builder = new StringBuilder();
		  String line;
		  while ((line = bufRead.readLine()) != null) {
		    builder.append(line);
		  }
		  
		  return builder.toString();
	}
}
