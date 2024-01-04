package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class GuguQuizEx {
	public static int creatNumber() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

	public static void multiplication() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		// 1부터 9까지의 난수 생성
		int num1 = random.nextInt(10) + 1;
		int num2 = random.nextInt(99) + 1;
		int multi = num1 * num2;
		// 정답 계산
		int answer = num1 * num2;

		// 문제 출력
		System.out.printf("%d X %d = ?\n", num1, num2);
		for (;;) {
			System.out.print("입력>");

			int answer1 = Integer.parseInt(scan.nextLine());
			if (answer1 == multi) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("오답입니다");
			}
		}
	}

	public static void main(String[] ar) {
		for (int i = 0; i < 3; i++) {
			multiplication(); // 위 코드 (메소드) 가지고와서 3번 반복 :3번 문제 푸는것
		}
		System.out.println("종료");
	}

}
