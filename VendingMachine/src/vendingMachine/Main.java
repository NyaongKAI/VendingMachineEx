package vendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		VendingClass vc = new VendingClass();
		
		vc.init();
		
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		
		vc.showCans(money);
		
		System.out.println("음료를 선택하세요");
		String name = scan.next();
		
		vc.outCan(name);

	}

}
