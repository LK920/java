package p244;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		Singletion obj1 = new Singletion(); //컴파일 에러
		Singletion obj2 = new Singletion(); //컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstace();
		Singleton obj2 = Singleton.getInstace();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
