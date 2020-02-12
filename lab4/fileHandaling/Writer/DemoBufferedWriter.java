import java.io.*;

class DemoBufferedWriter
{
	public static void main(String[] args) throws Exception
	{
		File fobj = new File("DemoBufferedWriter.txt");
		FileWriter fwobj = new FileWriter(fobj);
		BufferedWriter bwobj = new BufferedWriter(fwobj);
		bwobj.write("AAA\r\nBBB\r\nCCC\r\n");
		bwobj.flush();
		bwobj.close();
	}
}