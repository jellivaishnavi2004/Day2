class Employee{
int rollno;
String name;
String department;
void InsertRecord(int r,String n,String d){
rollno=r;
name=n;
department=d;
}
void displayinformation(){
System.out.println(rollno+""+name+""+department);
}
}
class TestStudent5{
public static void main(String args[]){
Student e1=new Student();
Student e2=new Student();
Student e3=new Student();
e1.InsertRecord(11,"karan");
e2.InsertRecord(12,"arjun");
e3.InsertRecord(13,"cse");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
}
}