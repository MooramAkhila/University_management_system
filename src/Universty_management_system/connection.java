
package Universty_management_system;

import java.sql.*;
public class connection 
{
    Connection con;
    Statement stm;
    public connection()
    {
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system","University","IITR@123_rkvalley");
          stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace(); 
        }
        
    }
    public static void main(String args[])
    {
        new connection();
    }
    
}
    