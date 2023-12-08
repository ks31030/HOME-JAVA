package exam02;

public class UpDownExam {

	public static void main(String[] args) {
		
		int num = 10;
		int sum = 0;
		
		sum = num++;
		
		String str = "";
		
		System.out.println("sum = " + sum + ", num : " + num);
		
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num : " + num);
	}

}

/*
sum = num++;
 	뒤에 증감연산자가 붙으면 연산 후 증가.

sum = ++num;
	앞에 증감연산자가 붙으면 연산 전 증가.
 */
