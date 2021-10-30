import java.util.Scanner;

public class P3 {
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.println(" Enter the principal amount: ");
double principal = input.nextDouble();

System.out.println(" Enter the rate: ");
double rate = input.nextDouble();


System.out.println(" Enter the time: ");
double time = input.nextDouble();

System.out.println("Enter number of times interest is compounded: ");
double number = input.nextDouble();

double simpleInterest = (principal * rate * time) / 100;

double compoundInterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

System.out.println("simpleInterest = " + simpleInterest);
System.out.println("compoundInterest = " + compoundInterest);
}
}




