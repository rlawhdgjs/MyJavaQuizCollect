package Difficulty3;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		////1.번)1번부터 입력하는 수까지에 3과 5의 배수들의합
////		10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
////		1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
//		Scanner Input = new Scanner(System.in);
//		System.out.println("숫자를입력해주세요 [5보단 커야합니다]");
//		int num = Input.nextInt();
//		int sum = 0;
//		for (int i = 1; i < num; i++) {
//			if (i%3 == 0||i%5 == 0) {
//				sum += i;
//			}
//			
//		}
//		System.out.println(sum);
		
		
//		어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
//		예를 들어
//		[d(91) = 9 + 1 + 91 = 101]
//		이 때, n[91]을 d(n)[101]의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
		//
		
//		어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
//		그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
//		예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
//		1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
		
		
		
		
		
		
		
		////3.문제3
//		입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//		출력 : 총페이지수
		int StopPage = 0;
		while (true) {
			
			
			
			
			Scanner Input = new Scanner(System.in);
			
			
			
			System.out.println("게시물수 입력");
			int M = Input.nextInt();
			System.out.println("페이지당 보여지는 게시물수 입력 입력");
			int N = Input.nextInt();
			if (N < 0) {
				System.out.println("입력오류 다시확인헤주세요");
			}if (M==0 && N>=1) {
				System.out.println("1페이지 생성");				
			}else if (M%N == 0) {
				System.out.println(M/N+"페이지 생성");
			}else if (M%N !=0 ) {
				System.out.println(((M/N)+1)+"페이지 생성");
			}
			System.out.println("계속 진행[1] 스탑[-1]");
			StopPage=Input.nextInt();
			if (StopPage == -1) {
				break;
			}else if (StopPage ==1) {
				continue;
			}else {
				System.out.println("입력오류");
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
