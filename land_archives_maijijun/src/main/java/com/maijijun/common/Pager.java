package com.maijijun.common;

import java.util.List;

public class Pager {
	private static final int size = 5;
	private int totalpage;
	private List list;
	public static int getSize() {
		return size;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
}
