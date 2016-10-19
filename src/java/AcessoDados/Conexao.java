/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcessoDados;

import java.sql.*;

/**
 *
 * @author Wylianne
 */
public class Conexao {
    protected Connection con;
    protected Statement stmt;
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String databaseName = "sysluthieria";
    private String url = "jdbc:mysql://localhost:3306/" + databaseName;
    private String userName = "root";
    private String password = "";
    private String errString;
    
    
    public Conexao(){
    
    }
    
    private String getConexaoUrl(){
        return url;
    }
    
    public Connection Conectar(){
        con=null;
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(getConexaoUrl(), userName, password);
            stmt = con.createStatement();
            System.out.println("Conectado");
        }catch (Exception e){
            errString = "Erro de conexão";
            System.out.println(errString);
            return null;
        }
        return con;
    }
    
    public void Desconectar(){
        try{
            stmt.close();
            con.close();
        }catch(SQLException e){
            errString = "erro";
        }
    
    }
    
    public Statement getStmt(){
        return this.stmt;
    }
    
}
