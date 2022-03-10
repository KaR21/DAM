
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elorza.karmele
 */
public class SQLiteKudeatu {

      private static final String DB = ":E:/Goi mailako zikloa/GitHub/DAM/DAM_1/PROGRAMMING/3.Ebal/UD4/HiztegiaSQLite/db/Hiztegia.db";

      public static Connection connect() {
            Connection conn = null;
            try {
                  // db parameters
                  String url = "jdbc:sqlite" + DB;
                  // create a connection to the database
                  conn = DriverManager.getConnection(url);

                  System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
            return conn;
      }

      public static void terminoakImprimatu() {
            String taula = "terminoak";
            String sql = "SELECT * FROM " + taula;

            try (Connection conn = connect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                  //String izenburura = DB + "";
                  // loop through the result set
                  while (rs.next()) {
                        System.out.println(rs.getInt("id") + "\t"
                                + rs.getString("euskaraz") + "\t"
                                + rs.getString("gazteleraz"));
                  }
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }
}
