package ch03;

public class ArrayCreateExam {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for (int i =0; i<3; i++) {
			sum += scores[i];
		}

		System.out.println("총점 : "+ sum);
		double avg = (double) sum /3;
		System.out.println("평균 : " + avg);
	}

}
