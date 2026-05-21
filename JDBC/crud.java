
import java.sql.*;


public class crud {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        // For INsertion 

        // String url = "jdbc:postgresql://localhost:5432/practice";
        // String uname= "postgres";
        // String pass = "1234";

        // String sql = "insert into Persons values (6,'Kannur','Raj','34 Street side','Italy')";

        // Class.forName("org.postgresql.Driver");
        // Connection connect = DriverManager.getConnection(url,uname,pass); 
        // System.out.println("Connected to database");
        // Statement st = connect.createStatement();
        // boolean status = st.execute(sql);
        // System.out.println(status);
        // connect.close();
        // System.out.println("Connection closed");

        // for updation

        // String url = "jdbc:postgresql://localhost:5432/practice";
        // String username = "postgres";
        // String pass = "1234";

        // String sql = "update Persons set firstname='Max' where personid=6";

        // Class.forName("org.postgresql.Driver");
        // Connection connect = DriverManager.getConnection(url,username,pass);
        // System.out.println("Connected to database");
        // Statement st = connect.createStatement();
        // boolean status = st.execute(sql);
        // System.out.println(status);

        // connect.close();
        // System.out.println("Connection closed");

        // for delete 

        String url ="jdbc:postgresql://localhost:5432/practice";
        String username = "postgres";
        String pass = "1234";

        String sql = "delete from Persons where personid ='6'";

        Class.forName("org.postgresql.Driver");
        Connection connect = DriverManager.getConnection(url,username,pass);
        System.out.println("Connected to database");
        Statement st = connect.createStatement();
        st.execute(sql);






    }
}
