import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;



public class Main {
    final static Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        BasicConfigurator.configure();

        if (args.length != 1) {
            LOG.info("Invalid number of arguments: Must provide JDBC string to test as argument");
            return;
        }

        String jdbcString = args[0];

        DriverManager.registerDriver(new SQLServerDriver());

        LOG.info("\n ******* Initiating JDBC test with JDBC String..... ******* \n");
        
        Connection connection = DriverManager.getConnection(jdbcString);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT SUSER_SNAME()");

        if (resultSet.next()) {
            LOG.info("\n" +
                    "Connection established!! \n" +
                    "You have successfully logged on as: " + resultSet.getString(1) + "\n");
        }

        statement.close();
        connection.close();
    }
}

