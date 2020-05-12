
import java.util.*;


public class delta {
    static double a;
    static double b;
    static double c;
    static double z;
    static double d;
    static double v;
    static double n;
     public static void daryaft(){
         
         Scanner input=new Scanner(System.in);
        System.out.println("ax^2 + bx + c =0");
        System.out.println("please enter a :");
        a=input.nextInt();
        System.out.println("please enter b :");
        b=input.nextInt();
        System.out.println("please enter c :");
        c=input.nextInt();
        d=4*a*c;
        v=Math.pow(b, 2);
        n=v-d;
        
         try {
               if(n<0)
                 throw new ArithmeticException();
               else
                   z=Math.sqrt(n);
         } catch (Exception e) {
             System.out.println("zire radikal manfi ast va rishe haghighi nadarad!");
         }
         
     }
     
     
       
        
        
        


}
