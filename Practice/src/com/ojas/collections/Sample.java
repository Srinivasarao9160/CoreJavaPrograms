package com.ojas.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Employee {
	int empno;
	String ename;
	double salary;

	public Employee(int empno, String ename, double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

class ListOperations {
	List<Employee> list;

	public ListOperations() {
		list = new ArrayList();
	}

	void addEmployee(Employee e) {
		list.add(e);
		System.out.println("add sucessfully");
	}

	void deleteEmployee(int num) {
		list.remove(--num);
		System.out.println("Delete sucessfuly");
	}

	void updateEmployee(int index, Employee e) {
		list.set(--index, e);
		System.out.println("update sucessfully");
	}

	void listEmployees() {
		System.out.println("Employee informations");
		for (Employee e : list) {
			System.out.println(e.toString());
		}
	}

	void manu() {
		String m = "MenuDrivenApplication\n";
		m += "1.AddEmployee\n";
		m += "2.DeleteEmployee\n";
		m += "3.UpdateEmployee\n";
		m += "4.ListEmployee\n";
		m += "5.Exit\n";
		m += "Select Any one option\n";
		System.out.println(m);
	}

	void accept() {
		System.out.println("Enter Your no,name,salary");
	}

}

public class Sample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ListOperations obj = new ListOperations();
		for (;;) {
			obj.manu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.accept();
				obj.addEmployee(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
				break;

			case 2:
				System.out.println("Enter your num to Delete");
				obj.deleteEmployee(sc.nextInt());
				break;

			case 3:
				obj.accept();
				int num = sc.nextInt();
				obj.updateEmployee(num, new Employee(num, sc.next(), sc.nextDouble()));
				break;

				case 4:
					System.out.println("select index");
					obj.listEmployees();
					break;
					case 5:
						System.exit(0);
						default:
							System.out.println("invalid Option");
			}
		}

		
		
		
		
		
		
		
		// HashSet<String> h = new HashSet<String>();
//		h.add("c");
//		h.add("d");
//		System.out.println(h.add("d"));
//		System.out.println(h.add("d"));
//		System.out.println(h);

//		h.add("srinivas");
//		System.out.println("srinivas".hashCode());
//		h.add("venu");
//		System.out.println("venu".hashCode());
//
//		h.add("zajker");
//		h.add("pavitra");
//		h.add("shankar");
//		
//		Iterator<String> is = h.iterator();
//		while(is.hasNext()) {
//			System.out.println(is.next());
//		}

//		HashSet<Integer> sh = new HashSet<Integer>();
//		for(int i=1;i<100;i++) {
//			sh.add(i);
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		Iterator<String> is = h.iterator();
//		while(is.hasNext()) {
//			int num = is.next();
//			if(num %2 !=0) {
//				is.remove();
//			}
//			System.out.println(is.next());
//			
//			
//		}

//		TreeSet ts = new TreeSet();
//		//ts.add(12);
//		//ts.add(2);
//		ts.add("balu");
//		ts.add("anu");
//		System.out.println(ts);

		// Array List
//		List list = new ArrayList();
//		System.out.println(list.size());
//		
//		list.add(10);
//		list.add(true);
//		list.add("ojas");
//		list.add('c');
//		list.add(10);
//		System.out.println("using for loop");
//		for(int i =0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for(Object x : list) {
//			System.out.println(x);
//		}
//		
//		System.out.println("java8 feature");
//		

	}
}
