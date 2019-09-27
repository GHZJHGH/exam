package math_exam;
import java.awt.BorderLayout;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown {
	public JLabel label;
	
	public void countDown() {
		label = new JLabel("",JLabel.CENTER);
		
		
		final long end = System.currentTimeMillis() + 1*100*60;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				long sub=end-System.currentTimeMillis();
				if(sub>0){
					updateTimer(sub);
				}else {
					System.out.print("asdasd");
					timer.cancel();
				}
			}
		},0,1000);
	}
	
	 public void updateTimer(long sub){
		 int h=(int)(sub/1000/60/60);
		 int m=(int)(sub/1000/60%60);
		 int s=(int)(sub/1000%60);
		 String str=h+":"+m+":"+s;
		 SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		 Date date=new Date();
		 Font font=new Font("Default", Font.PLAIN, 40);
		 label.setFont(font);
			try {
				date=sdf.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			label.setText(sdf.format(date));
		  
	 }
}
