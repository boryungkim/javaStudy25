package ch01;

public class VarExam {

	public static void main(String[] args) {
		int x = 1;
		char y = 65;
		char z = 'A';
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);

		int x1;
		x1 = 10;
		System.out.println("x1 : " + x1);
		
		int kor = 95, mat = 80, eng = 70;
		int total = kor + mat + eng;
		int avg = total/3;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		char firstname = '��';
		char firstName = '��';
		
		System.out.println("�� : " + firstname );
		System.out.println("�� : " + firstName);
		
		
		int literal1 = 75;
		int literal2 = 075 ; 
		int literal3 = 0b0011 ; 
		int literal4 = 0xA ;
		
		System.out.println("10���� 75 : " + literal1 );
		System.out.println("8���� 75 : " + literal2);
		System.out.println("2���� 0011 : " + literal3);
		System.out.println("16���� A : " + literal4);
		
	}

}
