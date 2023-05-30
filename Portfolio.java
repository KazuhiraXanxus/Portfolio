import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Portfolio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Portfolio frame = new Portfolio();
		frame.setVisible(true);

	}


	public Portfolio() { // open jrame for the main class
		setTitle("Portfolio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton aboutme = new JButton("About me"); // A button for About me
		aboutme.setBackground(new Color(176, 196, 222));
		aboutme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abtme newframeabtme = new abtme(); 
				newframeabtme.setVisible(true);
				// Close the current frame or main frame
                dispose();
			}
		});
		aboutme.setBounds(70, 54, 156, 56);
		contentPane.add(aboutme);

		JButton Workanddesigns = new JButton("Work and designs"); // A button for Work and designs
		Workanddesigns.setBackground(new Color(176, 196, 222));
		Workanddesigns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wad newframewad = new wad(); 
				newframewad.setVisible(true);
				// Close the current frame or main frame
                dispose();
			}
		});
		Workanddesigns.setBounds(326, 324, 156, 56);
		contentPane.add(Workanddesigns);
		
		JButton skills = new JButton("Skills"); // A button for Skills
		skills.setBackground(new Color(176, 196, 222));
		skills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				skills newframeskills = new skills(); 
				newframeskills.setVisible(true);
				// Close the current frame or main frame
                dispose();
			}
		});
		skills.setBounds(613, 54, 156, 56);
		contentPane.add(skills);
		
		JLabel backgroundimg = new JLabel(""); // Create background image 
		backgroundimg.setBounds(0, 0, 866, 462);
		ImageIcon icon = new ImageIcon("C:\\Users\\constantino\\Downloads\\xanxusbanner.png");
		Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(866, 462, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        backgroundimg.setIcon(scaledIcon);
		contentPane.add(backgroundimg);
	}
}
