package sub2;
/*
 * date : 2020/05/18
 * name : 강래구
 * content : String 멤버 실습하기  p5
 * 
 */
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		//length - 문자열의 길이(문자갯수)
		System.out.println("str 문자열 길이 : "+str.length());
		
		//charAt - 문자열에서 특정문자 추출
		System.out.println("str의 6번째 문자:"+str.charAt(6));
		
		//substring - 문자열 자르기
		System.out.println("str의 0번에서 5번까지 문자열 :"+str.substring(0,5));
		System.out.println("str의 6번에서 마지막까지 문자열 :"+str.substring(6));
		
		//indexOf, lastIndexOf -
		int idx1 = str.indexOf("e"); //-문자열 앞에서부터 찾는거
		int idx2 = str.lastIndexOf("e"); //-찾는 문자열의 마지막 위치를 문자열 뒤에서 부터 찾는것
		System.out.println("문자열 str에서 문자 e의 인덱스값 : "+idx1);
		System.out.println("문자열 str에서 문자 e의 인덱스값 : "+idx2);
		
		//replace 
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newStr);
		
		//valueOf - 일반타입 변수를 문자열로 변장 
		int     var1 = 1;
		double  var2 = 2.12;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);;
		String s3 = ""+var3;
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
	}

}
