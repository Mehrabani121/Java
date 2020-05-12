import java.util.*;

public class hesab {
    Scanner input=new Scanner(System.in);
    
    public void hal(){
        System.out.println("zaribe x ax+by=e :");
        int a=input.nextInt();
        
        System.out.println("zaribe y ax+by=e :");
        int b=input.nextInt();
        
        System.out.println("zaribe x cx+dy=f :");
        int c=input.nextInt();
        
        System.out.println("zaribe y cx+dy=f :");
        int d=input.nextInt();
        
        System.out.println("add sabete f :");
        int f=input.nextInt();
        
        System.out.println("add sabete e :");
        int e=input.nextInt();
        float x=(e*d - b*f)/(a*d)-(b*c);
        float y=(a*f - e*c)/(a*d)-(b*c);
        
        if (((a*d)-(b*c))==0) {
            
        
        System.out.println("ghabele hal nist");

        }
        else{
            System.out.println("x="+x);
            System.out.println("y="+y);

        }
    }
    
}
