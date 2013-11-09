package src;

import src.Graphics.Scale;
import src.Window.WindowController;
import src.Utils.Config;

public class C_Core {
	
	WindowController window;
	Scale scale;
	Config config;
	
	public static void main(String[] args) { 
		new C_Core();

	}
	
	public C_Core() {
		scale = new Scale();
		window = new WindowController(scale.getDimension("", 800), 64,"Meep!");
		//window.setInfoType("Null");
		
		config = new Config();
	}

}
