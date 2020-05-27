package p411;

public class Anonymous {
	public RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Ƽ�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("Ƽ�� ���ϴ�.");
		}
	};
	
	public void method1() {
		//���� ������ ����
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		//���ú��� ���
		localVar.turnOn();
	}
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
