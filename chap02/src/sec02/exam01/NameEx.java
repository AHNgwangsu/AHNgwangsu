package sec02.exam01;

import java.util.Scanner;

public class NameEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");

		System.out.println("이름");
		String name = scanner.nextLine();

		System.out.println("주민번호 앞 6자리");
		String var1 = scanner.nextLine();

		System.out.println("전화번호");
		String var2 = scanner.nextLine();

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("아이디");
		String name1 = scanner.nextLine();

		System.out.println("비밀번호");
		String password = scanner.nextLine();

		if ("이름" == "아이디") {
			if ("주민번호 앞 6자리" == "비밀번호") {
				System.out.println("로그인 성공");
				
			} else {
				System.out.println("로그인 실패");

			}
			{

			}

		}
	}
}