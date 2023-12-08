package exam04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		//키보드로부터 입력되는 값을 기다렸다가 들어오면 가져온다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년입니다.");
		}
		
		//Scanner 사용 후 닫기
		scan.close();
	}

}
