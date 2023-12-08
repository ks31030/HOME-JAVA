package exam02;

public class CompareExam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 12;
		
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(c == b);
		System.out.println(a != b);
		
		//논리연산자 &&(AND : 논리곱) ||(OR : 논리합)
		System.out.println((a < b) && (b > c));
		System.out.println((a > b) || (b > c));
	}

}
