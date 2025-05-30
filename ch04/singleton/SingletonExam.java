package ch04.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s2.sayHello();
		
		if(s1==s2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

	}

}
