class Wish 
{
static
{
System.out.println("STATIC BLOCK");
}
Wish()//initialise the Object and create the object
{
System.out.println("Constructor");
}
public static void dispaly()//method Declaration
{//Method Implementation
System.out.println("Method/non-static/instance");
}
public static void main(String[] ar)
{
System.out.println("Static method");
new Wish();//object creation 
Wish.dispaly();
}
}
