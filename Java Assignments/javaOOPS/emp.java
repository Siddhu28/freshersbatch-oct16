package javaOOPS;

public class Employee {
	public void salary(int amt) { 
		System.out.println("Salary of Employee is"+ amt);
		return amt;
	}
}
class manager extends Employee{
	public void salary(int amt) {
		System.out.println("Incentive of Manager is"+ amt);
		return amt;
	}
}
class labour extends Employee{
	public void salary(int amt) {
		System.out.println("overtime of labour is"+ amt);
		return amt;
	}
}
class emp
{
	public static void main(String args[])
	{
		
	}
}
