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
		System.out.println("���ݽ��� �پ");
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println("��ƿ�Ƹ���");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + "����");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " ����");
	}

}
