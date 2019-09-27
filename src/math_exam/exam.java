package math_exam;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class exam extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	
	String[] s;
	String[] a;
	ArrayList<String> l;
	ArrayList<String> l_1;
	int score;
	Student student;

	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	JButton btnNewButton_4;
	
	public exam(Student student) {
		this.student = student;
		s = new String[50];
		a = new String[50];
		score = 0;
		l_1 = new ArrayList<String>();
		random rd = new random();
		rd.rd();
		this.l = rd.list_1;
		
		int z = 0;
		Iterator it = l.iterator();
		while(it.hasNext()) {
			a[z] = (String)it.next();
			z++;
		}
		int k = 0;
		Iterator iter = rd.list.iterator();
		while(iter.hasNext()) {
			s[k] = (String)iter.next();
			k++;
		}
		
		
		setTitle("广州市X小学数学考试自动系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(166, 69, 298, 300);
		contentPane.add(panel);
		
		Font fnt = new Font("Serief",Font.ITALIC+Font.BOLD,30);
		CardLayout card = new CardLayout(0,0);
		panel.setLayout(card);
		
		StringBuffer x = new StringBuffer();
		for (int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {	
				 x.append(this.s[j+i*5]+"  =  "+"<br>");
			}
			JLabel lblNewLabel = new JLabel("<html><body>"+x+"<body></html>",SwingConstants.RIGHT);
			lblNewLabel.setBounds(10,10,20,20);
			lblNewLabel.setFont(fnt);
			panel.add(lblNewLabel,"i");
			x = new StringBuffer();
		}
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(341, 13, 203, 52);
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		CountDown cn = new CountDown();
		cn.countDown();
		panel_3.add(cn.label, BorderLayout.CENTER);
		
		panel_4 = new JPanel();
		panel_4.setBounds(515, 120, 73, 36);
		contentPane.add(panel_4);
		CardLayout card_1 = new CardLayout();
		panel_4.setLayout(card_1);
		
		panel_5 = new JPanel();
		panel_5.setBounds(515, 162, 73, 36);
		contentPane.add(panel_5);
		CardLayout card_2 = new CardLayout();
		panel_5.setLayout(card_2);
		
		
		panel_6 = new JPanel();
		panel_6.setBounds(515, 204, 73, 36);
		contentPane.add(panel_6);
		CardLayout card_3 = new CardLayout();
		panel_6.setLayout(card_3);
		
		panel_7 = new JPanel();
		panel_7.setBounds(515, 246, 73, 36);
		contentPane.add(panel_7);
		CardLayout card_4 = new CardLayout();
		panel_7.setLayout(card_4);
		
		panel_8 = new JPanel();
		panel_8.setBounds(515, 288, 73, 36);
		contentPane.add(panel_8);
		CardLayout card_5 = new CardLayout();
		panel_8.setLayout(card_5);
		
		
		for(int i=0;i<10;i++) {
			textField_2 = new JTextField();
			textField_2.setFont(fnt);
			textField_3 = new JTextField();
			textField_3.setFont(fnt);
			textField_4 = new JTextField();
			textField_4.setFont(fnt);
			textField_5 = new JTextField();
			textField_5.setFont(fnt);
			textField_6 = new JTextField();
			textField_6.setFont(fnt);
			panel_4.add(textField_2,"1_"+i);
			panel_5.add(textField_3,"2_"+i);
			panel_6.add(textField_4,"3_"+i);
			panel_7.add(textField_5,"4_"+i);
			panel_8.add(textField_6,"5_"+i);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(108, 403, 690, 52);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_3 = new JButton("首页");
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.first(panel);
				card_1.first(panel_4);
				card_2.first(panel_5);
				card_3.first(panel_6);
				card_4.first(panel_7);
				card_5.first(panel_8);
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("上一页");
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.previous(panel);
				card_1.previous(panel_4);
				card_2.previous(panel_5);
				card_3.previous(panel_6);
				card_4.previous(panel_7);
				card_5.previous(panel_8);
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("下一页");
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.next(panel);
				card_1.next(panel_4);
				card_2.next(panel_5);
				card_3.next(panel_6);
				card_4.next(panel_7);
				card_5.next(panel_8);
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("尾页");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.last(panel);
				card_1.last(panel_4);
				card_2.last(panel_5);
				card_3.last(panel_6);
				card_4.last(panel_7);
				card_5.last(panel_8);
			}
		});
		panel_1.add(btnNewButton);
		
		panel_2 = new JPanel();
		panel_2.setBounds(369, 479, 153, 52);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		btnNewButton_4 = new JButton("提交");
		btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_4.setBounds(0, 0, 153, 52);
		panel_2.add(btnNewButton_4);
	}
	
	
	
	
	
	public void submit(){
		String[] k = new String [50];
		String z = null;
		for(int i=0;i<10;i++) {
			JTextField jtf_0 = (JTextField) panel_4.getComponent(i);
			JTextField jtf_1 = (JTextField) panel_5.getComponent(i);
			JTextField jtf_2 = (JTextField) panel_6.getComponent(i);
			JTextField jtf_3 = (JTextField) panel_7.getComponent(i);
			JTextField jtf_4 = (JTextField) panel_8.getComponent(i);
			l_1.add(jtf_0.getText());
			l_1.add(jtf_1.getText());
			l_1.add(jtf_2.getText());
			l_1.add(jtf_3.getText());
			l_1.add(jtf_4.getText());
		}
		int x = 0;
		Iterator it = l_1.iterator();
		while(it.hasNext()) {
			k[x] = (String)it.next();
			x++;
		}	
		for(int i=0;i<s.length;i++) {
			if(a[i].equals(k[i])) {
				score+=2;
			}
		}
		new Dialog(score).setVisible(true);
		student.score = score;
	}
	
}
