
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectRecord {
    public static void main(String[] args) {
        Select();
    }
    private static void Select(){
        Connection con = null;
        Statement select = null;
        
        String url = "jdbc:sqlite:C:\\Users\\TUF\\OneDrive\\Music\\Java Database\\Student.db";
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            con.setAutoCommit(false);
            System.out.println("Opened database successfully");
            select = con.createStatement();
        
            ResultSet res = select.executeQuery( "SELECT * FROM details;" );
            
            while (res.next()) {                
                String username = res.getString("username");
                String password = res.getString("password");
                
                System.out.println("Username : "+username);
                System.out.println("Password : "+password);
            }
            
            res.close();
            select.close();
            con.close();
            
            
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e.toString());
        }
    }
}
