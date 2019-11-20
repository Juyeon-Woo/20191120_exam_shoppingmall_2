package personnel;
/*
CREATE TABLE PERSONNEL (
    ID          NUMBER(2)       NOT NULL PRIMARY KEY,
    NAME        VARCHAR2(30)    NOT NULL,
    DEPT        VARCHAR2(20)    NOT NULL,
    POSITION    NUMBER(1),
    DUTY        VARCHAR2(20),
    PHONE       VARCHAR2(14)
);
 */
public class PersonnelBean {
	int id;
	String name;
	String dept;
	int position;
	String duty;
	String phone;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
