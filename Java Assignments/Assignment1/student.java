import java.util.*;
class student{
static float Tot(float a, float b, float c) {
	float totl=0; 
	totl=a+b+c;
	return totl;
	}
	static float avg(float a, float b, float c) {
	float avg = 0;
	avg = (a+ b +c )/3;
	return avg;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float a,b,c,tot=0;
float total=0;
System.out.println(" Enter the marks of 3 Students");
for( int i=1; i<=3;i++) {
	for(int j=i; j<=i; j++) {
		System.out.println("\nEnter the marks of " + i + " student for A, B and C subject");
		System.out.println("Enter the marks of A subject for " + i + " student: ");
		a = sc.nextFloat();
		System.out.println("Enter the marks of B subject for " + i + " student: ");
		b = sc.nextFloat();
		System.out.println("Enter the marks of C subject for " + i + " student: ");
		c = sc.nextFloat();
		total = Tot(a, b, c);
		float avg = avg(a,b,c);
		System.out.println("Total marks scored by " + i + " student in all subject is : " + total);
		System.out.println("Average marks scored by " + i + " student in all subject is : " + avg);
		}
		tot += total;
	}
	System.out.println("Total scored in subjects is : " + tot );
	float avg=tot/9;
	System.out.println("Average scored in subjects is : "+ avg );
	}
}

















