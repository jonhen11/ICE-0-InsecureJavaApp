// Bailey Miller
// File content reader using a Stream
// 2-5-2019 (4:30 PM)


import java.io.*;

public class FileHelpers {

	// 3
	// https://wiki.sei.cmu.edu/confluence/display/java/FIO04-J.+Release+resources+when+they+are+no+longer+needed
	// FIO04-J. Release resources when they are no longer needed
	public static String ReadFileContents(File f) throws IOException, FileNotFoundException
	{
	try(FileInputStream stream = new FileInputStream(f.getPath())
		  BufferedReader bufRead =
		      new BufferedReader(new InputStreamReader(stream))){
		  StringBuilder builder = new StringBuilder();
		  String line;
		  while ((line = bufRead.readLine()) != null) {
		    builder.append(line);
		  }
	
	} catch (IOException e) {
	  System.out.println("Could not release recourses.")
		  
		  return builder.toString();
	}
}
