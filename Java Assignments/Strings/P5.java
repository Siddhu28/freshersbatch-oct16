package Strings;

public class P5 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(" It is used to_at the specified index position");
		sb.delete(14,15);
		System.out.println(sb);
		sb.insert(14, " insert text ");
		System.out.println(sb);

	}

}
