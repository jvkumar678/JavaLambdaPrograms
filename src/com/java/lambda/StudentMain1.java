package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentMain1 {

	
	public static void main(String[] args) {
		Students s1 = new Students("Vijay","MCA");
		Students s2 = new Students("Ajay","BBM");
		Students s3 = new Students("AjayRaj","BCA");
		Students s4 = new Students("kumar","BCA");
		List<Students> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		/*for(Students s : list){
			
			if(s.getSname().equals("Vijay")){
				list.add(s4);
			}
			System.out.println(s.getSname());
		}
		System.out.println(list.size());*/
		
		list.forEach(s->System.out.println(s.getSname()+"-->"+s.getCourse()));
	}
}
