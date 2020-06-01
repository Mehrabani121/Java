package patternBuilder;

/**
 * Created by Minoofam on 8/3/2019.
 */
public class Person {
    private int id;
    private String name;
    private String family;
    private int personCode;

    public Person (int id, String name, String family, int personCode) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.personCode = personCode;
    }

    public Person (){}

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getFamily () {
        return family;
    }

    public void setFamily (String family) {
        this.family = family;
    }

    public int getPersonCode () {
        return personCode;
    }

    public void setPersonCode (int personCode) {
        this.personCode = personCode;
    }
}
