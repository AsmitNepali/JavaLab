import java.io.*;

class DemoMergeFile
{
	public static void main(String[] args) throws Exception
	{
		File fobj1 = new File("StringFile.txt");
		File fobj2 = new File("NumberFile.txt");

		FileReader frobj1 = new FileReader(fobj1);
		FileReader frobj2 = new FileReader(fobj2);

		BufferedReader brobj1 = new BufferedReader(frobj1);
		BufferedReader brobj2 = new BufferedReader(frobj2);

		File fobj = new File("Merge.txt");
		// FileWrirter(fobj,true) true allow us to apped data on file
		FileWriter fwobj1 = new FileWriter(fobj,true);

		BufferedWriter bwobj1 = new BufferedWriter(fwobj1);

		int i;
		int j;

		while((i = brobj1.read())!=-1)
			bwobj1.write((char)i);

		brobj1.close();
		while((j = brobj2.read())!=-1)
			bwobj1.write((char)j);

		brobj2.close();
		bwobj1.close();

	}
}