import java.util.Scanner;
class IF_Else_example1
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
i = sc.nextInt();
j = sc.nextInt();
i = 100; j = 0;
if(j==0)
System.out.println("Division by error");
else
System.out.println(i+"divided by"+j+"is "+(i/j));
i = i+j;
}
}