package sub2;
/*
 * date : 2020/04/29
 * name : 강래구
 * content : 변수의 자료형(데이터 타입) 실습하기
 * 
 */
public class DataTypeTest {
	
	public static void main(String[] args) {
		
		
		//정수형 공간의 크기 차이 byte에서 long으로 갈 수록 데이터 공간이 커짐
		byte var1 =1; //최대127까지만 저장 
		short var2 =2; 
		int var3 = 3; //최대 2147483647까지 저장 여튼 이게 잘스임
		long var4 = 4;
 
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		//실수형 float은 접미사 f를 꼭 붙여야함 또한 소수점은 8자리에서 반올림하여 7자리 밖에 안나온다.	
		
		float var5 = 1.123456789f;
		double var6 = 1.123456789;
		
		System.out.println("var5 :"+var5);
		System.out.println("var6 :"+var6);
		
		//논리형
		
		boolean var7= true;
		boolean var8 = false;
		System.out.println("var7 :"+var7);
		System.out.println("var8 :"+var8);
				
		//문자형
		
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.println("ch1 ="+ch1);
		System.out.println("ch2 ="+ch2);
		
		
		//문자열(단어)
		String str1 = "A";
		String str2 = "hello";
		String str3 = "안녕!";
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	}

}
