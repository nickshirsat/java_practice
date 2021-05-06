package awt;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet{

	public void paint(Graphics g) {
		String msg = "welcome";
		g.drawString(msg, 250, 250);
	}
/*	<applet code="MyApplet.class" width=400 height=400></applet>
*/
}
