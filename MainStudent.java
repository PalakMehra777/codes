package com.te.assi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainStudent {

	public static void main(String[] args) {
	
		Set<Student> liSet = new HashSet<Student>();
		liSet.add(new Student(40, "Ravi" ,78.69,23 ));
		liSet.add(new Student(20, "Vishwas" ,92.67,21));
		liSet.add(new Student(20, "Vishwas" ,92.67,21));
		liSet.add(new Student(30, "MadhuSudhan" , 70.21,40));
		liSet.add(new Student(10, "Palak" ,93.2, 21));
		liSet.add(new Student(10, "Palak" ,93.2, 21));
		ArrayList<Student> list = new ArrayList<Student>(liSet);
		
		Scanner userinput = new Scanner(System.in);
		String s;
		do {
		System.out.println("Press 1:  SORTING BY ID");
		System.out.println("Press 2:  SORTING BY NAME");
		System.out.println("Press 3:  SORTING BY AGE");
		System.out.println("Press 4:  SORTING BY MARKS");
		System.out.println("Press 5:  FOR EXIT");
		int id=userinput.nextInt();
		
		switch (id) {
		case 1:Collections.sort(list,new SortById());
			for (Student student : list) {
				System.out.println(student);
			}
			break;
			
		case 2:Collections.sort(list,new SortByName());
		for (Student student : list) {
			System.out.println(student);
		}
		break;
		
		case 3:Collections.sort(list,new SortByAge());
		for (Student student : list) {
			System.out.println(student);
		}
		break;
		
		case 4:Collections.sort(list,new SortByMarks());
		for (Student student : list) {
			System.out.println(student);
		}
		break;
		default:
			break;
		}
		System.out.println("FOR CONTINUE TYPE: YES/NO");
		s=userinput.next();
	
		}
		
		while("yes".equals(s));
	
	}
}
