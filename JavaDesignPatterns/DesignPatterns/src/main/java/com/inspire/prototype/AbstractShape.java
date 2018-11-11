package com.inspire.prototype;

public abstract class AbstractShape implements Cloneable {
	
	protected String type;
	protected String id;
	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}
	public abstract void draw();

	public void setType(String type) {
		this.type = type;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }

}
