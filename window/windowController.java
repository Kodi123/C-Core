package window;

import java.awt.Canvas;
import javax.swing.JFrame;


public class windowController extends Canvas  {
	private static final long serialVersionUID = 1L;
	
	public int width;
	public int height = width / 16 * 9;
	public int scale;
	public String title;
	
	private JFrame frame;
	private Screen screen;
	
	public windowController(int width, int scale, String title) {
		this.title = title;
		this.width = width;
		this.scale = scale;
		
		screen = new Screen(width, height, scale);
		frame = new JFrame();
		
	}
	
	
	
	

}
