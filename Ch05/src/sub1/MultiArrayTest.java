package sub1;
/*
 * date : 2020/05/04
 * name : ������
 * content : ������ �迭 �ǽ��ϱ�
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		//�迭 �̸��� ���̹� �� �� ������ �ؾ��Ѵ�.
		// 1���� �迭 - ��������
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int score : scores ) {
			sum += score;
			
		}
		System.out.println("�迭 scores�� �� : "+sum);
		
		// 2���� �迭(�࿭)
		int arr2d[][] = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9,10,11,12}};
		
		for(int a=0; a<arr2d.length; a++) {
			for(int b=0; b <arr2d[a].length ; b++) {
				
				System.out.println("�迭 arr2d�� "+(a+1)+"�� "+(b+1)+"�� ���� : "+arr2d[a][b]);
			}
			
		}
				
		// 3���� �迭 ��,��,�� ��
		int arr3d[][][] = {{{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9},
							{10,11,12}},
						   {{13,14,15},
							{16,17,18},
							{19,20,21},
							{22,23,24}},
						   {{25,26,27},
							{28,29,30},
							{31,32,33},
							{34,35,36}}};
		
		for(int c = 0; c<arr3d.length ;c++) {
			for(int d = 0; d<arr3d[c].length ;d++) {
				for(int e = 0; e<arr3d[c][d].length ;e++) {
					System.out.println("3���� �迭 "+(c+1)+"�� "+(d+1)+"�� "+(e+1)+"�� : "+arr3d[c][d][e]);
				}
			}
		

	}} //System.out.println("3���� �迭 n1�� n2�� n3�� : "+arr3d[n1][n2][n3]); �̷��� �������� ����ص���
}
