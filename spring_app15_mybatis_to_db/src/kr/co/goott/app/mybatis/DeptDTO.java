package kr.co.goott.app.mybatis;

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {
		
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDpetno() {
		return deptno;
	}

	public void setDpetno(int dpetno) {
		this.deptno = dpetno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
