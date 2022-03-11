/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elorza.karmele
 */
public class Model {
       private static final String DB = ":E:/Goi mailako zikloa/GitHub/DAM/DAM_1/PROGRAMMING/3.Ebal/UD4/HiztegiaSQLiteMVC/db/Hiztegia.db";
      private static final String DBIzena = "Hiztegia.db";
      private static String taula = "terminoak";

      public Connection connect() {
            Connection conn = null;
            try {
                  // db parameters
                  String url = "jdbc:sqlite" + DB;
                  // create a connection to the database
                  conn = DriverManager.getConnection(url);

                  //System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
            return conn;
      }

      public void terminoakImprimatu() {
            String sql = "SELECT * FROM " + taula;

            try (Connection conn = connect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                  System.out.println("Datu basearen izena " + DBIzena + " izango da eta hurrengo datuak izango ditu:");
                  System.out.println("ID\tEUSKARAZ\tGAZTELERAZ");

                  while (rs.next()) {
                        System.out.printf(rs.getInt("id") + "\t"
                                + rs.getString("euskaraz") + "\t"
                                + rs.getString("gazteleraz") + "\n");
                  }
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }

      public int terminoaGehitu(String euskaraz, String gazteleraz) {
            String sql = "INSERT INTO " + taula + "(euskaraz,gazteleraz) VALUES(?,?)";

            try (Connection conn = connect();
                  PreparedStatement pstmt = conn.prepareStatement(sql)) {
                  pstmt.setString(1, euskaraz);
                  pstmt.setString(2, gazteleraz);
                  return pstmt.executeUpdate();
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
                  return 0;
            }
      }
}
