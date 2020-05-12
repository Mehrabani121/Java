import java.util.*;

public class hesab {
    Scanner input=new Scanner(System.in);
    public void mostatil(){
        System.out.print("tole mostatil ra vared konid:");
        int x=input.nextInt();
        System.out.print("arze mostatil ra vared konid:");
        int y=input.nextInt();
        
        System.out.printf("mohit barabar ba %d va masahat niz hast %d",x+y,x*y);
    }
    
    public void morabbae(){
        System.out.print("\ntole morabba ra vared konid:");
        int x=input.nextInt();
        
        
        System.out.printf("mohit barabar ba %d va masahat niz hast %d",4*x,x*x);
    }
    
}
