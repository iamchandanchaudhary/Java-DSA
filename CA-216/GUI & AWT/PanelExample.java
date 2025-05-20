import java.applet.Applet;
import java.awt.*;

public class PanelExample extends Applet {
    public void init() {
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));

        add(panel);
    }
}
