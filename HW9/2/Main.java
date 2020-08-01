import myRemote.Person;
import myRemote.PersonService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Minoofam on 8/11/2019.
 */
public class Main {
    public static void main(String[] args)  {
        try {
            PersonService personService = (PersonService) Naming.lookup("//localhost/DBService");
            Person person = new Person(1,"javad");
            personService.save(person);

            List<Person> personList  = personService.report ();
            for (Person prs : personList) {
                System.out.println("id: "+ prs.getId());
                System.out.println("name: "+prs.getName());
            }
        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (NotBoundException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
