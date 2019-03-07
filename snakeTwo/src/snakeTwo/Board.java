package snakeTwo;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Board {

	private final int B_WIDTH = 300;		//constant for width
	private final int B_HEIGHT = 300;		//constant for height
	private final int DOT_SIZE = 10;		//size of the apple/snake dot
	private final int ALL_DOTS = 900;		//all dots across 
	private final int RAND_POS = 29;		//calculate random position for an apple
	private final int DELAY = 140;			//defines the speed of the game
	
	private final int x[] = new int[ALL_DOTS];	//arrays to control the joints of a snake
	private final int y[] = new int[ALL_DOTS];
	
	private int dots;						//amount of dots
	private int apple_x;					//position of the apple x and y
	private int apple_y;
	
	private boolean leftDirection = false;	//booleans that control the movement
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;
	private boolean inGame = true;
	
	private Timer timer;
	private Image ball;
	private Image apple;
	private Image head;
	
	public Board() {
		initBoard();
	}
	
	
	private void loadImages() {
		
		ImageIcon iid = new ImageIcon("src/resources/dot.png");
		ball = iid.getImage();
		
		ImageIcon iia = new ImageIcon("src/resources/apple.png");
		apple = iia.getImage();
		
		ImageIcon iih = new ImageIcon("src/resources/head.png");
		head = iih.getImage();
	}
	
	private void initGame() {
		dots=3;
		
		for(int z = 0; z < dots; z++) {
			x[z] = 50 - z * 10;
			y[z] = 50;
	}
		
	locateApple();
		
	timer=new Timer(DELAY, this);
	timer.start();	
	}
	
	private void checkApple() {
		if ((x[0])==apple_x) && (y[0]==apple_y)){
		dots++;
		locateApple();
		}
	}
	
	
}
