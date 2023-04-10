import java.util.*;
class Rectangle
{
double breadth=13;
double length=12.48;
double area=length*breadth;
public void setData()
{
  System.out.println("area of a Rectangle");
  System.out.println("length is"+length);
  System.out.println("breadth is"+breadth);
}
public double getArea()
{ 
System.out.println("area:"+area);
return area;
}
public static void main(String args[])
{
Rectangle obj1=new Rectangle();
obj1.setData();
obj1.getArea();
}
}


