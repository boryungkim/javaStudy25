package ch02;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inChar = new Scanner(System.in);
		
		System.out.println("ȸ������� �Է��ϼ���.");
		
		char gradeChaStr = inChar.next().charAt(0);
		
		System.out.println(gradeChaStr);
		
		switch(gradeChaStr) {
		case 'a':
		case 'A':
			System.out.println("���ȸ���Դϴ�.");
		break;
		case 'b':
		case 'B':
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
		case 'c':
		case 'C':
			System.out.println("�����ȸ���Դϴ�.");
			break;
		default:
			System.out.println("ȸ�������Ͻ÷��� yes�� �Է����ּ���.");
		String newmember= inChar.next();
		if(newmember.equalsIgnoreCase("yes")) {
			System.out.println("ȸ�������� �����մϴ�.");
			System.out.println("ID�� �Է����ּ��� >>>");
			String id = inChar.next();
			System.out.println(id + "�� ȸ�������� ���ϵ帳�ϴ�.");
			break;
			}
		else {
			System.out.println("ȸ�����Խ���");
			break;
			}//ȸ�� ���� if�� ����
		}// switch�� ����
	}// main method

}//class
