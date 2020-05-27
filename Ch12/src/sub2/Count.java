package sub2;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	//동기화 블록선언으로 스레트간 경합을 막는다. public synchronized void를 해도됨
	public void setNum() {
		synchronized(this) {
			num++;	
		}
		
	}
}
