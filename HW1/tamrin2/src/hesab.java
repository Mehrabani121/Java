import java.util.*;

public class hesab {
    Scanner input = new Scanner(System.in);
    public void GPA(){
        System.out.println("nomareye riazi khod ra bezanid:");
        int x=input.nextInt();
        System.out.println("nomareye fizik khod ra bezanid:");
        int y=input.nextInt();
        System.out.println("nomareye mohasebat khod ra bezanid:");
        int z=input.nextInt();
        float g=((3*x)+(3*y)+(2*z))/8;
        System.out.println("GPA="+g);
        if (g<12) {System.out.println("shoma mashrot shodi moteasefane !");
            
        }
        else
            System.out.println("khoda ro shokr mashrot nashodid!");

    }
}
