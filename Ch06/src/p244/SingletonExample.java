package p244;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		Singletion obj1 = new Singletion(); //������ ����
		Singletion obj2 = new Singletion(); //������ ����
		*/
		
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		
	}

}
