package spring_app02;

public class MachineCoffee implements Beverage{
	String product;
	public MachineCoffee() {
		
	}
	
	public MachineCoffee(String product) {
		
	}
	@Override
	public void drink(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " ¥‘¿Ã" + product + " ∏¶ §±Ω…");
	}

}
