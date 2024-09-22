package com.deloitte.lab6.ex1;
import java.util.*;


public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap1=new HashMap<>();
		hashMap1.put(1, "Value2");
		hashMap1.put(2, "Value3");
		hashMap1.put(3, "Value1");
		hashMap1.put(4, "Value4");
		
		List<String> sortValues=getValues(hashMap1);
		System.out.println(sortValues);
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap1) {
		
		List<String> values=new ArrayList<>(hashMap1.values());
		Collections.sort(values);
		return values;
	}	

}
