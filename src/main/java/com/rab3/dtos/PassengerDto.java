package com.rab3.dtos;

import java.io.Serializable;

public class PassengerDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fullName;
	private String gender;
	private String phone;
	private String email;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "PassengerDto [fullName=" + fullName + ", gender=" + gender + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
