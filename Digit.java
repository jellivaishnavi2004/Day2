import java.util.Scanner;
class Demo{
public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
if(n==0||n==1||n==2||n==3||n==4)
System.out.println("YES");
else
System.out.println("NO");
}
}