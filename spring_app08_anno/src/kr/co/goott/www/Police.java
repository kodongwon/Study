package kr.co.goott.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Police implements Character{
	
	@Autowired
	@Qualifier("g1")
	Weapon w;
	
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
