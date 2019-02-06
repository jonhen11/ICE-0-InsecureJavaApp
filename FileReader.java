// Jon Hendrickson
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
    	if (!isInSecureDir(file)) {
    	  throw new IllegalArgumentException();
    	}
    	String canonicalPath = file.getCanonicalPath();
    	if (!canonicalPath.equals("/img/java/file1.txt") &&
    	    !canonicalPath.equals("/img/java/file2.txt")) {
    	   // Invalid file; handle error
    	}
    	 
    	FileInputStream fis = new FileInputStream(f);
    }
    
    // 2
    // https://wiki.sei.cmu.edu/confluence/display/java/FIO02-J.+Detect+and+handle+file-related+errors
    // FIO02-J. Detect and handle file-related errors (Exceptions)
    private static String GetContents(File f) throws FileNotFoundException, IOException
    {
    	// add try catch to resolve error handling issue.
    	try {
    	return FileHelpers.ReadFileContents(f);
    	} catch (IOException x) {
    		  System.out.println("Read failed");
    		  System.out.prinln("Could not read file");
    		}
    }
}
