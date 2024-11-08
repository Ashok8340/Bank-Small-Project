package test;

public class Custember2 extends Thread{

	Bank b;
	
	public Custember2 (Bank b) {
		this.b = b;
	}
	@Override
	public void run() {
		b.deposit(3000);
	}
}
