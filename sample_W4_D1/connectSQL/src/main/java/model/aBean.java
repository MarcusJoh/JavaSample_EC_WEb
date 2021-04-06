package model;

import java.util.ArrayList;

public class aBean {
	private String mName;

	private ArrayList<String> queryName = new ArrayList<String>();
	private ArrayList<String> queryPhone = new ArrayList<String>();

	public aBean(String mName) {

		this.mName = mName;
	}

	public String getmName() {
		return mName;
	}

	public ArrayList<String> getQueryName() {
		return queryName;
	}

	public void setQueryName(ArrayList<String> queryName) {
		this.queryName = queryName;
	}

	public ArrayList<String> getQueryPhone() {
		return queryPhone;
	}

	public void setQueryPhone(ArrayList<String> queryPhone) {
		this.queryPhone = queryPhone;
	}

}