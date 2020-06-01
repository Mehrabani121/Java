package Serialization;

import java.io.Serializable;

/**
 * Created by Minoofam on 8/11/2019.
 */
public class Person implements Serializable {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}