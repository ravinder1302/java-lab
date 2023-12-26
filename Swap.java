import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
{
	Scanner reader=new Scanner(System.in);
	System.out.println("enter 1st no:");
	int a=reader.nextInt();
	System.out.println("enter 2nd no:");
	int b=reader.nextInt();
	reader.close();
	int t=a;
	a=b;
	b=t;
	System.out.println("the swaped no are:1st no="+ a +" 2nd no=" +b);
}
}