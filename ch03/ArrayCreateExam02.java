package ch03;

public class ArrayCreateExam02 {

	public static void main(String[] args) {
		int sum = add(new int[] {70,80,90});
		System.out.println("총합 : " + sum);

	}

	 static int add(int[] scores) {
		int sum =0;
		for(int i=0; i<3; i++) {
			sum+= scores[i];
		}
		return sum;
	}

}
