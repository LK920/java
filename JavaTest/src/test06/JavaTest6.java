package test06;
/*
 * 날짜 : 2020/05/01
 * 이름 : 강래구
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		// 뒤에 붙은 ++/--는 해당 문장이 넘어가면서 증가/감소한다. 
		// 앞에 붙은 ++/--는 해당 문장에서 증가/감소한다.
		
		result = num++; // 아직 num은 0 
		System.out.println("result : "+result);
		
		result = ++num; //넘어온 num 은 1 이고 ++num으로 인해 해당 문장에서 1이 더 증가해서 num = 2
		System.out.println("result : "+result);
		
		result = num--;//num이 2인 상태 그대로 가진채 다음 문장으로 넘어갈때 -1이 된다.
		System.out.println("result : "+result);
		
		result = --num;//넘어온 num은 -1이 된 1이며 --num으로 인해 해당 문장에서 한번더 -1이 되어 0이 됨
		System.out.println("result : "+result);
	}

}
