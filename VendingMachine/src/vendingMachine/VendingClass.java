package vendingMachine;

class VendingClass {
	
	//	VendingClass �ֿ���
	//	Can ���� ���� ����(Getter, Setter)
	//	Main ���� �ݾ� �Է�, ���� ����
	
	private Can[] can = new Can[5];
	private int money = 0;
	
	public void init() {
		for(int i = 0; i < can.length; i++) {
			can[i] = new Can();
		}
		
		can[0].setCanName("�ݶ�");
		can[0].setPrice(1500);
		can[1].setCanName("���̴�");
		can[1].setPrice(1300);
		can[2].setCanName("ȯŸ");
		can[2].setPrice(1100);
		can[3].setCanName("����");
		can[3].setPrice(900);
		can[4].setCanName("��Ƽ");
		can[4].setPrice(700);
	}
	
	public void showCans(int money) {
		this.money = money;
		
		System.out.println("=======================");
		for(int i = 0; i < can.length; i++) {
			if(can[i].getPrice() <= money) {
				System.out.printf("%s : %d��\n", can[i].getCanName(), can[i].getPrice());
			}
		}
		System.out.println("=======================");
	}
	
	public void outCan(String name) {
		for(int i = 0; i < can.length; i++) {
			if(name.equals(can[i].getCanName())) {
				if(money >= can[i].getPrice()) {
					System.out.println(can[i].getCanName() + " ����");
					money -= can[i].getPrice();
					System.out.println("�ܵ� : " + money);
				}
				else {
					System.out.println("�ܾ� ����");
				}
			}
			else {
				System.out.println("�ش� ������ �����ϴ�");
				System.out.println("�ܵ� : " + money);
				break;
			}
		}
	}

}
