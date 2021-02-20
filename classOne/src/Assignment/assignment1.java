package Assignment;

public class assignment1
{
    public static void main(String args[])
    {
    add(5,7);
    sub(6,9);
    assignment1 obj1=new assignment1();
    obj1.mul(3,4);
    assignment1 obj2=new assignment1();
    obj2.div(5,3);
    //float g=obj1.mul(5,6)+obj1.div(15,3);
    //System.out.println("Value of g ="+g);
    }

    public static int add(int a ,int b)
    {
        int c=a+b;
        System.out.println("Sum  = " +c);
        return c;
    }
   public static int sub(int a,int b)
   {
       int d=a-b;
       System.out.println("Subtraction = " +d);
       return d;
   }
   public int mul(int a,int b)
   {
       int c=a*b;
       System.out.println("Multiplication = "+c);
       return c;
   }
   public float div(float a, float b)
   {
       float f=a/b;
       System.out.println("Divison is = "+f);
       return f;
   }}
