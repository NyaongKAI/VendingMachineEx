package vendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		VendingClass vc = new VendingClass();
		
		vc.init();
		
		System.out.println("�ݾ��� �Է��ϼ���");
		int money = scan.nextInt();
		
		vc.showCans(money);
		
		System.out.println("���Ḧ �����ϼ���");
		String name = scan.next();
		
		vc.outCan(name);

	}

}
