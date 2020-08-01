package model.entity;

/**
 * Created by Minoofam on 8/9/2019.
 */
public class PersonEnti {

    private long id;
    private String name, family;
    private int salary;

    public long getId () {
        return id;
    }

    public PersonEnti setId (long id) {
        this.id = id;
        return this;
    }

    public String getName () {
        return name;
    }

    public PersonEnti setName (String name) {
        this.name = name;
        return this;
    }

    public String getFamily () {
        return family;
    }

    public PersonEnti setFamily (String family) {
        this.family = family;
        return this;
    }

    public int getSalary () {
        return salary;
    }

    public PersonEnti setSalary (int salary) {
        this.salary = salary;
        return this;
    }
}
