package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner in = new Scanner(System.in);
		System.out.println("�α����� id�� �Է����ּ���.");
		System.out.print("ID : ");
		String id = in.nextLine();
		System.out.println("�Է��Ͻ� id��" + id);
		
		System.out.println("�α����� ��ȣ�� �Է����ּ���.");
		System.out.print("PW : ");
		String pw = in.nextLine();
		
		if ((loginid.equals(id)) & (loginpw.equals(pw))) {
			System.out.println("�α��� ����");
			}
		else { 
			System.out.println("�α��� ����");
		}//if�� ����
		

	} //���� �޼��� ����

}//Ŭ���� ����
