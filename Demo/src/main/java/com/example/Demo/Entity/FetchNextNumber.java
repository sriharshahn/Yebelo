package com.example.Demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FetchNextNumber {
	
	

	@Id
	private int CategoryCode;
	
	private int oldvalue;
	
	private int newvalue;

	public FetchNextNumber() {
		
	}

	public FetchNextNumber(int categoryCode, int oldvalue, int newvalue) {
		
		CategoryCode = categoryCode;
		this.oldvalue = oldvalue;
		this.newvalue = newvalue;
	}



	public int getCategoryCode() {
		return CategoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		CategoryCode = categoryCode;
	}

	public int getOldvalue() {
		return oldvalue;
	}

	public void setOldvalue(int oldvalue) {
		this.oldvalue = oldvalue;
	}

	public int getNewvalue() {
		return newvalue;
	}

	public void setNewvalue(int newvalue) {
		this.newvalue = newvalue;
	}

	@Override
	public String toString() {
		return "FetchNextNumber [CategoryCode=" + CategoryCode + ", oldvalue=" + oldvalue + ", newvalue="
				+ newvalue + "]";
	}
	
	
}
