package kr.co.goott.www;

public class StunGun implements Weapon {

	int bullet;
	
	public StunGun() {
		this.bullet = 1;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet > 0) {
			System.out.println("지직지지직!");
			bullet --;
		}
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("새로운 배터리로 바꾸기");
		bullet = 1;
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("떨굼 ㅋ");
		bullet = 0;
	}

}
