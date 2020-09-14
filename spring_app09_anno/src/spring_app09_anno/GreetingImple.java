package spring_app09_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingImple implements Greeting {

	
	String msg;
	
	@Autowired
	NowTime nt;
	
	/*
	 * public GreetingImple(String msg) { this.msg = msg; }
	 */
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setNt(NowTime nt) {
		this.nt = nt;
	}

	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		System.out.println("현재시간 : " +nt.getTime() + " - " +msg);

	}

}
