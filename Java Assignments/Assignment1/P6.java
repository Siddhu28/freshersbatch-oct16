import java.util.*;
class P6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int totalAttempts=3, temp=totalAttempts;
String uname = "Siddharth";
String pass = "Siddhu@28";
System.out.println(" you have total " + totalAttempts + " Attemps ");
for(int i=1; i<=temp; i++) {
	System.out.println("Enter your username: ");
	String lname=sc.nextLine();
	System.out.println("Enter your password: ");
	String pass1=sc.nextLine();

	if(uname.equals(lname) && pass.equals(pass1))
	{
	System.out.println(" welcome " + lname + " You have successfully logged in ");
	break;
	}
	else {
		System.out.println(" ****Incorrect Login****");
		totalAttempts--;
		System.out.println(" you have now " + totalAttempts + " Attempts ");
	}
	if(totalAttempts == 0 )
	{
		System.out.println("Maximum number of attempts exceeded");
	}
}
}
}














