package spring_app03;

public class DotPrinter implements Printer{

	String msg;
	
	public DotPrinter() {}
	
	public DotPrinter(String msg) {
		this.msg = msg;
	}
	@Override
	public void printing(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Dotprinter : �ǶǶ�...");
		System.out.println(msg);
	}

}
