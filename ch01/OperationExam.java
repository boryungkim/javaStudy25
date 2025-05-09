package ch01;

public class OperationExam {

	public static void main(String[] args) {
		
		int x = 10;
		x++;
		System.out.println(x);
		
		x--;
		System.out.println(x);
		
		int y = 20;
		int result = x + y;
		System.out.println(result);
		
		boolean result1 = (result>10) ? true : false;
		System.out.println(result1);
		
		String result2 = (result>50) ? "Å©´Ù" : "ÀÛ´Ù";
		System.out.println(result2);
		
		int odd = 5;
		int div = odd%2;
		String resultodd = (div == 1) ? "È¦¼ö" : "Â¦¼ö";
		System.out.println(resultodd);
		
		int multi4 = 4;
		int div4 = multi4 % 4;
		boolean resultdiv4 = (div4 == 0) ? true : false;
		System.out.println(resultdiv4);
		
		

	}

}
