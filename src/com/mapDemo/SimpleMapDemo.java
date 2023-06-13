package com.mapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Parthajeet");
		student.put(2, null);
		student.put(3, null);
		student.put(null, null);
		student.put(null, "Kobe"); //override the first key with null value
		student.put(null, "Bryant");//same as above..check output
		student.put(1, "Saikia");
		
		System.out.println(student);
		
		System.out.println(student.get(null));
		
		
		System.out.println("The keys:");
		System.out.println(student.keySet());
		System.out.println("The values:");
		System.out.println(student.values());
		
		
		//First Approach
		Set<Map.Entry<Integer,String>> stu_set = student.entrySet();
		
		Iterator<Entry<Integer,String>> itr = stu_set.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+" "+e.setValue("Error")); //Altering here would also modify the original map values. The Set is backed by 
																	//the map, which means that any modifications made to the entries in the set will 
																	//be reflected in the original map, and vice versa.In other words, the Set returned 
																	//by entrySet() IS NOT A SEPERATE COPY OF THE ENTRIES; it is a direct reference to 
																	//the entries within the map.
		}
		
		//Alternate Approach
		System.out.println("\nAlternate Approach\n");
		for(Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println(student);
		
	}
}
