package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 >= num2);
		System.out.println(result1);
		
		char char1 = 'a';
		char char2 = 'A';
		boolean result2 = (char1 == char2);
		System.out.println(result2);

		
		int num3 = 1;
		double num4 = 1.0;
		boolean result3 = (num3 == num4);
		System.out.println(result3);
		
		double num5 = 0.2;
		float num6 = 0.1F;
		System.out.println("============================");
		boolean result4 = (num5 == (double)num6); //false (자동타입변환 float값 double에 저장)
		boolean result5 = ((float)num5 == num6); //true (강제타입변환 double값 float에 저장)
		System.out.println(result4);
		System.out.println(result5);
		
		System.out.println((int)(num5*10) == (int)(num6*10));
		System.out.println(num5);
		System.out.println(num6);
		
		double num52 = (int)(num5 * 10);
		float num62 = (int)(num6 * 10);
		int result6 = (int)(num52 - num62);
		System.out.println(result6);
		System.out.println(num52);
		System.out.println(num62);
	}

}
