package vendingMachine;

class VendingClass {
	
	//	VendingClass 주요기능
	//	Can 음료 종류 관리(Getter, Setter)
	//	Main 투입 금액 입력, 음료 선택
	
	private Can[] can = new Can[5];
	private int money = 0;
	
	public void init() {
		for(int i = 0; i < can.length; i++) {
			can[i] = new Can();
		}
		
		can[0].setCanName("콜라");
		can[0].setPrice(1500);
		can[1].setCanName("사이다");
		can[1].setPrice(1300);
		can[2].setCanName("환타");
		can[2].setPrice(1100);
		can[3].setCanName("식혜");
		can[3].setPrice(900);
		can[4].setCanName("제티");
		can[4].setPrice(700);
	}
	
	public void showCans(int money) {
		this.money = money;
		
		System.out.println("=======================");
		for(int i = 0; i < can.length; i++) {
			if(can[i].getPrice() <= money) {
				System.out.printf("%s : %d원\n", can[i].getCanName(), can[i].getPrice());
			}
		}
		System.out.println("=======================");
	}
	
	public void outCan(String name) {
		for(int i = 0; i < can.length; i++) {
			if(name.equals(can[i].getCanName())) {
				if(money >= can[i].getPrice()) {
					System.out.println(can[i].getCanName() + " 선택");
					money -= can[i].getPrice();
					System.out.println("잔돈 : " + money);
				}
				else {
					System.out.println("잔액 부족");
				}
			}
			else {
				System.out.println("해당 물건이 없습니다");
				System.out.println("잔돈 : " + money);
				break;
			}
		}
	}

}
