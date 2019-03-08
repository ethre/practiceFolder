package randomCode;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrganizedGUI extends JFrame {
	
	private JButton buttonCounter, buttonReset;
	private JLabel labelCount;
	
	private int clicks = 0;
	
	private OrganizedGUI(){
	createView();
	
	setTitle("Click me");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pack(); // automatically packs everything together (sizes the interface) for the user to see
	setLocationRelativeTo(null);
	setResizable(false);
	
	}
	
	private void createView() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		labelCount = new JLabel("");
		labelCount.setPreferredSize(new Dimension(200,30));
		panel.add(labelCount);
		updateCounter();
		
		buttonCounter = new JButton("Click me");
		buttonCounter.addActionListener(new ButtonCounterActionListener());
		panel.add(buttonCounter);
		
		buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		clicks=0;
		updateCounter();
		}
		});
		panel.add(buttonReset);
	}
	
	public void updateCounter() {
		labelCount.setText("Clicked " + clicks + " times");
	}

	public static void main(String[] args) {
	
	SwingUtilities.invokeLater(new Runnable(){
	@Override
	public void run() {
	new OrganizedGUI().setVisible(true);
			}
		});
	}
	
	private class ButtonCounterActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
	clicks++;
	updateCounter();
			}
		}
	}


