package com.ojas.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class Demo4 {
	public static void main(String[] args) {
		
	

		Hashtable<String, String> hs = new Hashtable<String, String>();
		
		hs.put("andharapradesh", "amaravathi");
		hs.put("Telangana", "Hyd");
		hs.put("gujarath", "amaravathi");
		hs.put("india", "Deli");
		
		Enumeration<String> keys= hs.keys();
		while (keys.hasMoreElements()) {
			String s = (String) keys.nextElement();
			String v = hs.get();
			
			System.out.println(s+"-"+v);
					
			
		}
 
		
		
	}

}
