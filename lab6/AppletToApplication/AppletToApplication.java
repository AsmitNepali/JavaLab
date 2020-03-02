class AppletToApplication
{
	int a;
	AppletToApplication()
	{
		a = 13;
	}

	public void paint()
	{
		System.out.println("Roll = " + a);
	}

	public static void main(String[] args) 
	{
		AppletToApplication obj = new AppletToApplication();
		obj.paint();
	}
}