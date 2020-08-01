import model.entity.PersonEnti;
import model.service.PersonServ;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Minoofam on 8/9/2019.
 */
public class Main
{
    public static void main (String[] args) {

        //insert
        try {
            PersonServ.getInstance ().save (new PersonEnti ().setId (1).setName ("Amir").setFamily ("Minoofam").setSalary (1000));
            System.out.println ("saved successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

        //update
        try {
            PersonServ.getInstance ().edit (new PersonEnti ().setId (1).setName ("Hamed").setFamily ("Minoofam").setSalary (9999));
            System.out.println ("edited successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to edit!"+e.getMessage ());

        }
        //delete
        try {
            PersonServ.getInstance ().remove (3);
            System.out.println ("removed successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to delete!"+e.getMessage ());
        }
        //select
        try {
            List<PersonEnti> personList = PersonServ.getInstance().report ();
        for (PersonEnti personEnti : personList) {
            System.out.println(personEnti.getSalary());
            System.out.println(personEnti.getName());
            System.out.println(personEnti.getFamily());
            System.out.println(personEnti.getId());
        }
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }
    }
}
