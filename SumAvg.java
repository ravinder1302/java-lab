import java.util.Scanner;
public class SumAvg
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("enter the first no:");
int a=reader.nextInt();
System.out.println("enter the second no:");
int b=reader.nextInt();
reader.close();
int sum=a+b;
int avg=(a+b)/2;
System.out.println("sum" +sum);
System.out.println("avg" +avg);
}
}