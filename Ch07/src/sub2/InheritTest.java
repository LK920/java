package sub2;
/*
 * date : 2020/05/12
 * name : ������
 * content : Ŭ���� ��� �ǽ��ϱ�
 */
// �ڹٿ����� ���� ��� ���� ����
public class InheritTest {
	
	public static void main(String[] args) {
		
		SalaryStudent kim = new SalaryStudent("������", 31, "�ΰ��", "�濵��", "Samsung");
		Student lee = new Student("�̼���", 25, "�λ��", "������");
		
		kim.hello();
		lee.hello();
	}
}
