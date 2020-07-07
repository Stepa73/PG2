/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;

/**
 *
 * @author stopk
 */
public class MySqlConection implements AutoCloseable{
    // nelezitosti vzoru singleton
    
    private static MySqlConection uniqe;
    
    private MySqlConection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(connectionString);
            if(this.connection.isClosed()){
                this.connection.isValid(10);
            }
        
        
    }

    public static MySqlConection getInstance() throws SQLException, ClassNotFoundException {
        if(uniqe == null)
            uniqe = new MySqlConection();
    return uniqe;
    }
//end singleton
public static MySqlConection getInstance(String connectionString) throws SQLException, ClassNotFoundException{
    MySqlConection.connectionString = connectionString;
    return MySqlConection.getInstance();
}
    private final Connection connection;
    private static String connectionString = "jdbc:mysql://mysql.spse-net.cz/zdrazilst?user=zdrazilst&password=klokan377";

    public Connection getConnection(){
        return connection;
    }

    @Override
    public void close() throws SQLException {
        if(!connection.isClosed())
            this.connection.close();
    }
}


