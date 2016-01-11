package states;

public class DeadState {

	public void killProgram() {
		try {
			System.out.println("You are dead. Try better next time. Application closes in 5..");
			Thread.sleep(1000);
			System.out.println("4...");
			Thread.sleep(1000);
			System.out.println("3...");
			Thread.sleep(1000);
			System.out.println("2...");
			Thread.sleep(1000);
			System.out.println("1...");
			Thread.sleep(1000);
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
