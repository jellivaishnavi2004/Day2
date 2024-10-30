import java.io.*;
import java.util.*;
class Test{
static public void main(String args[]){
Scanner sc= new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printMonth(inpVar));
}
public static String printMonth(int monthno){
String month;
switch(monthno){
case 0:{month="Junary";break;}
case 1:{month="february";break;}
case 2:{month="march";break;}
case 3:{month="april";break;}
case 4:{month="may";break;}
case 5:{month="june";break;}
case 6:{month="july";break;}
case 7:{month="august";break;}
case 8:{month="september";break;}
case 9:{month="october";break;}
case 10:{month="november";break;}
case 11:{month="decenber";break;}
default:month="INVALID";
}
return month;
}
}
