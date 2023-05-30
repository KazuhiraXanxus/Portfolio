import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class abtme  {

	private JPanel contentPane;


	public abtme() { // Create JFrame
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\constantino\\Downloads\\Batman-Logo.png")); //Replace icon of JFrame
		setTitle("About Me"); //Set title for the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Return"); // Button for Return to main class
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
		btnNewButton.setForeground(Color.RED); // Color for text color
		btnNewButton.setBackground(SystemColor.desktop); // Color for background button
		btnNewButton.setBounds(761, 0, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel backgroundimg = new JLabel(""); // for background image
		backgroundimg.setBounds(0, 0, 866, 462);
		ImageIcon icon = new ImageIcon("C:\\Users\\constantino\\Downloads\\1.png");
		Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(866, 462, Image.SCALE_SMOOTH); // to scale with the Jframe itself
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        backgroundimg.setIcon(scaledIcon);
		contentPane.add(backgroundimg);
	}
}
