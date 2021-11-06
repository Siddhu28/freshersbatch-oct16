
import java.util.*;
import java.util.TreeSet;

public class P3 {

	public static void main(String[] args) {
		
		
		
		
		 Employee emp_1 = new Employee(1, "Sid", "A", 10000L);
		 Employee emp_2 = new Employee(3, "Sid1", "B", 20000L);
		 Employee emp_3 = new Employee(2, "Sid2", "C", 30000L);
		 Employee emp_4 = new Employee(4, "Sid3", "D", 50000L);
		 Employee emp_5 = new Employee(5, "Sid4", "E", 60000L);
		 Employee emp_6 = new Employee(6, "Sid5", "F", 68600L);
		 Employee emp_7 = new Employee(7, "Sid6", "G", 37000L);
		 Employee emp_8 = new Employee(8, "Sid7", "H", 75000L);
		 Employee emp_9 = new Employee(9, "Sid8", "I", 24000L);
		 Employee emp_10 =new Employee(10, "Sid9", "J", 33000L);
		
		 
		 System.out.println("1.Enter a to sort according to id: ");
		 System.out.println( "2.Enter b to sort according to Name: ");
		 System.out.println("3.Enter c to sort according to department :");
		 System.out.println("4.Enter d to sort according to Salary:\n ");
		 System.out.println("Please Enter the options according to your choice");
		 Scanner sc = new Scanner(System.in);
		 String ch = sc.nextLine();
				 
		 
			Set<Employee> set = new TreeSet<Employee>(new CustomSort(ch));
			
			set.add(emp_1);
			set.add(emp_2);
			set.add(emp_3);
			set.add(emp_4);

			set.add(emp_5);
			set.add(emp_6);
			set.add(emp_7);
			set.add(emp_8);

			set.add(emp_9);
			set.add(emp_10);
			
			 
			Iterator<Employee> i= set.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
		 
	         sc.close();
	}

}


class Employee {
	
	int id;
	String name;
	String dept;
	long salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	 
	
}

class CustomSort implements Comparator<Employee>{
	
	String a;

	public CustomSort(String a) {
		super();
		this.a = a;
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(a.equalsIgnoreCase("a")) {
			return o1.id-o2.id;
		}else if(a.equalsIgnoreCase("b")) {
			return o1.name.compareTo(o2.name);
		}else if(a.equalsIgnoreCase("c")) {
			return o1.dept.compareTo(o2.dept);
		}else if(a.equalsIgnoreCase("d")) {
			
			if (o1.salary>o2.salary) {
	            return 1;
	        }
	        else if (o1.salary<o2.salary) {
	            return -1;
	        }
	        else {
	            return 0;
	        } 
		}
		return 0;	
	}	
}