/**
 * File : MysqlUtility.java
 * Deskripsi : Utility class untuk mengelola koneksi ke database MySQL
 */

package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3307/mahasiswa";
                String user = "root";
                String password = "root";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException one) {
                System.out.println("Gagal load driver : "+ one.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : "+ sqle.getMessage());
            }
        }
        return koneksi;
    }
}