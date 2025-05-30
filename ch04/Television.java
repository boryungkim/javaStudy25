package ch04;

public class Television {

	static String company = "Samsung";
	static String model = "LED";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
