/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import java.sql.DriverManager;

public class Koneksi_db {
    private static java.sql.Connection koneksi_db;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi_db == null){
            try {
                String url = "jdbc:mysql://localhost:3306/aplikasi_crud";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi_db = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi_db;
    }
    public static void main(String args[]){
        getKoneksi();
    }   
}
