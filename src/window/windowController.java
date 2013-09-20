package src.window;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;


public class windowController extends Canvas  {
	private static final long serialVersionUID = 1L;
	
	public int width;
	public int height;
	public int size;
	public String title;
	
	
	private JFrame frame;
	private Screen screen;
	
	public windowController(Dimension screenScale, int size, String title) {
		this.title = title;
		this.size = size;
		
		setPreferredSize(screenScale);
		
		screen = new Screen(this.width, this.height, size);
		frame = new JFrame();
		frame.setTitle(this.title);
		
	}
	
	public static void main(String[] args) {
		scale = new Scale();
		windowController window = new windowController(scale.getDimension("", 800),64,"Test");
		window.frame.setResizable(false);
		window.frame.add(window);
		window.frame.pack();
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLocationRelativeTo(null);
		window.frame.setVisible(true);
	}
}
