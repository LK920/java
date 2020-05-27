package sub1;

public class StockAccount extends Account {
	//extends �� ���� �θ�Ŭ������ �������� stockaccount�� �ڽ� Ŭ������ �ȴ�.
	//�̶� �ڽ�Ŭ������ �Ǹ� �θ�Ŭ������ ����� �ʱ�ȭ �������
	//�ڽ�Ŭ������ �ʱ�ȭ �������. �Ʒ��� stockaccount�� ��ȣ �ȿ� �̾ �ۼ��� �� 
	private String stock;
	private int amount;
	private int price;
	
	StockAccount(String bank, String id, String name, int money,
				String stock, int amount, int price) {
		super(bank, id, name, money); //super(=�θ�Ŭ����) ������ ȣ��
		//�Ʒ��� stockaccount ������ ȣ��
		this.stock = stock;
		this.amount = amount;
		this.price = price;		
	}
	
	public void sell(int amount) {
		this.amount -= amount;
	}
	
	public void buy(int amount) {
		this.amount += amount;
	}
	//�θ�Ŭ�������� ����� protected�Ѵ�. �ֳ��ϸ� protected�� �ڽ� Ŭ������ ����� ��Ӱ���
	public void info() {
		System.out.println("==================");
		System.out.println("�� �� �� : "+bank);
		System.out.println("���º�ȣ: "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ�: "+money);
		System.out.println("�ֽ�����: "+stock);
		System.out.println("�ֽļ���: "+amount);
		System.out.println("�ֽİ���: "+price);
	}
}
