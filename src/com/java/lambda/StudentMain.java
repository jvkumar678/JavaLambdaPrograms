package com.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	
	public static void main(String[] args) {
		List<Students> list = new ArrayList<>();
		
		Students s1 = new Students("vijay","MCA");
		Students s2 = new Students("kumar","BBA");
		Students s3 = new Students("ajay","BCA");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		/*for(Students s  : list){
			System.out.println(s.getSname());
		}*/
		
		list.forEach(s->System.out.println(s.getSname()));
		System.out.println("=====================");
		list.sort(new StudendComparator());
		for(Students s  : list){
			System.out.println(s.getSname());
		}
		System.out.println("*********");
		list.sort(Comparator.comparing(Students::getCourse));
		list.forEach(s->System.out.println(s.getSname()+" "+s.getCourse()));
	}

}
