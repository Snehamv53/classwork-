import java.io.*;
public class Holiday
{
String name;
int day;
String month;
public Holiday()
{
name="New year";
day=1;
month="January";
}
public Holiday(String name,int day,String month)
{
this.name=name;
this.day=day;
this.month=month;
}
public void display()
{
System.out.println("Name:"+name +"Day:"+day +"Month:"+month);
}
public static void main(String args[])
{
System.out.println("Holiday java");
Holiday h=new Holiday("RepublicDay",26,"January");
h.display();
}
}