package jdbc;

import java.sql.*;

/**
 * Created by Minoofam on 8/5/2019.
 */
public class Main {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "amirhadi",
                "myjava123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            /* insert into DB */
            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into person (id,name,family) values (?,?,?)");
            preparedStatement1.setLong(1, 2);
            preparedStatement1.setString(2, "amirhadi");
            preparedStatement1.setString(3, "minoofam");
            System.out.println ("Insert into DB: "+preparedStatement1.executeUpdate());

            /* Update inside DB */
            PreparedStatement preparedStatement2 = connection.prepareStatement("update person set name=? WHERE id=? or id=? or id=?");
            preparedStatement2.setString(1, "hamidreza");
            preparedStatement2.setLong(2, 2);
            preparedStatement2.setLong(3, 3);
            preparedStatement2.setLong(4, 4);
            System.out.println ("Update inside DB: "+preparedStatement2.executeUpdate());

            /*Delete from DB*/
            PreparedStatement preparedStatement3 = connection.prepareStatement("delete from person where id=?");
            preparedStatement3.setLong(1, 3);
            System.out.println ("Delete from DB: "+preparedStatement3.executeUpdate());

            /*Select from DB*/
            PreparedStatement preparedStatement4 = connection.prepareStatement("select * from person where id>=?");
            preparedStatement4.setLong(1,1);
            ResultSet resultSet = preparedStatement4.executeQuery();
            System.out.println ("Select results are as follows:");
            while (resultSet.next()) {
                System.out.println("ID: "+resultSet.getLong("ID"));
                System.out.println("Name: "+resultSet.getString("name"));
                System.out.println("Family: "+resultSet.getString("family"));
            }

        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }


}
