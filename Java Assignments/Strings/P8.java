package Strings;

public class P8 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(" It is used to_at the specified index position");
		sb.delete(14,15);
		System.out.println(sb);
		sb.insert(14, " insert text ");
		System.out.println(sb);


	}

}
