import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="MyApplet" width="300" height="200"></applet> */

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 100);
    }
}