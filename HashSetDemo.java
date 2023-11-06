package com.java.demo.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> number = new HashSet<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(4);
		
		System.out.println("HasSet" + number);
		
		number.addAll(number);
		
		number.remove(2);
		
		System.out.println("HasSet" + number);
		
		
		number.containsAll(number);
		
		HashSet<Integer> primeNumber=new HashSet<Integer>();
		
		primeNumber.add(2);
		primeNumber.add(3);
		
		System.out.println(primeNumber);
		
		boolean check=number.containsAll(primeNumber);
		System.out.println("is primenumber is subset of number " + check);
		
		HashSet<String> str=new HashSet<String>();
		
		str.add("Vidya");
		str.add("Vibhusha");
		str.add("vikas");
		str.add("vikas");//no duplicate
		str.add(null); //only 1 null value is allowed
		str.add(null);
		str.add(null);
		str.add(null);
		
		// it is not maintating insertion order
		System.out.println(str);
	}

}
