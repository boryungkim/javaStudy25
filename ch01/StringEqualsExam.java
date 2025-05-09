package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strval1 = "±èº¸·É";
		String strval2 = "±èº¸·É";
		String strval3 = new String ("±èº¸·É");
		
		System.out.println(strval1 == strval2);
		System.out.println(strval1 == strval3);
		
		boolean eq1 = strval1.equals(strval3);
		System.out.println(eq1);

	}

}
