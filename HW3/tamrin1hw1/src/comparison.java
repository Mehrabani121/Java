
public class comparison extends information{
    
        static String name1="Amir";
        static int id1=941113089;
        static int pass1=123456;
        public static void comparisons(){
        String idString=String.valueOf(id);
        String id1String=String.valueOf(id1);
        String passString=String.valueOf(pass);
        String pass1String=String.valueOf(pass1);
        


            try {
            
         if(name1.compareTo(name)!=0)
            throw new ArithmeticException();
        else
                System.out.println("doroste");
        } catch (Exception e) {
            System.out.println("ghalat zadi");
        }
         
            
            try {
            
         if(id1String.equals(idString))
            System.out.println("doroste");
            
        else
             throw new ArithmeticException();
         
        } catch (Exception e) {
            System.out.println("ghalat zadi");
        }
 
            
            try {
            
         if(pass1String.equals(passString))
            System.out.println("doroste");
            
        else
             throw new ArithmeticException();
         
        } catch (Exception e) {
            System.out.println("ghalat zadi");
        }
        
        
        }
        
}
