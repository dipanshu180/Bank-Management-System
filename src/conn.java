import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn()
    {
        try {
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem ","root","Dip@1234");
            s = c.createStatement();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
