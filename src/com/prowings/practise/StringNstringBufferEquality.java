package com.prowings.practise;

public class StringNstringBufferEquality {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="hello";
		
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(s1.equals(sb2));
		
		System.out.println(sb1.equals(s2));
		
		String s=s1.intern();
		
		System.out.println(s);
		System.out.println(s==s1);
		
		
		
		
		
		
		
		
		
	}
}
