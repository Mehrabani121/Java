package patternBuilder;

/**
 * Created by Minoofam on 8/3/2019.
 */
public class Main {
    public static void main (String[] args) {

        //Person person1 =new Person (1,"Amir", "Babaei",1111);
        /*Person person2=new Person ();
        person2.setId (1);
        person2.setName ("Amir");
        person2.setFamily ("Babaei");
        person2.setPersonCode (1111);*/

        BuilderPerson builderPerson=new BuilderPerson ().setId (2).setName ("yaghoob").setFamily ("Hamidi");
        System.out.println (builderPerson.getFamily ());

        /*Person perBuildIJ=new PerBuildIJ ().setPersonCode (2222).setName ("Hassan").createPerson ();
        System.out.println (perBuildIJ.getPersonCode ());*/




    }
}
