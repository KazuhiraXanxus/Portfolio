import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class wad extends Portfolio {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public wad() {//Whole block of code consist of settings for the JFrame
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\constantino\\Downloads\\Batman-Logo.png")); // Replace the icon on the top left of the frame with the chosen image
		setTitle("Works and Design"); // Set the JFrame title to Work and Designs
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 500); // JFrame's dimension and position
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel backgroundimg = new JLabel(""); // create a JLabel
		backgroundimg.setBounds(0, 0, 866, 462);
		ImageIcon icon = new ImageIcon("C:\\Users\\constantino\\Downloads\\2.png"); //Import an image from storage
		Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(866, 462, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        
        JButton btnNewButton = new JButton("Back"); // Create a button reporting back to the main frame which is Portfolio
        btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Create a JOption where the program asks to confirm whenever you are to go back to the main frame or not
                int option = JOptionPane.showOptionDialog(null, "Are you sure you want to go back to the main menu?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (option == JOptionPane.YES_OPTION) {
                 // Create and show the other frame
                 Portfolio main = new Portfolio();
                 main.setVisible(true);
                 // Close the current frame
                 dispose();
                    }
                }
            });
        btnNewButton.setBounds(758, 0, 108, 23);
        contentPane.add(btnNewButton);
        backgroundimg.setIcon(scaledIcon);
		contentPane.add(backgroundimg);
	}
}
