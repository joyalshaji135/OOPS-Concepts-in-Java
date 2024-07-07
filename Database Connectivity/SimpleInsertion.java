
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
//        DatabaseConnetion.connect();
            insertion();
    }
    private static void insertion(){
        Connection con = null;
        Statement ps = null;
        String url = "jdbc:sqlite:C:\\Users\\TUF\\OneDrive\\Music\\Java Database\\Student.db";
        
        try{
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection(url);
         con.setAutoCommit(false);
            System.out.println("Database Connection Success");
         
         ps = con.createStatement();
         String sql = "INSERT INTO details (username,password) " +
                        "VALUES ('Paul','California');"; 
            ps.executeUpdate(sql);
            ps.close();
            con.commit();
            con.close();
            System.out.println("Inserted Success");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
    }
}
