import java.sql.*;

public class conn{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/practice";
        String uname = "postgres";
        String pass = "1234";
        // String sql = "select firstname from persons where personid = 1";
        String sql = "select * from persons";
       Class.forName("org.postgresql.Driver");
       Connection con = DriverManager.getConnection(url,uname,pass); 
       System.out.println("Connected to database");
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
    //    rs.next();
    //    String name  = rs.getString("firstname");
    //    System.out.println(name);
    //    System.out.println(rs.next());

    while(rs.next()){
        System.out.print(rs.getString(1)+ " ");
        System.out.println(rs.getString(2)+ " ");

    }
       con.close();
       System.out.println("Connection closed");

    }
}