
package Land;

import java.sql.Connection;
import java.sql.DriverManager;


public class DB{
 static  Connection getconnection()throws Exception{
     Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/land", "root", "123");
     return c;
 
 }  
}

