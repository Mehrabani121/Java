import java.util.*;
public class javaapplication42 {

     static Scanner input=new Scanner(System.in);
     
     static String[] teacher;
     int[]shteacher = new int[5];
     static String[] shoghle;
     static String[] madrak;
     
     
    public static void main(String[] args) {
    
        enterName() ;
        entershenase();
        entershoghle();
        entermadrak();
        String name=new String();
        System.out.print("Enter your name's of teacher for search:");
        name=input.next();
        if(search(name)== -1)
        System.out.printf("dont exist your teachr");
        else
            System.out.print("your teacher exist");

        int x=123456789;
        System.out.printf("new shenase for your teacher is %d",x);
        
        
    }
    
    public static void enterName()
    {
        for (int i = 0; i < 5; i++)
        {
            teacher[i] = new String() ;
            System.out.printf("Enter name of teachers i+1 ");
            teacher[i] = input.next();
            
        }
    }
    public static void entershenase()
    {
        for( int i=0 ; i<5 ; i++ )
        {
            int[]shteacher=new int[5];
            System.out.printf("Enter shenase of teachers noh raghami i+1 ");
            shteacher[i] = input.nextInt();
        }
        
    }
    public static void entershoghle()
    {
        for (int i = 0; i < 5; i++) 
        {
            shoghle[i] = new String();
            System.out.printf("Enter shoghle of teachers i+1 ");
            shoghle[i] = input.next();
            
        }
    }
    public static void entermadrak()
    {
        for (int i = 0; i < 5; i++) {
            madrak[i] = new String();
            System.out.printf("Enter madrak of teachers i+1 ");
            madrak[i] = input.next();
            
        }
    }
    public static int search(String name)
    {
        for(int i=0;i<5;i++)
        
            if(teacher[i].equalsIgnoreCase(name))
                return i;
            return -1;
        
    }
}
