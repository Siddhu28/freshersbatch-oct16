package Strings;

public class P4 {

	public static void main(String[] args) {
		
		String s1 = "StringBuffer";
		String s2 = " is a peer class of a string";
		String s3 = " that provides much of";
		String s4 = " the functionality of strings";
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb);

		sb.append(s2);
		System.out.println(sb);

		sb.append(s3);
		System.out.println(sb);

		sb.append(s4);
		System.out.println(sb);
	}

}
