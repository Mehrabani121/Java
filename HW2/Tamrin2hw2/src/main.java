
public class main {

    
    
    public static void main(String[] args) {
        
        
        person p1=new person("Amir","blond",187);
        person p2=null;
        person p3=null;
        try{
            p2=(person) p1.clone();
            System.out.println(p1);
            System.out.println(p1.haircolor);
            System.out.println(p1.hight);
            System.out.println(p1.name);
            System.out.println("/n");
            System.out.println(p2.name);
            System.out.println(p2.haircolor);
            System.out.println(p2.hight);
            System.out.println(p2);
            p3=(person) p1.clone();
            System.out.println("/n");
            System.out.println(p3.name);
            System.out.println(p3.haircolor);
            System.out.println(p3.hight);
            System.out.println(p3);





           }catch(CloneNotSupportedException e){
               System.out.println("CloneNotSupportedException");
           }
    }
    
}
