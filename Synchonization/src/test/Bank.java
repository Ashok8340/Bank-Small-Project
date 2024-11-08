package test;

public class Bank {

	float balance = 3000.0f;
	
	public synchronized void withdrow(float amt) {
		try {
			System.out.println("withdrow start");
			if(amt > balance) {
				System.out.println("insufficient fount ....wait for deposite");
				wait();
			}
			balance -=amt;
			System.out.println("withdrow completed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		public synchronized void deposit(float amt) {
			
			System.out.println("Deposite start");
			balance += amt;
			System.out.println("Deposite completed");
			notifyAll();
		}
		
	}

