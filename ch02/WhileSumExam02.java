package ch02;

public class WhileSumExam02 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum = sum + i;
			i++;
		}//while 종료
		
		System.out.println("1~" + (i-1) + "까지의 합 : " + sum);

	}

}
