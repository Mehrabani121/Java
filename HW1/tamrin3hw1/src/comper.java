
public class comper extends daryaft{
    static String numbers;
    public static void compersion(){
        
        numbers=string1.replaceAll("[^0-9]", "");
        try {
            if(numbers.isEmpty()!= true)
                throw new ArithmeticException();
            else
                System.out.println(string1);
                
        } catch (Exception e) {
            System.out.println("shamele adad hast !");
        }
    }
    
}
