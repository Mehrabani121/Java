package model.repository;

import model.entity.PersonEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Minoofam on 8/9/2019.
 */
public class PersonRepo implements AutoCloseable{
//public class PersonRepo {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "amirhadi", "myjava123");
        connection.setAutoCommit (false);
    }

    public void insert(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO person(id, name, family, salary) VALUES (?,?,?,?)");
        preparedStatement.setLong (1,personEnti.getId());
        preparedStatement.setString (2,personEnti.getName());
        preparedStatement.setString (3,personEnti.getFamily());
        preparedStatement.executeUpdate ();
    }

    public void update (PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE person SET name =?, family=?,salary=? WHERE id=? ");
        preparedStatement.setString (1,personEnti.getName ());
        preparedStatement.setString (2,personEnti.getFamily ());
        preparedStatement.setInt (3,personEnti.getSalary ());
        preparedStatement.setLong (4,personEnti.getId ());
        preparedStatement.executeUpdate ();
    }

    public void delete(long id) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM person WHERE id=?");
        preparedStatement.setLong (1,id);
        preparedStatement.executeUpdate ();
    }

    public List<PersonEnti> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM person");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<PersonEnti> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            PersonEnti personEnti=new PersonEnti (); // call by reference
            personEnti.setId (resultSet.getLong ("id"));
            personEnti.setName (resultSet.getString ("name"));
            personEnti.setFamily (resultSet.getString ("family"));
            personEnti.setSalary (resultSet.getInt ("salary"));
            personEntiList.add (personEnti);
        }
        return personEntiList;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}
