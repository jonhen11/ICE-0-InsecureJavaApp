// Bailey Miller
// File reading application that when passed the file name through the args will access the first file
// With 3 major problems that need fixed
// 2-5-2019 (4:30 PM)

import java.io.*;

public class FileReader
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Getting file ...");
			String fPath = GetFilePath(args);
			System.out.print(GetContents(new File(fPath)));
		}catch(ArrayIndexOutOfBoundsException arrayOut)
		{
			System.out.println("No arguments were passed to the file searcher");
		}
    }
    
	// 1
    // https://wiki.sei.cmu.edu/confluence/display/java/FIO16-J.+Canonicalize+path+names+before+validating+them
    // FIO16-J. Canonicalize path names before validating them
    private static String GetFilePath(String[] args)
    {
        File file = new File("/img/" + args[0]);
        return file.getPath();
    }
    
    // 2
    // https://wiki.sei.cmu.edu/confluence/display/java/FIO02-J.+Detect+and+handle+file-related+errors
    // FIO02-J. Detect and handle file-related errors (Exceptions)
    private static String GetContents(File f) throws FileNotFoundException, IOException
    {
    	return FileHelpers.ReadFileContents(f);
    }
}