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
	int fruit = 0;
	
	private Timer timer;
	private int delay = 8;
	
	int snakeXpos = 150;
	int snakeYpos = 150;
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
	g.fillRect(1,1,692,592);
	
	//drawing map
	map.draw((Graphics2D)g);
	
	//borders
	g.setColor(Color.red);
	g.fillRect(0,0,3,592);
	g.fillRect(691,0,3,592);
	g.fillRect(0,0,692,3);
	g.fillRect(0,568,692,3);
	
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
	snakeYpos+=20;
	}
	
	public void moveDown() {
	play = true;
	snakeYpos-=20;
	}
	
	public void moveLeft() {
	play = true;
	snakeXpos-=20;
	}
	
	public void moveRight() {
	play = true;
	snakeXpos+=20;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
		if(snakeXpos>=600) {
			snakeXpos=600;
				}else {
				moveRight();
			}
		}
	
	if(e.getKeyCode() == KeyEvent.VK_LEFT) {
		if(snakeXpos>=10) {
			snakeXpos=10;
				}else {
				moveLeft();
			}
		}
	
		repaint();
	}
	

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
}
