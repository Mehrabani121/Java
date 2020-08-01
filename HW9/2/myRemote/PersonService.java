package myRemote;

import java.rmi.Remote;
import java.util.List;

/**
 * Created by Minoofam on 8/11/2019.
 */
public interface PersonService extends Remote {
    void save (Person person)throws Exception;
    List<Person> report () throws Exception;
}