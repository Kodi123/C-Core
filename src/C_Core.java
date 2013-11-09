package src;

import src.graphics.Scale;
import src.window.WindowController;


public class C_Core {
	
	WindowController window;
	Scale scale;
	
	public static void main(String[] args) { 
		new C_Core();

	}
	
	public C_Core() {
		scale = new Scale();
		window = new WindowController(scale.getDimension("", 800), 64,"Meep!");
		//window.setInfoType("Null");
		
	}

}
