package Strings;

public class P3 {

	public static void main(String[] args) {
		String str = " Java String referes to collection of Strings which are stored in heap memory";
		
		String s1 = str.toLowerCase();
		System.out.println(s1);
		
		String s2 = str.toUpperCase();
		System.out.println(s2);
		
		String s3 = str.replace("a", "$");
		System.out.println(s3);
		
		String s4 = "collection";
		System.out.println(str.contains(s4));
		
		String s5 = "java string pool refers to collection of strings which are stored in heap memory";
		boolean s6 = s5.equals(str);
		System.out.println(s6);
		
		String s7 = " java string pool refers to collection of strings which are stored in heap memory";
		boolean s8 = s7.equalsIgnoreCase(str);
		System.out.println(s8);
		
	}

}
