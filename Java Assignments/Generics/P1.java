import java.util.HashSet;
import java.util.Iterator;

public class P1 {

	public static void main(String[] args) {
		
		Employee obj1 = new Employee(10, "Siddharth", 15000);
		Employee obj2 = new Employee(20, "Siddhu", 20000);
		
		HashSet<Employee> empDetails = new HashSet<>();
		
		empDetails.add(obj1);
		empDetails.add(obj2);
		
		Iterator<Employee> iterate = empDetails.iterator();
		while(iterate.hasNext()) {
			iterate.next().display();
			System.out.println();
		}

	}

}

class Employee{
	public Employee(int id, String name, int salary) {
		super();
		this.id= id;
		this.name = name;
		this.salary= salary;	
	}
	
	int id;
	String name;
	int salary;
	
	public void display() {
		System.out.println("ID =" + id);
		System.out.println("NAME =" + name);
		System.out.println("SALARY =" + salary);
	}
}
