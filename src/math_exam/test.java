package math_exam;

public class test {
	String [] s;
	public static void main(String[] args) {
		test t = new test();
		t.a();
		t.s();
	}
	
	test(){
		s = new String[10];
	}
	void a() {
		for (int i=0;i<10;i++) {
			this.s[i] = "as";
		}
	}
	
	void s() {
		for(int j=0;j<10;j++) {
			System.out.println(s[j]);
		}
	}
}
