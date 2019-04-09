package com.leetcode.easy;

import java.util.List;

public class Problem690 {
	
	public int getImportance(List<Employee> employees, int id) {
		int importance = 0;
		for(Employee e : employees) {
			if(e.id == id) {
				importance += e.importance;
				for(int i : e.subordinates)
					importance += getImportance(employees, i);
			}
		}
		return importance;
	}
	
	class Employee {
	    // It's the unique id of each node;
	    // unique id of this employee
	    public int id;
	    // the importance value of this employee
	    public int importance;
	    // the id of direct subordinates
	    public List<Integer> subordinates;
	}
}
