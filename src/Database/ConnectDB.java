package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDB 
{
    public static Connection connectdb() throws ClassNotFoundException
    {
        try
        {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/final","postgres", "hoangyb611");
        //JOptionPane.showMessageDialog(null, "Kết nối với database thành công");
        return con;
        }
    catch(SQLException error)
    {
        JOptionPane.showMessageDialog(null, error);
        return null;
    }
    }
}