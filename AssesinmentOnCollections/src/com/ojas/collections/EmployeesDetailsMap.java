package com.ojas.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.print.DocFlavor.STRING;

class EmployeeDetails {
	private Map<Integer, String> employeeIdNameMap;

	public EmployeeDetails() {
		employeeIdNameMap = new TreeMap<Integer, String>();
	}

	public EmployeeDetails(Map<Integer, String> employeeIdNameMap) {

		this.employeeIdNameMap = employeeIdNameMap;
	}
	public String getEmployeeName(int employeeId) {
		String str = "";
		int count =0;
		
		if(employeeIdNameMap == null|| employeeIdNameMap.size()==0){
			return null;
		}else {
			if(employeeIdNameMap.containsKey(employeeId)) {
				str=employeeIdNameMap.get(employeeId);
			}
		}if(str.length()==0) {
			return null;
		}else {
			return str;
		}
	}
	public Map<Integer, String> getEmployeeIdNameMap(){
		return employeeIdNameMap;
	}

	public void setEmployee(Map<Integer, String> employeeIdNameMap) {
		this.employeeIdNameMap=employeeIdNameMap;
		
	}
	
}

public class EmployeesDetailsMap {

	public static void main(String[] args) {
		System.out.println("Enter number of detals to enter");
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new TreeMap<Integer, String>();
		int num1 = sc.nextInt();
		for(int i=0;i<num1;i++) {
			System.out.println("Enter Key And Values");
			m.put(sc.nextInt(), sc.next());
		}

		EmployeeDetails emp = new EmployeeDetails(m);
		System.out.println("Enter Key to search");
		System.out.println(emp.getEmployeeName(sc.nextInt()));
	}

}
