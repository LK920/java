package test05;
/*
 * date : 2020/05/13
 * name : °­·¡±¸
 * content : ½Ì±ÛÅæ °´Ã¼ ¿¬½À¹®Á¦
 */
public class JavaTest5 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car avante = factory.createCar("¾Æ¹Ý¶¼", 2500);
		Car sonata = factory.createCar("¼Ò³ªÅ¸", 3000);
		
		avante.info();
		sonata.info();
	}

}
