package p411;

public class Anonymous {
	public RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("티비를 끕니다.");
		}
	};
	
	public void method1() {
		//로컬 변수값 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		//로컬변수 사용
		localVar.turnOn();
	}
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
