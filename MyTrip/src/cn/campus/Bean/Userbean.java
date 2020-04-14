package cn.campus.Bean;

public class Userbean {
	
	private int id;
	private String usname;
	private String pwd;
	private String rpwd;
	private String number;
	private String email;
	
	// 无参构造
		public Userbean() {
			super();
		}
	
	public Userbean(int id,String usname,String pwd,String rpwd,String number,String email) {
		super();
		this.id = id;
		this.usname = usname;
		this.pwd = pwd;
		this.rpwd = rpwd;
		this.number = number;
		this.email = email;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsname() {
		return usname;
	}
	public void setUsname(String usname) {
		this.usname = usname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
