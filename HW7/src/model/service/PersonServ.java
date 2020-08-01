package model.service;

import model.entity.PersonEnti;
import model.repository.PersonRepo;

import java.util.List;

/**
 * Created by Minoofam on 8/9/2019.
 */
public class PersonServ {
    private PersonServ () {
    }

    private static PersonServ personServ = new PersonServ ();

    public static PersonServ getInstance () {
        return personServ;
    }

    public void save (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personEnti.setSalary (personEnti.getSalary () - (personEnti.getSalary () * 10 / 100));
            personRepo.insert (personEnti);
            personRepo.commit ();
        }
    }
    public void edit (PersonEnti personEnti) throws Exception{
        try (PersonRepo personRepo=new PersonRepo ()){
            personEnti.setSalary (personEnti.getSalary ()-(personEnti.getSalary ()*10/100));
            personRepo.update (personEnti);
            personRepo.commit ();
        }
    }
    public void remove(long id) throws Exception{
        try (PersonRepo personRepo=new PersonRepo ()){
            personRepo.delete (id);
            personRepo.commit ();
        }
    }
    public List<PersonEnti> report() throws Exception{
        List<PersonEnti> personEntis;
        try (PersonRepo personRepo=new PersonRepo ()){
            personEntis=personRepo.select ();
        }
        return personEntis;
    }

}
