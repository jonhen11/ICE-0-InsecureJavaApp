import java.io.File;
import java.io.IOException;

public class InSecureFilePath
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Getting file ...");
			String fPath = GetFilePath(args);
		}catch(IOException e)
		{
			// Wow you don't exist
			// Or something else
		}catch(ArrayIndexOutOfBoundsException arrayOut)
		{
			System.out.println("No arguments were passed to the file searcher");
		}
    }
    
    // https://wiki.sei.cmu.edu/confluence/display/java/FIO16-J.+Canonicalize+path+names+before+validating+them
    // FIO16-J. Canonicalize path names before validating them
    private static String GetFilePath(String[] args) throws IOException
    {
        File file = new File("/img/" + args[0]);
        return file.getPath();
    }
}