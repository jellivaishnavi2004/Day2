class Circle{
int radius;
void insert(int r){
radius=r;
}
void calculateArea(){
System.out.println(3.14*radius*radius);}
}
class TestCircle{
publc static void main(String args[])
{
Circle c1=new Circle();
c1.insert(3);
c1.calculateArea();
}
}