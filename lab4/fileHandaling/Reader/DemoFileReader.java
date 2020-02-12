import java.io.*;

class DemoFileReader
{
	public static void main(String[] args) throws Exception
	{
		File fobj = new File("StringFile.txt");
		FileReader frobj = new FileReader(fobj);
		int i;

		while((i = frobj.read())!=-1)
			System.out.print((char)i);
		frobj.close();

	}
}