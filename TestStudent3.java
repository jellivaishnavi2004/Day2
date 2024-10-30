class Student{
int id;
String name;
}
class TestStudent3{
public static void main(String args[]){
Student S1=new Student();
Student S2=new Student();
S1.id=101;
S1.name="Vaishnavi";
S2.id=102;
S2.name="kav";
System.out.println(S1.id+""+S1.name);
System.out.println(S2.id+""+S2.name);
}
}