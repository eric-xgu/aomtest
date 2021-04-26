package org.aom.bean;

/**
 * @author Administrator
 *
 */
public class User {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd_no() {
		return std_no;
	}

	public void setStd_no(String std_no) {
		this.std_no = std_no;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCreateid() {
		return createid;
	}

	public void setCreateid(int createid) {
		this.createid = createid;
	}

	public Drom getDromid() {
		return dromid;
	}

	public void setDromid(Drom dromid) {
		this.dromid = dromid;
	}
	public String toString() {
		return id+" "+name+" "+role;
	}
	private int id;
	private String name;
	private String std_no;
	private String passwd;
	private String email;
	private String tel;
	private int age;
	private int createid;
	private int role;
	
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	private Drom dromid;
}
