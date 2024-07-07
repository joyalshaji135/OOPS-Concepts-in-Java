
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection connect() throws SQLException{
        String url = "jdbc:sqlite:C:\\Users\\TUF\\OneDrive\\Documents\\NetBeansProjects\\DB\\test\\new.db"; 
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            System.out.println("Connection Successfully");
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e+"");
        }
    return con;
    }
}