package snakeTwo;

import javax.swing.ImageIcon;

public class Board {

	private final int B_WIDTH = 300;		//constant for width
	private final int B_HEIGHT = 300;		//constant for height
	private final int DOT_SIZE = 10;		//size of the apple/snake dot
	private final int ALL_DOTS = 900;		//all dots across 
	private final int RAND_POS = 29;		//calculate random position for an apple
	private final int DELAY = 140;			//defines the speed of the game
	
	private final int x[] = new int[ALL_DOTS];
	private final int y[] = new int[ALL_DOTS];
	
	private void loadImages() {
		
		ImageIcon iid = new ImageIcon("src/resources/dot.png");
		ball = iid.getImage();
		
		ImageIcon iia = new ImageIcon("src/resources/apple.png");
		apple = iia.getImage();
		
		ImageIcon iih = new ImageIcon("src/resources/head.png");
		head = iih.getImage();
	}
	
}
