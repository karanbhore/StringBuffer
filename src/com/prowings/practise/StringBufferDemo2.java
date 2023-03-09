package com.prowings.practise;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.insert(5, "beautiful");
		sb.replace( 13, 18, "everybody");
		sb.delete(0, 7);
		String msg=sb.toString();
		System.out.println(msg);
		System.out.println(sb);
		
		String s="hello";
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println(sb1);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
