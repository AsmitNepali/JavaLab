import java.applet.*;
import java.awt.*;

public class ParamApplet extends Applet
{
	public void paint(Graphics g)
	{
		String str = getParameter("msg");
		String str1 = getParameter("nick");
		g.drawString(str,50,50);
		g.drawString(str1,60,60);
	}
}

// <applet code="ParamApplet.class" width="300" height="300">
// <param name="msg" value="My name is Asmit Nepali">
// <param name="nick" value="My name is Joe Smith">
// </applet>
