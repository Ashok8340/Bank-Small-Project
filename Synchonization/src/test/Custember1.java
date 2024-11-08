package test;

public class Custember1 extends Thread {

	Bank b;
	
	public Custember1(Bank b) {
		this.b = b;
	}
	@Override
	 public void run() {
		b.withdrow(4000);
	}
}
