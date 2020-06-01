package patternBuilder;

public class PerBuildIJ {
    private int id;
    private String name;
    private String family;
    private int personCode;

    public PerBuildIJ setId (int id) {
        this.id = id;
        return this;
    }

    public PerBuildIJ setName (String name) {
        this.name = name;
        return this;
    }

    public PerBuildIJ setFamily (String family) {
        this.family = family;
        return this;
    }

    public PerBuildIJ setPersonCode (int personCode) {
        this.personCode = personCode;
        return this;
    }

    public Person createPerson () {
        return new Person (id, name, family, personCode);
    }
}