package ch02;

public class SwitchStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String position = "����";
		
		switch (position) {
		case "����" :
			System.out.println(position + "�������� 1000����");
			break;
		case "����" :
			System.out.println(position + "�������� 1500����");
			break;
		case "�븮" :
			System.out.println(position + "�������� 2000����");
			break;
		default:
			System.out.println("������ ����.");
			break;
		
		}

	}

}
