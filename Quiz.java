package Difficulty3;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		////1.��)1������ �Է��ϴ� �������� 3�� 5�� ���������
////		10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
////		1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
//		Scanner Input = new Scanner(System.in);
//		System.out.println("���ڸ��Է����ּ��� [5���� Ŀ���մϴ�]");
//		int num = Input.nextInt();
//		int sum = 0;
//		for (int i = 1; i < num; i++) {
//			if (i%3 == 0||i%5 == 0) {
//				sum += i;
//			}
//			
//		}
//		System.out.println(sum);
		
		
//		� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
//		���� ���
//		[d(91) = 9 + 1 + 91 = 101]
//		�� ��, n[91]�� d(n)[101]�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
		//
		
//		� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�.
//		�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���.
//		���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
//		1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
		
		
		
		
		
		
		
		////3.����3
//		�Է� : �ѰǼ�(m), ���������� ������ �Խù���(n) (�� n�� 1���� ũ�ų� ����. n >= 1)
//		��� : ����������
		int StopPage = 0;
		while (true) {
			
			
			
			
			Scanner Input = new Scanner(System.in);
			
			
			
			System.out.println("�Խù��� �Է�");
			int M = Input.nextInt();
			System.out.println("�������� �������� �Խù��� �Է� �Է�");
			int N = Input.nextInt();
			if (N < 0) {
				System.out.println("�Է¿��� �ٽ�Ȯ�����ּ���");
			}if (M==0 && N>=1) {
				System.out.println("1������ ����");				
			}else if (M%N == 0) {
				System.out.println(M/N+"������ ����");
			}else if (M%N !=0 ) {
				System.out.println(((M/N)+1)+"������ ����");
			}
			System.out.println("��� ����[1] ��ž[-1]");
			StopPage=Input.nextInt();
			if (StopPage == -1) {
				break;
			}else if (StopPage ==1) {
				continue;
			}else {
				System.out.println("�Է¿���");
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
