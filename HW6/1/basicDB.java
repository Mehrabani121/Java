import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Minoofam on 8/3/2019.
 */
public class basicDB {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "amirhadi",
                    "myjava123");
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into person (id,name,family) values (?,?,?)");
            preparedStatement.setLong(1, 2);
            preparedStatement.setString(2, "amirhadi");
            preparedStatement.setString(3, "minoofam");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e)
        {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
