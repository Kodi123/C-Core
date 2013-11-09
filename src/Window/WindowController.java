package src.window;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import src.graphics.Scale;
import src.graphics.Screen;


public class WindowController extends Canvas  {
	private static final long serialVersionUID = 1L;
	
	public int width, height, size;
	
	public String title;
	public JFrame frame;
	
	private Screen screen;
	private WindowType Type;
	private static Scale scale;
	
	/**
	 * Is the window constructor to make a basic window.
	 * 
	 * @param screenScale	A dimension object that takes: resolution type and width.
	 * @param size			Size of the types.  64 is 64 pixels. (WIP)
	 * @param title			Title in string form. (DUH?)
	 */
	public WindowController(Dimension screenScale, int size, String title) {
		this.title = title;
		this.size = size;
		
		setPreferredSize(screenScale);
		
		screen = new Screen(this.width, this.height, size);
		frame = new JFrame();
		setTitle(this.title);
		
		frame.setResizable(false);
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
/*	public static void main(String[] args) {
		scale = new Scale();
		windowController window = new windowController(scale.getDimension("", 800),64,"Meep");
		window.frame.setResizable(false);
		window.frame.add(window);
		window.frame.pack();
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLocationRelativeTo(null);
		window.frame.setVisible(true);
	}*/
	
	public void setTitle(String title) {
		frame.setTitle(title);
	}

	public void getInfoType(Object windowType) {
		
		return;
		
	}

	public void setInfoType(String string) {


		
	}
}
