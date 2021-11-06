
public class Pair<k, v> {
	
	private k key;
	private v value;
	
	public Pair(k key, v value) {
		super();
		this.key = key;
		this.value = value;

	}
	
	public< k, v> String showData() {
		 return key + " " + value;
	}
}

public class P4{
	public static void main(String args[]) {
		
		Pair<String, String> obj1 = new Pair<String , String>("1", "Hello");
		Pair<String, java.util.Date> obj2 = new Pair<>("Today is : ", new java.util.Date());
		
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		
		
	}
}
