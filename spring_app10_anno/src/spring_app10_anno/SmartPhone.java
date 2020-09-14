package spring_app10_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class SmartPhone implements Phone {
	
	@Autowired
	PhoneOS os;
	
	
	public void setOs(PhoneOS os) {
		this.os = os;
	}

	@Override
	public void call(String callNumber) {
		// TODO Auto-generated method stub
		os.printOS();
		System.out.println(callNumber + " 전화 거는 중...");
	}

	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		os.version();
		System.out.println("문자 왔음 - " +msg);
	}
	
	public void playGame(String title) {
		System.out.println(title + " 게임하기");
	}

}
