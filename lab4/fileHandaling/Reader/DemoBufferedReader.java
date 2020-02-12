import java.io.*;

class DemoBufferedReader
{
	public static void main(String[] args) throws Exception
	{
		File fobj = new File("StringFile.txt");
		FileReader frobj = new FileReader();
		BufferedReader brobj = new BufferedReader(brobj);
		int i;

		while((i = brobj.read())!=-1)
			System.out.print((char)i);
		brobj.close();

	}
}