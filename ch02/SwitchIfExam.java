package ch02;

import java.util.Scanner;

public class SwitchIfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������� Ȯ���մϴ�.");
		System.out.println("�����ȣ�� �Է��ϼ��� >>>");
		Scanner number = new Scanner(System.in);
		
		char classnum = number.next().charAt(0);
		
		//System.out.println(classnum);
		
		switch(classnum) {
		case '1' : case '2' : case '3':
			System.out.println("��1�����");
			break;
		case '4' : case '5' : case '6':
			System.out.println("��2�����");
			break;
		case '7' : case '8' : case '9':
			System.out.println("��3�����");
			break;
		default:
			System.out.println("���� �����ȣ�Դϴ�. �ٽ��Է��Ͻ÷��� yes�� �Է����ּ���.");
			String retry = number.next();
			if(retry.equalsIgnoreCase("yes")) {
				System.out.println("�����ȣ�� ���Է����ּ���.");
				char reclassnum = number.next().charAt(0);
				
				//System.out.println(reclassnum);
				
				switch (reclassnum) {
				case '1' : case '2' : case '3':
					System.out.println("��1�����");
					break;
				case '4' : case '5' : case '6':
					System.out.println("��2�����");
					break;
				case '7' : case '8' : case '9':
					System.out.println("��3�����");
					break;
				default:
					System.out.println("���� �����ȣ�Դϴ�.");
					break;
				}//if�� �� switch�� ����
				}//if
				else{
					System.out.println("��� : ������ ������ ������� Ȯ�����ּ���.");
					
				} //else
			
			
			
 		
		}//switch
		

	}//main method

}//class
