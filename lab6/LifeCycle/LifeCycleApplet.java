import java.awt.*;


public class LifeCycleApplet extends Applet
{
	public void init()
	{
		System.out.println("This is init method");
	}
	public void start()
	{
		System.out.println("This is strart method");
	}
	public void paint(Graphics g)
	{
		System.out.println("This is paint method");
	}
	public void stop()
	{
		System.out.println("This is stop method");
	}
	public void destroy()
	{
		System.out.println("This is destroy method");
	}
}
// <applet code="LifeCycleApplet.class" width="500" height="500">
// </applet>