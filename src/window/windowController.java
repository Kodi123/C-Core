package src.window;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;


public class WindowController extends Canvas  {
	private static final long serialVersionUID = 1L;
	
	public int width;
	public int height;
	public int size;
	public String title;
	
	
	private JFrame frame;
	private Screen screen;
	
	public WindowController(Dimension screenScale, int size, String title) {
		this.title = title;
		this.size = size;
		
		setPreferredSize(screenScale);
		
		screen = new Screen(this.width, this.height, size);
		frame = new JFrame();
		frame.setTitle(this.title);
		
	}
	
	public static void main(String[] args) {
		Scale scale = new Scale();
		WindowController window = new WindowController(scale.getDimension("", 800),64,"Test");
		window.frame.setResizable(false);
		window.frame.add(window);
		window.frame.pack();
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLocationRelativeTo(null);
		window.frame.setVisible(true);
	}
}
