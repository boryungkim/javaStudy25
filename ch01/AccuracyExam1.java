package ch01;

public class AccuracyExam1 {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("남은 사과 조각 : " + result);
		System.out.println("사과 7조각 : " + number * pieceUnit);
		

	}

}
