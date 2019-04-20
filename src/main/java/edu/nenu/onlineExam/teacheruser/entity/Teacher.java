package edu.nenu.onlineExam.teacheruser.entity;

import java.util.HashSet;
import java.util.Set;


public class Teacher {
	private Integer tid;		//��ʦ���
	private String password;	//����
	private String tname;		//��ʦ����	
	private String phone;		//��ʦ�绰
	private String email;		//����

	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
