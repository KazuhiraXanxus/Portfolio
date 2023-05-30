import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class skills  {

	private JPanel contentPane;


	public skills() { // Create a JFrame
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\constantino\\Downloads\\Batman-Logo.png")); // Replace the icon on the top left of the JFrame with the chosen image
		setTitle("Skills"); // Set the title of the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 462); // Dimensions and placement of the JFrame
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel SkillImg = new JLabel(""); // Create JLabel
		SkillImg.setBounds(0, 0, 866, 462);
		ImageIcon icon = new ImageIcon("C:\\Users\\constantino\\Downloads\\skills.png"); // Import an Image from the computer Storage
		Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(866, 462, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        
        JButton btnNewButton = new JButton("Return"); // Create a 
        btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
        btnNewButton.setBounds(758, 0, 89, 23);
        contentPane.add(btnNewButton);
        SkillImg.setIcon(scaledIcon);
		contentPane.add(SkillImg);
	}

}
