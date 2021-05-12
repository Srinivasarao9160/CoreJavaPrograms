package com.ojas.shirtapp;

enum materials{
	COTTON,LINEN,POLISTER
};
public class Shirt {
	 private float collorsize;
	 private float length;
	 private String material;
	 
	 public Shirt() {
		 this.collorsize = 0;
			this.length = 0;
			this.material = null;
	 }
	 
	
	 public Shirt(float collorsize, float length, String material) {
		super();
		this.collorsize = collorsize;
		this.length = length;
		this.material = material;
	}


	public float getCollorsize() {
		return collorsize;
	}


	public void setCollorsize(float collorsize) {
		this.collorsize = collorsize;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	


	@Override
	public String toString() {
		return "Shirt [collorsize=" + collorsize + ", length=" + length + ", material=" + material + "]";
	}


	public String displyDetails() {
		return "Shirt [collorsize=" + collorsize + ", length=" + length + ", material=" + material + "]";
	}
	
	 

}
