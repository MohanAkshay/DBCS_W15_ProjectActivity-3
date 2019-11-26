package test;

import static org.junit.Assert.assertTrue;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

public class tester 
{
@Test
public void testDatabaseAccess()
   {
     try 
       {
          DriverManager.getConnection("jdbc:mysql://localhost:3306/db_w13_petswithroles","root","akhsay567");
       } 
     catch (SQLException e) 
       {
          assertTrue(false); 
          return;
       }
          assertTrue(true); 
   }
}
