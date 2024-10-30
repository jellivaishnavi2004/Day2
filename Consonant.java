import java.util.Scanner;
class Demo{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c = scob.next().charAt(0);
if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='u')
System.out.println("VOWEL");
else
System.out.println("CONSONANT");
}
else{
System.out.println("NOT A CONSONANT");
}
}
}
