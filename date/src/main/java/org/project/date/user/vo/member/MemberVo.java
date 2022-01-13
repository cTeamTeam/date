package org.project.date.user.vo.member;

import org.hibernate.validator.constraints.NotEmpty;

public class MemberVo {
	
	private int num;
	@NotEmpty(message="필수 입력칸입니다.")
	private String id;
	@NotEmpty(message="필수 입력칸입니다.")
	private String password;
	@NotEmpty(message="필수 입력칸입니다.")
	private String pwCheck;
	@NotEmpty(message="필수 입력칸입니다.")
	private String name;
	@NotEmpty(message="필수 입력칸입니다.")
	private String nickName;
	@NotEmpty(message="필수 입력칸입니다.")
	private String birth;
	@NotEmpty(message="필수 입력칸입니다.")
	private String gender;
	@NotEmpty(message="필수 입력칸입니다.")
	private String phoneNum;
	
	private String membership;
	private String date_count;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPwCheck() {
		return pwCheck;
	}
	public void setPwCheck(String pwCheck) {
		this.pwCheck = pwCheck;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public String getDate_count() {
		return date_count;
	}
	public void setDate_count(String date_count) {
		this.date_count = date_count;
	}
	
	
}
