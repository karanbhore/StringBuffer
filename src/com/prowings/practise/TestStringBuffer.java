package com.prowings.practise;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());
		System.out.println("initial capacity:" + sb1.capacity());

		sb1.append("hellooooooooooooooooooooooooooooooooooooooooooooooooo");
		System.out.println(sb1.length());
		

		System.out.println("capacity after adding contents:" + sb1.capacity());

		System.out.println(sb1.length());

//		sb1.trimToSize();

		System.out.println(sb1.capacity());

	}

}
