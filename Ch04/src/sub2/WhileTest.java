package sub2;
/*
 * date : 2020/05/04
 * name : ������
 * content : �ݺ��� While �ǽ��ϱ�
 */
public class WhileTest {
	// declare initialize
	public static void main(String[] args) {
		
		//1���� 10���� �� while(���ǽ�){} ���ǽ��� �����̸� ���� x
		int sum = 0;
		int k   = 1; //for������ ����� �ʱ��
		while( k<=10 ) {
			sum += k; // sum += k; ��  1+1+1+1+1+1+1+1+1 .... ���ѷ���
			k++; // for������ ����� ������
		}
		System.out.println("1���� 10������ �� : "+sum);
		
		// do ~ while ������ �ѹ��� �����ϰ� ���ǿ� ���� ���� ���������� ���� ����
		int eSum = 0;
		int i = 1;
		
		do {			
			if(i%2 == 0) {
				eSum += i;	
			}
			
			i++;
			
		}while(i <=10);
		System.out.println("1���� 10���� ¦���� : "+eSum);
		
		//break �ݺ� ����� if ���ǿ� �´� ���� ���
		int num = 0;
		
		while(true) {
			
			num++;
			
			if(num%5==0 && num%7==0) {
				break; //�ݺ����� Ż��
			}
			
		}
		System.out.println("5�� 7�� �ּ� ����� : "+num);
		
		//continue
		int total = 0;
		
		for(int j=1 ; j<=10 ; j++) {
			
			if(j%2==1 ) {
				continue; //�ݺ����� ������ �̵�
			}
			
			total += j;			
			
		}
		System.out.println("1���� 10���� ¦���� : "+total);
	}

}
