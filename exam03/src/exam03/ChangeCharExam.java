package exam03;

public class ChangeCharExam {

	public static void main(String[] args) {
		
		char chr = 'E';
		int num = 65;
		
		int chToNum = 0;
		char intToCh = ' ';
		
		//int와 char의 형변환
		//char -> int는 자동 형변환
		chToNum = chr;
		//int -> char는 강제 형변환
		intToCh = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToCh);
	}

}
