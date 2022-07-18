/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cyber
 */
public class HyperMethod {

    private static final String url = "jdbc:mysql://localhost/lms";
    private static final String username = "lmsadmin";
    private static final String password = "GThzWA4PE!N1F[lx";
    private static Connection conn = null;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return HyperMethod.conn;
    }

}
