package com.maijijun.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FILES", schema = "land", catalog = "")
public class FilesEntity {
	private String pid;
	private String gnum;
	private String squre;
	private String type;
	private String usedfor;
	private String people;
	private String location;
	private String whenuse;
	private String remark;
	private String content;

	@Basic
	@Column(name = "PID")
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Id
	@Column(name = "GNUM")
	public String getGnum() {
		return gnum;
	}

	public void setGnum(String gnum) {
		this.gnum = gnum;
	}

	@Basic
	@Column(name = "SQURE")
	public String getSqure() {
		return squre;
	}

	public void setSqure(String squre) {
		this.squre = squre;
	}

	@Basic
	@Column(name = "TYPE")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Basic
	@Column(name = "USEDFOR")
	public String getUsedfor() {
		return usedfor;
	}

	public void setUsedfor(String usedfor) {
		this.usedfor = usedfor;
	}

	@Basic
	@Column(name = "PEOPLE")
	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	@Basic
	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Basic
	@Column(name = "WHENUSE")
	public String getWhenuse() {
		return whenuse;
	}

	public void setWhenuse(String whenuse) {
		this.whenuse = whenuse;
	}

	@Basic
	@Column(name = "REMARK")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Basic
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FilesEntity that = (FilesEntity) o;
		return Objects.equals(pid, that.pid) &&
				Objects.equals(gnum, that.gnum) &&
				Objects.equals(squre, that.squre) &&
				Objects.equals(type, that.type) &&
				Objects.equals(usedfor, that.usedfor) &&
				Objects.equals(people, that.people) &&
				Objects.equals(location, that.location) &&
				Objects.equals(whenuse, that.whenuse) &&
				Objects.equals(remark, that.remark) &&
				Objects.equals(content, that.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid, gnum, squre, type, usedfor, people, location, whenuse, remark, content);
	}
}
