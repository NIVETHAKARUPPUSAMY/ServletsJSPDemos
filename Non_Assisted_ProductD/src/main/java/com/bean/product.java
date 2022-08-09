package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
@Id
    private int id;
    private String pname;
    
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "Product[id=" + id + ", pname=" + pname + "]";
	}
    
}