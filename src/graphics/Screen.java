/*
 * 
 */
package src.Graphics;

import java.util.Random;

public class Screen {
	
	public int width, height;
	
	public int MAP_SIZE;
	
	public int MAP_SIZE_MASK = MAP_SIZE - 1;
	
	public int[] pixels;
	
	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
	
	private Random random = new Random();
	
	public Screen(int width, int height, int size) {
		this.width = width;
		this.height = height;
		MAP_SIZE = size;
		pixels = new int[width * height];
		
		/*for ( int i = 0; i < MAP_SIZE * MAP_SIZE; i++ ) {
			tiles[i] = random.nextInt(0xffffff);
			tiles[0] = 0;
		}*/
	}
	
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}


}
