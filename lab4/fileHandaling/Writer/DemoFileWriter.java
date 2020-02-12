import java.io.*;

class DemoFileWriter
{
	public static void main(String[] args) throws Exception
	{
		File fobj = new File("DemoFileWriter.txt");
		FileWriter wobj = new FileWriter(fobj);
		wobj.write("AAA\nBBB\nCCC\n");
		wobj.flush();
		wobj.close();
	}
}