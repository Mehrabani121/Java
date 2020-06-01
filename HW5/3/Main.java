package Serialization;

import java.io.*;

/**
 * Created by Minoofam on 8/11/2019.
 */
public class Main {
    public static void main(String[] args)  {
        Person person2 = new Person();
        Person person1 = new Person();
        person1.setName("Hossein");
        person1.setId(1);
        person2.setName("Hashem");
        person2.setId(2);


// Write Object
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\ROOT\\TEST.TXT");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
//Read Object
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\ROOT\\TEST.TXT");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person x = (Person) objectInputStream.readObject();
            Person y = (Person) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(x.getName());
            System.out.println(x.getId());
            System.out.println(y.getName());
            System.out.println(y.getId());
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
