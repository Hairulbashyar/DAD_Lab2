import java.io.*;

class MyFileAPI extends File 
{
	
	MyFileAPI (String filename)
	{
		super (filename);
	}
	

public static void main (String [] ar) throws Exception
{
	MyFileAPI myfile = new MyFileAPI ("My.txt");
	if(myfile.exists())
	{
		System.out.println("File Exist!");
	}
	else
	{
		System.out.println("File does not exist! Try another file name");
	}
	
	}

}

class MyReader extends FileReader
{
	File file;
	char[] content = new char[1000];
	MyReader(File file) throws Exception
	{
		super(file);
		this.file = file;
	}
	
	MyReader(String filename) throws Exception
	{
		super (filename);
		file = new File(filename);
	}
	
	
	public String readContent() throws Exception
	{
		return null;
		/*	Algorithm : Get data from file in String representation
        Input : -
        Output: String data
        // Tips: use class BufferedReader
       Start :
1.0	loop until end of file //may use .readLine with while loop
1.1	assign the string to a temporary string
1.2	append a string variable with the temporary string
2.0	Return String data
End
*/

	}
	
	public static void main (String [] args) throws Exception
	{
		MyReader reader = new MyReader("Welcome.txt");
		System.out.println(reader.readContent());
		
		File file = new File ("Welcome.txt");
		MyReader reader2 = new MyReader(file);
		System.out.println(reader2.readContent());
	}
}


