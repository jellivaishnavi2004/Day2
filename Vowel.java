import java.util.Scanner;
class Demo{
public static void main(String arg[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='u')
System.out.println("YES");
else
System.out.println("NO");
}
}