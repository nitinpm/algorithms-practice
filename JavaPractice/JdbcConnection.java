package JavaPractice;

import java.sql.*;

/**
 * First Step: Add the JAR file ojdbcXX.jar to the build path
 * Ctrl+Alt+Shift+S --> Modules --> Dependencies --> + button on right side.
 */
public class JdbcConnection {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "nitin", "system");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM EMP");
            while(res.next()){
                System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));
            }

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
