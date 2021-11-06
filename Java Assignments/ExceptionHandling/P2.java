public class P2 {
public static void main(String args[]) {
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int res = n1/n2;
		System.out.println("res = " + res);
		}
	catch(ArithmeticException e) {
		System.out.println(" Error : " + e.getMessage());
		System.out.println("Error:"+e);
		System.out.println();
		}
	}
}
	