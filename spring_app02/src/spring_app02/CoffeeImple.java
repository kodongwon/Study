package spring_app02;

public class CoffeeImple implements Beverage{

	String product;
	
	public CoffeeImple() {
		this.product = "Ŀ��";
	}
	public CoffeeImple(String product) {
		this.product = product;
	}
	public void drink(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "���� �߰ſ�" + product + "�� ����������");
	}

}
