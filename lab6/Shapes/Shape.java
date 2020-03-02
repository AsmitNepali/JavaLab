import java.applet.*;
import java.awt.*;

public class Shape extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50,80,150,100);
		g.drawOval(100,100,50,50);
		g.drawLine(250,260,280,260);
	}
}

// <applet code="Shape.class" width="300" height="300">
// </applet>