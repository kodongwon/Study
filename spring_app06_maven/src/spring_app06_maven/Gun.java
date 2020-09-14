package spring_app06_maven;

public class Gun implements Weapon {

	int bullet;
	public Gun() {
		this.bullet = 6;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		if(bullet > 0) {
			System.out.println("îg");
			bullet --;
		}
	}

	@Override
	public void reuse() {
		// TODO Auto-generated method stub
		System.out.println("¿Á¿Â¿¸ ");
		bullet = 6;
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		System.out.println("∂≥±¿");
		bullet = 0;
	}

}
