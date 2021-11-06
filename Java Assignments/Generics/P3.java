
public class P3 {

	public static void main(String[] args) {
		Integer arr[]= { 100, 200};
		
		System.out.println(" Before swapping position : " + arr[0] + " " + arr[1]);
		
		swap(arr)
	}
	
	public static <S> void swap(S[] arr) {
		S temp = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;
		
		System.out.println(" After swapping position : " + arr[0] + " " + arr[1]);
		
	}

}
