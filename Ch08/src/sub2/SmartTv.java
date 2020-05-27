package sub2;

public class SmartTv extends TV implements Computer{

	@Override
	public void booting() {
		System.out.println("SmartTV booting...");
	}

	@Override
	public void internet() {
		System.out.println("SmartTV internet...");
	}

}
