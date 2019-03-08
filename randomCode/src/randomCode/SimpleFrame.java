package randomCode;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class SimpleFrame {

	public static void main(String[] args) {
		//JFrame, JPanel objects and naming them and creating them
		JFrame frame = new JFrame();	
		JPanel panel = new JPanel();
		
		//calling JPanel, settings background to color black
		panel.setBackground(Color.BLACK);
		//adding component to the frame (the panel to the frame)
		frame.getContentPane().add(panel);
		
		//creating a button
		JButton button = new JButton("This is a button"); 
		//adding the button to the panel
		panel.add(button); 								 
		
		JTextField textField = new JTextField("This is a textfield");
		textField.setPreferredSize(new Dimension(200, 15));
		panel.add(textField);
		
		//Setting the frame size
		frame.setSize(new Dimension(500,400));
		//Set the start position to center
		frame.setLocationRelativeTo(null);
		//Set a default close action ( exit button )
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set a title
		frame.setTitle("A simple JFrame");
		//Disable resizing option
		frame.setResizable(false);
		//Display the frame
		frame.setVisible(true);
		
	}
	
}