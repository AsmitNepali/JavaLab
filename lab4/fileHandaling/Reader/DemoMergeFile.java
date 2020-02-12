import java.io.*;

class DemoMergeFile
{
	public static void main(String[] args) throws Exception
	{
		File fobj1 = new File("StringFile.txt");
		File fobj2 = new File("NumberFile.txt");

		FileReader frobj1 = new FileReader(fobj1);
		FileReader frobj2 = new FileReader(fobj2);
		int i;
		int x;

		while((i = frobj1.read())!=-1)
			System.out.print((char)i);

		while((x = frobj2.read())!=-1)
			System.out.print((char)x);
		frobj1.close();
		frobj2.close();

	}
}