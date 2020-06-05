package Transaction;

import java.sql.*;

/**
 * Created by Minoofam on 8/5/2019.
 */
public class Main {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "amirhadi",
                "myjava123")) {
            Class.forName ("oracle.jdbc.driver.OracleDriver");// for old versions of JDBC
            //1)Set Autocommit to false
            connection.setAutoCommit (false);
            PreparedStatement preparedStatement = connection.prepareStatement ("update account set balance=balance-? where id=?");
            preparedStatement.setLong (1, 100);
            preparedStatement.setLong (2, 1);
            System.out.println ("There is a withdraw from first account: "+preparedStatement.executeUpdate());
    //System.exit (0);

            preparedStatement = connection.prepareStatement ("update account set balance=balance+? where id=?");
            preparedStatement.setLong (1, 100);
            preparedStatement.setLong (2, 2);
            System.out.println ("There is a deposit into second account: "+preparedStatement.executeUpdate());
            //2)commit it yourself
            connection.commit ();

        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println ("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println ("DB ERROR " + e.getMessage ());
        }
    }
}
