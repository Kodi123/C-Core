package src.window;

import java.awt.Dimension;

public class Scale {
	private static final long serialVersionUID = 1L;
	
	public Dimension dimension;
	
	public Dimension getDimension(String aspect, int width) {
		
		switch(aspect) {
		
		case "16:9":
			dimension = new Dimension(width, width / 16 * 9);
			return dimension;
		case "4:3":
			dimension = new Dimension(width, width / 4 * 3);
			return dimension;
			
		default:
			dimension = new Dimension(width, width / 16 * 9);
			return dimension;
			
		}
	}
	
	public Scale() {
	}
}
