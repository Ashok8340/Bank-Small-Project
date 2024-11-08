package test;

public class Test {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		Custember1 c1 = new Custember1(b);
		Custember2 c2 = new Custember2 (b);
		
		c1.start();
         c2.start();
	}
}
