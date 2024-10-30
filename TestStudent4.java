class Student{
int rollno;
String name;
void InsertRecord(int r,String n){
rollno=r;
name=n;
}
void displayinformation(){
System.out.println(rollno+""+name);
}
}
class TestStudent4{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.InsertRecord(11,"karan");
s2.InsertRecord(12,"arjun");
s1.displayinformation();
s2.displayinformation();
}
}