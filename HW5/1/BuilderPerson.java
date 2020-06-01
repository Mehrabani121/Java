package patternBuilder;

/**
 * Created by Minoofam on 8/3/2019.
 */
public class BuilderPerson {
    private int id;
    private String name;
    private String family;
    private int personCode;

    public BuilderPerson (int id, String name, String family, int personCode) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.personCode = personCode;
    }

    public BuilderPerson (){}

    public int getId () {
        return id;
    }

    public BuilderPerson setId (int id) {
        this.id = id;
        return this;
    }

    public String getName () {
        return name;
    }

    public BuilderPerson setName (String name) {
        this.name = name;
        return this;
    }

    public String getFamily () {
        return family;
    }

    public BuilderPerson setFamily (String family) {
        this.family = family;
        return this;
    }

    public int getPersonCode () {
        return personCode;
    }

    public BuilderPerson setPersonCode (int personCode) {
        this.personCode = personCode;
        return this;
    }

}
