package math_exam;

import java.util.*;
public class random {
	ArrayList<String> list;
	ArrayList<String> list_1;
	
	public void rd() {
		list = new ArrayList<String>();
		list_1 = new ArrayList<String>();
		Random random = new Random();
		for(int j=0;j<50;j++) {
			int [] num = new int[4];
			int y = 0;
			String e = new String();
			
			for(int i=0;i<3;i++) {
				num[i] = random.nextInt(100);		
				}
			
			int x = random.nextInt(4);
			switch(x) {
			case 0:
				e = num[0]+" + "+num[1]+" + "+num[2];
				y = num[0]+num[1]+num[2];
				break;
			case 1:
				e = num[0]+" + "+num[1]+" - "+num[2];
				y = num[0]+num[1]-num[2];
				break;
			case 2:
				e = num[0]+" - "+num[1]+" + "+num[2];
				y = num[0]-num[1]+num[2];
				break;
			case 3:
				e = num[0]+" - "+num[1]+" - "+num[2];
				y = num[0]-num[1]-num[2];
				break;
			}
			if(y<0) {
				j--;
				continue;
			}
			
			list.add(e);
			list_1.add(String.valueOf(y));
		}
	}
	
}
