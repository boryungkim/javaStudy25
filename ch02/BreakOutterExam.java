package ch02;

public class BreakOutterExam {

	public static void main(String[] args) {
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			Outter: for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'c') {
					break Outter;

				} // if
			} // for (lower)
		} // for(upper)

	}//main method

}//class
