package exam03;

public class ChangeTypeExam {

	public static void main(String[] args) {
		
		int nt = 15;
		long lng = 20;
		byte bt = 0;
		
		//자동 형변환
		lng = nt;
		//강제 형변환
		bt = (byte) nt;
		
		int nt2 = 130;
		byte bt2 = 0;
		
		bt2 = (byte) nt2;
		
		System.out.println("형변환1 int -> long : " + lng);
		System.out.println("형변환2 int -> byte : " + bt);
		System.out.println("형변환3 int -> byte : " + bt2);
	}

}
