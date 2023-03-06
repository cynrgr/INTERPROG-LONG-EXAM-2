package loginfeature;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Login_Exam2 {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JTextField txtForgotPassword;
	private JTextField txtSignUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Exam2 window = new Login_Exam2();
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
	public Login_Exam2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		frame.setBounds(100, 100, 404, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phone number, username, or email");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(44, 138, 245, 36);
		frame.getContentPane().add(lblNewLabel);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(36, 140, 321, 36);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(44, 185, 96, 36);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String uname = txtUsername.getText();
				String pass = txtPassword.getText();
				
				if(uname.equals("Admin") & pass.equals("admin1") || uname.equals("Secretary") & pass.equals("sec1")) {
					LoginSucessful window = new LoginSucessful();
					window.frame.setVisible(true);
					
				} else {
					
					JOptionPane.showMessageDialog(frame, "Invalid Login");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(36, 256, 321, 25);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(54, 224, 127, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(36, 185, 321, 36);
		frame.getContentPane().add(txtPassword);
		
		txtForgotPassword = new JTextField();
		txtForgotPassword.setBackground(SystemColor.controlLtHighlight);
		txtForgotPassword.setForeground(Color.BLACK);
		txtForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass window = new ForgotPass();
				window.frame.setVisible(true);
			}
		});
		txtForgotPassword.setText("Forgot password?");
		txtForgotPassword.setBounds(145, 292, 110, 25);
		frame.getContentPane().add(txtForgotPassword);
		txtForgotPassword.setColumns(10);
		
		JCheckBox showPass = new JCheckBox("Show password");
		showPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(showPass.isSelected()) {
					txtPassword.setEchoChar((char)0);
				} else {
					txtPassword.setEchoChar('*');
				}
			}
		});
		showPass.setBackground(SystemColor.text);
		showPass.setBounds(230, 225, 127, 23);
		frame.getContentPane().add(showPass);
		
		JTextPane txtpnDontHaveAn = new JTextPane();
		txtpnDontHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnDontHaveAn.setText("Don't have an account?");
		txtpnDontHaveAn.setBounds(79, 388, 146, 25);
		frame.getContentPane().add(txtpnDontHaveAn);
		
		txtSignUp = new JTextField();
		txtSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp window = new SignUp();
				window.frame.setVisible(true);
			}
		});
		txtSignUp.setBackground(UIManager.getColor("Button.highlight"));
		txtSignUp.setForeground(SystemColor.textHighlight);
		txtSignUp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtSignUp.setText("Sign up");
		txtSignUp.setBounds(230, 388, 58, 25);
		frame.getContentPane().add(txtSignUp);
		txtSignUp.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Francyne Rigor\\Pictures\\Screenshots\\Screenshot 2023-03-06 141950.png"));
		lblNewLabel_1.setBounds(53, 40, 272, 88);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("or");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(190, 328, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Log in with Facebook");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.facebook.com/"));
				} catch (IOException err) {
					
				} catch (URISyntaxException err) {
			
				}
			}
		});
		btnNewButton_1.setBackground(new Color(104, 197, 232));		
		btnNewButton_1.setBounds(59, 353, 278, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
