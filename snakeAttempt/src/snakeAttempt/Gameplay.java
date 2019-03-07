package snakeAttempt;

import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener{

	private boolean play = false;
	int score = 0;
	int fruitScore = 1;
	
	private Timer timer;
	private int delay = 8;
	
	int snakeXpos = 300;
	int snakeYpos = 300;
	int fruitXpos = 100;
	int fruitYpos = 100;
	
	private MapGenerator map;
	
	public Gameplay() {
	map = new MapGenerator(3,7);
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
	timer = new Timer(delay, this);
	timer.start();
	}
	
	public void paint(Graphics g) {
	//background
	g.setColor(Color.black);
	g.fillRect(1,1,800,800);
	
	//drawing map
	map.draw((Graphics2D)g);
	
	//borders
	g.setColor(Color.red);
	g.fillRect(0,0,3,800);		// left
	g.fillRect(790,0,3,800);
	g.fillRect(0,0,800,3);
	g.fillRect(0,768,800,3);	//bottom
	
	//scores
	g.setColor(Color.white);
	g.setFont(new Font("serif", Font.BOLD,25));
	g.drawString(""+score,590,30);
	
	//snake
	g.setColor(Color.yellow);
	g.fillRect(snakeXpos, snakeYpos, 20, 20);
	
	}
	
	
	public void moveUp() {
	play = true;
	snakeYpos-=1;
	}
	
	public void moveDown() {
	play = true;
	snakeYpos+=1;
	}
	
	public void moveLeft() {
	play = true;
	snakeXpos-=1;
	}
	
	public void moveRight() {
	play = true;
	snakeXpos+=1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		if(play) {
			
			
			repaint();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
		if(snakeXpos>=770) {
			snakeXpos=770;
				}else {
				moveRight();
			}
		}
	
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		if(snakeXpos<=10) {
			snakeXpos=10;
				}else {
				moveLeft();
			}
		}
	
	if(e.getKeyCode() == KeyEvent.VK_UP) {
		if(snakeYpos<=0) {
			snakeYpos=0;
			}else {
			moveUp();
		}
	}
	
	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
		if(snakeYpos<=10) {
			snakeYpos=10;
			}else {
			moveDown();
		}
	}
		repaint();
	}
	

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
}
