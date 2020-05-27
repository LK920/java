package sub2;
//Account(����)�� ������ �ִ� Ư���� ��� ����
public class Account {
	
	//Ư��(�������) : ��ü�� ������ �ִ� ����
	// - ���ٱ��� private �������� ������ ĸ��ȭ�Ѵ�.
	private String bank; //�����̸� Ư��
	private String id;	
	private String name;
	private int money;
	
	// ������ : ��ü�� ������ �� ��������� �ʱ�ȭ�ϴ� �޼���
	Account (String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	//���(�޼���)
	public void deposit(int money) {
		this.money += money; //this�� account Ŭ������ �����ϴ� ���ô���
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void info() {
		System.out.println("==============");
		System.out.println("����� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա� �� : "+name);
		System.out.println("��ü�ݾ� : "+money);
	}
}
