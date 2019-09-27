package math_exam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dialog extends JDialog {

	int source;
	private final JPanel contentPanel = new JPanel();

	public Dialog(int source) {
		this.source = source;
		setBounds(750,250, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Font fnt = new Font("Serief",Font.ITALIC+Font.BOLD,20);
		JLabel lblNewLabel = new JLabel("¿¼ÊÔ³É¼¨Îª:" + source + "·Ö");
		lblNewLabel.setFont(fnt);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 81, 237, 71);
		contentPanel.add(lblNewLabel);
	}
}
