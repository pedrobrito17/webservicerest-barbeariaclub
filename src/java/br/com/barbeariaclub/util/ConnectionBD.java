/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbeariaclub.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro-brito
 */
public class ConnectionBD {
    private final String USER = "root";
    private final String PASSWORD = "kI3jBdQFmF"; //"YBRgiq66167";
    private final String URL = "jdbc:mysql://node160004-envpb.jelasticlw.com.br/barbearia";//"jdbc:mysql://localhost/BarbeariaClub_BD"; 
    Connection conn = null;
    
    public Connection conectarBD(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }   
}
