package com.ojas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductList {
	private int id;
	private String pname;
	private double price;
	
	public ProductList() {
		super();
	}
	
	public ProductList(int id, String pname, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		ArrayList<ProductList> al = new ArrayList<ProductList>();
		al.add (new ProductList(1,"bike",2003.0));
		al.add (new ProductList(2,"mobile",8000.0));
		al.add (new ProductList(3,"laptaop",5000.0));
		al.add (new ProductList(4,"bulb",10.0));
		al.add (new ProductList(5,"Mouse",7000.0));
		
		for (ProductList pro : al) {
			System.out.println(pro);
			}
		System.out.println("=================");

		List<ProductList> product = al.stream().filter(p->p.price>3000).collect(Collectors.toList());
		System.out.println(product);
		
		System.out.println("=================");
		List<ProductList> product1 = al.stream().filter(p->p.pname=="bike").collect(Collectors.toList());
		System.out.println(product1);
		
		System.out.println("================");
		Arrays.parallelSort(pro);
		                                                                                                                 
	}
	
	
}
	
	
	
	

