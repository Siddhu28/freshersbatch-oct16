class P4
{
public static void main(String args[])
{
int sub1 = Integer.parseInt(args[0]);
int sub2 = Integer.parseInt(args[1]);
int sub3 = Integer.parseInt(args[2]);

if (sub1 < 0 || sub1 > 100)
	System.out.println("Invalid Marks");
else if (sub2 < 0 || sub2 > 100)
	System.out.println("Invalid Marks");
else if (sub3 < 0 || sub3 > 100)
	System.out.println("Invalid Marks");
else if ( (sub1 > 60) & (sub2 > 60) & ( sub3 > 60))
	System.out.println("Passed");
else if ( (sub1 < 60) & (sub2 > 60) & ( sub3 > 60))
	System.out.println("Promoted");
else if ( (sub1 > 60) & (sub2 < 60) & ( sub3 > 60))
	System.out.println("Promoted");
else if ( (sub1 > 60) & (sub2 > 60) & ( sub3 < 60))
	System.out.println("Promoted");
else if ( (sub1 > 60) & (sub2 < 60) & ( sub3 < 60))
	System.out.println("Failed");
else if ( (sub1 < 60) & (sub2 > 60) & ( sub3 < 60))
	System.out.println("Failed");
else if ( (sub1 < 60) & (sub2 < 60) & ( sub3 > 60))
	System.out.println("Failed");
else  
	System.out.println("Failed");
}
}

