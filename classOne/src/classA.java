public class classA {

    public static void main(String args[])
    {
      int numberOfStudents=6;
      String sessionDay="Sunday";
      // String currentDay;
      // currentDay=returnSessionDay();
      System.out.println("Hello AUtomation Folks "+numberOfStudents);
        System.out.println("Number of Total Automation student = 6");
        System.out.println("Number of Automation students present are = 6");
        System.out.println("Number of Total Automation student = "+todayCount());
      System.out.println("Number of Automation students present are = "+todayCount());
      System.out.println(SessionDay());
        add(5,6);
        add(7,8);
        add(11,12);
        classA object1=new classA();
        classA object2=new classA();
        int e=object1.addition(4,5) + object1.addition(2,3) + object1.addition(6,7) + object2.addition(6 ,7);
       // e=object1.addition(5,6)+ object2.addition(7,8);
        System.out.println("total result = "+e);
    }
    public static int todayCount()

    {
        return 7;
    }
        public static String SessionDay()
    {
        String SessionDay="Monday";
        return SessionDay;
    }
    public static int add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
        return c;
    }

    public int addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition resutls in method "+c);
     return c;


    }

}
