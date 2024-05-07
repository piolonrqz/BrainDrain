/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Piolo Enriquez
 */
public class connectDatabase {
        private static final String URL = "jdbc:mysql://localhost:3306/braindrain";
        private static final String USERNAME = "";
        private static final String PASSWORD = "";
        public static Connection getConnection(){
            Connection c = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Connected to the database!");
            }catch(ClassNotFoundException  | SQLException e){
                throw new RuntimeException(e);
            }
                return c;
        }

    public static void main(String[] args) {
        getConnection();
    }
}
