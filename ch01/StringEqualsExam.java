package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strval1 = "�躸��";
		String strval2 = "�躸��";
		String strval3 = new String ("�躸��");
		
		System.out.println(strval1 == strval2);
		System.out.println(strval1 == strval3);
		
		boolean eq1 = strval1.equals(strval3);
		System.out.println(eq1);

	}

}
