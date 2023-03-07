package com.prowings.practise;

public class EqualsMethodOnStringBuffer {

	public static void main(String[] args) {
		StringBuilder sbb1=new StringBuilder("hello");
		StringBuilder sbb2=new StringBuilder("hello");
		System.out.println(sbb1.equals(sbb2));
		System.out.println(sbb1==sbb2);		
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
