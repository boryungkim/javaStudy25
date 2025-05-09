package ch01;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue =123456789;
		byte byteValue = (byte)intValue;
		
		System.out.println(intValue);
		System.out.println(byteValue);
		
		int kor = 100;
		int eng = 99;
		int mat = 97;
		int total = kor + eng + mat;
		
		System.out.println("==============¼ºÀûÇ¥================");
		System.out.println("ÃÑÁ¡ : " + total);
		
		double avg = total/3;
		System.out.println("Æò±Õ : " + avg);
		
	}

}
