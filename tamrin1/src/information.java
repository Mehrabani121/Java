import java.util.*;
public class information {
   static Scanner input=new Scanner(System.in);
   
   static Map map = new HashMap();
   public static void daryaft(){
       System.out.println("please enter your name :");
       map.put("name",input.next());
       System.out.println("please enter your family :");
       map.put("family", input.next());
       System.out.println("please enter your ID :");
       map.put("ID", input.nextInt());
       System.out.println("please enter your GPA :");
       map.put("GPA", input.next());
       


   }
   
}
