package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("a.����������");
		System.out.println("b.�л�����");
		System.out.println("c.��������");
		System.out.println("z.���α׷� ����");
		System.out.println("(a~z)>>>");
		
		char select = input.next().charAt(0);

		switch(select) {
		case 'A':
		case 'a':
			System.out.println("�����������޴��� �����ϼ̽��ϴ�.");
			System.out.println("1.���������");
			System.out.println("2.����������");
			System.out.println("3.����������");
			System.out.println("4.����������");
			System.out.println("(1~4)>>>");
			int subSelect = input.nextInt();
			switch (subSelect) {
			case 1 :
				System.out.println("��������ϸ޴��Դϴ�.");
				break;
				
			case 2 :
				System.out.println("����������޴��Դϴ�.");
				break;
			case 3 :
				System.out.println("�����������޴��Դϴ�.");
				break;
			case 4 :
				System.out.println("�����������޴��Դϴ�.");
				break;
			default:
				System.out.println("�ٽ��Է����ּ���.");
			}
			break;
			
		case 'B':
		case 'b':
			System.out.println("�л������޴��� �����ϼ̽��ϴ�.");
			System.out.println("1.�л����");
			System.out.println("2.�л�����");
			System.out.println("3.�л�����");
			System.out.println("4.�л�����");
			System.out.println("(1~4)>>>");
			int selecto = input.nextInt();
			switch (selecto) {
			case 1 : 
				System.out.println("�л���ϸ޴��Դϴ�.");
			break;
			case 2 :
				System.out.println("�л�����޴��Դϴ�.");
			break;
			case 3 :
				System.out.println("�л������޴��Դϴ�.");
				break;
			case 4:
				System.out.println("�л������޴��Դϴ�.");
				break;
			default:
				System.out.println("�ٽ��Է����ּ���.");
				}
			break;
		
		case'C':
		case'c':
			System.out.println("���������޴��� �����ϼ̽��ϴ�.");
			System.out.println("1.�������");
			System.out.println("2.��������");
			System.out.println("3.��������");
			System.out.println("4.��������");
			int selectt = input.nextInt();
			switch (selectt) {
			case 1 : 
				System.out.println("������ϸ޴��Դϴ�.");
				break;
				
			case 2:
				System.out.println("��������޴��Դϴ�.");
				break;
				
			case 3 :
				System.out.println("���������޴��Դϴ�.");
				break;
				
			case 4:
				System.out.println("���������޴��Դϴ�.");
				break;
				
			default :
				System.out.println("�ٽ��Է����ּ���.");
				break;
			}
			break;
			
			
		case'Z':
		case'z':
			System.out.println("���α׷��� �����մϴ�.");
			break;
			
		default:
			System.out.println("�ٽ� �Է����ּ���.");
			break;
		} //switch�� ����
		

	}//main method ����

}//class ����
