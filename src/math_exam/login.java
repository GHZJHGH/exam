package math_exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JButton btnNewButton;

	

	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Font f =new Font("Serief",Font.ITALIC+Font.BOLD,30);//设置字体
		
		JLabel lblNewLabel = new JLabel("姓名:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 33, 240, 80);
		
		lblNewLabel.setFont(f);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("专业:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(41, 154, 240, 91);
		lblNewLabel_1.setFont(f);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("班级:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(41, 289, 240, 91);
		lblNewLabel_2.setFont(f);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(f);
		textField.setBounds(371, 41, 362, 74);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(f);
		textField_1.setBounds(371, 167, 362, 74);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(f);
		textField_2.setBounds(371, 302, 362, 74);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("开始考试");
		btnNewButton.setFont(f);
		
		btnNewButton.setBounds(384, 453, 168, 59);
		contentPane.add(btnNewButton);
	}
	
	public static void main(String[] args) {
		login lg = new login();
		lg.setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student s = new Student(textField.getText(),textField_1.getText(),textField_2.getText());
				exam e = new exam(s);
				lg.dispose();
				e.btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						e.submit();
						e.dispose();
					}
				});
				e.setVisible(true);
			}
		});

	}
}
