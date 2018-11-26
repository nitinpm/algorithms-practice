package JavaPractice;

import java.sql.*;

/**
 * First Step: Add the JAR file ojdbc8.jar to the build path
 * Ctrl+Alt+Shift+S --> Modules --> Dependencies --> + button on right side.
 */
public class JdbcConnection {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        //OTHER WAY : THis way con, stmt, rs becomes part of try and java automatically closes these after use.
        /*try(Connection con = getConnection(url, username, password, "org.postgresql.Driver");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            //EXECUTE QUERIES.....
        }*/

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "nitin", "system");
            stmt = con.createStatement();
            res = stmt.executeQuery("SELECT * FROM EMP");
            while(res.next()){
                System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3));
            }

            con.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally { // Or we can create a helper class to close the below connections.
            try { res.close(); } catch (Exception e) { /* ignored */ }
            try { stmt.close(); } catch (Exception e) { /* ignored */ }
            try { con.close(); } catch (Exception e) { /* ignored */ }
        }
    }
}
