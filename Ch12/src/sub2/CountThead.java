package sub2;

public class CountThead extends Thread {
	
	private Count count;
	
	public CountThead (Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i =1 ; i<=1000;i++) {
			count.setNum();
		}
		

	}
	

}
