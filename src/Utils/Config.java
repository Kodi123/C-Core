package src.Utils;

import java.io.FileReader;
import java.util.Hashtable;
import java.util.Scanner;

public class Config {
	
	public Hashtable<String, Integer> controls = new Hashtable<String, Integer>();
	
	public Config() {
		try {
			Scanner in = new Scanner(new FileReader("C_Core.ctrls"));
			
			while ( in.hasNextLine() ) {
				String s = in.nextLine();
				String[] parts = s.split("\\s+");
				String control = parts[0];
				String key = parts[1];
				System.out.println("Config: " + control + " " + key);
				setControl(control, key);
			}
		} catch( Exception e ) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private void setControl(String control, String key_descriptor) {
		char key;
		if ( key_descriptor.equals("SPACE") ) {
			key = ' ';
		} else {
			key = key_descriptor.charAt(0);
		}
		controls.put(control, CharToKeyEvent.convert(key));
		
	}

}

