import java.util.Scanner;
public class ReverseOrder1
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("enter the no:");
int a=reader.nextInt();
reader.close();
int acopy=a;
int rn=0;
while(a>0)
{
rn=rn*10+a%10;
a=a/10;

}
System.out.print("rn=" +rn);
}
}
