package sub1;
/*
 * date : 2020/05/12
 * name : ������
 * content : Ŭ���� ��� �ǽ��ϱ� ���� p288
 */
public class InheritTest {
	public static void main(String[] args) {
		
		Account nh = new Account("����","1231-11-1111","������", 10000);
		nh.deposit(10000);
		nh.withdraw(5000);
		nh.info();
		
		StockAccount kb = new StockAccount("��������","213-21-2131-2","ȫ�浿",10000,"�Ｚ����",100,30000);
		kb.deposit(50000);
		kb.withdraw(10000);
		kb.buy(100);
		kb.sell(10);
		
		kb.info();
	}
}
