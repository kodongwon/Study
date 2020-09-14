package kr.co.goott.www;

import org.springframework.beans.factory.annotation.Autowired;

public class SystemMonitor implements Monitor {

	@Autowired
	Sender sender;
	
	
	public void setSender(Sender sender) {
		this.sender = sender;
	}


	@Override
	public void showMonitor() {
		// TODO Auto-generated method stub
		if(sender!=null) sender.show();
		else System.out.println("sender is null");
	}

}
