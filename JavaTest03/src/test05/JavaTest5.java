package test05;
/*
 * date : 2020/05/13
 * name : ������
 * content : �̱��� ��ü ��������
 */
public class JavaTest5 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car avante = factory.createCar("�ƹݶ�", 2500);
		Car sonata = factory.createCar("�ҳ�Ÿ", 3000);
		
		avante.info();
		sonata.info();
	}

}
