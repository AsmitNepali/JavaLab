import java.io.*;

class DemoPrintWriter
{
	public static void main(String[] args) throws Exception
	{
		File fobj = new File("DemoPrintWriter.txt");
		FileWriter fwobj = new FileWriter(fobj);
		PrintWriter pwobj = new PrintWriter(fwobj);
		pwobj.write("AAA\nBBB\nCCC\n");
		pwobj.flush();
		pwobj.close();
	}
}