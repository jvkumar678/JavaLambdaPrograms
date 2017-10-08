package com.java.lambda;

import java.util.Comparator;

public class StudendComparator  implements Comparator<Students>{
	@Override
	public int compare(Students s1, Students s2) {
		return s1.getSname().compareTo(s2.getSname());
	}}
