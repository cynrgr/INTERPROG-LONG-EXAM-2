package loginfeature;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class SignUp {

	JFrame frame;
	private JTextField txtEmail;
	private JTextField txtName;
	private JTextField txtUser;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(45, 278, 96, 34);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setForeground(Color.LIGHT_GRAY);
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFullName.setBounds(45, 162, 96, 34);
		frame.getContentPane().add(lblFullName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(35, 160, 376, 36);
		frame.getContentPane().add(txtName);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(45, 217, 96, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Mobile Number or Email");
		lblEmail.setForeground(Color.LIGHT_GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(47, 99, 173, 36);
		frame.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(35, 99, 376, 36);
		frame.getContentPane().add(txtEmail);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(35, 218, 376, 36);
		frame.getContentPane().add(txtUser);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(35, 278, 376, 36);
		frame.getContentPane().add(txtPass);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setBackground(new Color(104, 197, 232));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login_Exam2 window = new Login_Exam2();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(35, 339, 376, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Francyne Rigor\\Pictures\\Screenshots\\Screenshot 2023-03-06 141950.png"));
		lblNewLabel_1.setBounds(78, 0, 284, 99);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
