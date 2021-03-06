import java.util.Scanner;

public class stringUpr1
{
public static void main(String args[]){
    Scanner obj1 = new Scanner(System.in);
    System.out.println("Enter text");
    String str= obj1.next();
    System.out.println(str);
    StringBuffer obj2= new StringBuffer(str);
    System.out.println(obj2.reverse());



}
}
