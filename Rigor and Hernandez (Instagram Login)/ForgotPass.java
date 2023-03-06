package loginfeature;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPass {

	JFrame frame;
	private JPasswordField passwordNewPass;
	private JPasswordField passwordReenter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass window = new ForgotPass();
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
	public ForgotPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("RESET YOUR PASSWORD");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setBounds(134, 55, 272, 50);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblNewPass = new JLabel("New Password");
		lblNewPass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewPass.setBounds(68, 125, 90, 14);
		frame.getContentPane().add(lblNewPass);
		
		passwordNewPass = new JPasswordField();
		passwordNewPass.setBounds(95, 150, 287, 29);
		frame.getContentPane().add(passwordNewPass);
		
		JLabel lblReenterPassword = new JLabel("Reenter password");
		lblReenterPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblReenterPassword.setBounds(68, 198, 166, 14);
		frame.getContentPane().add(lblReenterPassword);
		
		passwordReenter = new JPasswordField();
		passwordReenter.setBounds(95, 223, 287, 29);
		frame.getContentPane().add(passwordReenter);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Exam2 window = new Login_Exam2();
				window.frame.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(201, 263, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
