package sub1;
/*
 * date : 2020/05/04
 * name : 강래구
 * content : 다차원 배열 실습하기
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		//배열 이름을 네이밍 할 때 복수로 해야한다.
		// 1차원 배열 - 선형구조
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int score : scores ) {
			sum += score;
			
		}
		System.out.println("배열 scores의 합 : "+sum);
		
		// 2차원 배열(행열)
		int arr2d[][] = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9,10,11,12}};
		
		for(int a=0; a<arr2d.length; a++) {
			for(int b=0; b <arr2d[a].length ; b++) {
				
				System.out.println("배열 arr2d의 "+(a+1)+"행 "+(b+1)+"열 원소 : "+arr2d[a][b]);
			}
			
		}
				
		// 3차원 배열 면,행,열 순
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
					System.out.println("3차원 배열 "+(c+1)+"면 "+(d+1)+"행 "+(e+1)+"열 : "+arr3d[c][d][e]);
				}
			}
		

	}} //System.out.println("3차원 배열 n1면 n2행 n3열 : "+arr3d[n1][n2][n3]); 이렇게 갯수별로 출력해도됨
}
