package spring_app06_maven;

public class Police implements Character{

	Weapon w;
	Gun g;
	StunGun s;
	
	int hp;
	
	public Police() {
		this.hp = 100;
	}
	
	
	public Weapon getW() {
		return w;
	}


	public void setW(Weapon w) {
		this.w = w;
	}


	public Gun getG() {
		return g;
	}


	public void setG(Gun g) {
		this.g = g;
	}


	public StunGun getS() {
		return s;
	}


	public void setS(StunGun s) {
		this.s = s;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("½½±Ý½½±Ý ¶Ù¾î°¨");
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println("¿ì°Æ¿ì°Æ¸ÔÀ½");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "°ø°Ý");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " µæÅÛ");
	}

}
