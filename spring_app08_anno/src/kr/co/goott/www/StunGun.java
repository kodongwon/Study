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
			System.out.println("����������!");
			bullet --;
		}
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("���ο� ���͸��� �ٲٱ�");
		bullet = 1;
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("���� ��");
		bullet = 0;
	}

}
