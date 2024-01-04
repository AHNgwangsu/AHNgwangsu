package sec02.exam01;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 회원 정보 초기화
	        String name;
	        String id;
	        String password;
	        String phoneNumber;

	        // 회원가입
	        System.out.println("회원가입을 진행합니다.");
	        System.out.print("이름을 입력하세요: ");
	        name = scanner.nextLine();

	        System.out.print("주민번호 앞 6자리를 입력하세요: ");
	        String user = scanner.nextLine();
	        password = user.substring(0, 6); // 주민번호 앞 6자리를 비밀번호로 설정
	        id = name; // 아이디는 이름으로 설정

	        System.out.print("전화번호를 입력하세요: ");
	        phoneNumber = scanner.nextLine();

	        System.out.println("회원가입이 완료되었습니다.");

	        // 로그인 시도
	        System.out.println("\n로그인을 시도합니다. 아이디와 비밀번호를 입력하세요.");

	        for (int i = 0; i < 3; i++) {
	            System.out.print("아이디: ");
	            String inputId = scanner.nextLine();

	            System.out.print("비밀번호: ");
	            String Password = scanner.nextLine();

	            if (inputId.equals(id) && Password.equals(password)) {
	                System.out.println("로그인 성공!");
	                break;
	            } else {
	                System.out.println("로그인 실패! 다시 시도하세요.");
	            }

	            if (i == 2) {
	                System.out.println("비밀번호를 3번 틀렸습니다. 프로그램을 종료합니다.");
	            }
	        }

	        scanner.close();
	    }
	

	}


