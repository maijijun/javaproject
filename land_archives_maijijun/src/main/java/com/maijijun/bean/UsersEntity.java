package com.maijijun.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS", schema = "land", catalog = "")
public class UsersEntity {
	private int id;
	private String name;
	private String password;
	private String zip;
	private String address;
	private String phonenumber;
	private String email;

	@Id
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(name = "ZIP")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Basic
	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Basic
	@Column(name = "PHONENUMBER")
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Basic
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsersEntity that = (UsersEntity) o;
		return id == that.id &&
				Objects.equals(name, that.name) &&
				Objects.equals(password, that.password) &&
				Objects.equals(zip, that.zip) &&
				Objects.equals(address, that.address) &&
				Objects.equals(phonenumber, that.phonenumber) &&
				Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password, zip, address, phonenumber, email);
	}
}
