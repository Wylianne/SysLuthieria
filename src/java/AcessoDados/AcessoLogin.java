package AcessoDados;


import AcessoDados.Conexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wylianne
 */
public class AcessoLogin extends Conexao{
    private int id;
    private int id_usuario;
    private int id_escola;
    private String dat_hot_login;
    private ResultSet resultado;
    
    public AcessoLogin(){
        Conectar();
    }
    
    public ResultSet Lista()throws Exception{
        try{
        
            getStmt();
            resultado = stmt.executeQuery("SELECT * FROM SEG_LOGIN");
            return resultado;
        }catch (Exception ex){
            System.out.println("SQLException: "+ ex.getMessage());
            return null;
        }
    }
    
    public ResultSet BuscaExixtente(int Codigo) throws Exception{

        try{
            getStmt();
            resultado = stmt.executeQuery("SELECT * FROM SEG_LOGIN WHERE ID="+Codigo);
            return resultado;
        }catch (Exception ex){
            System.out.println("SQLException: "+ex.getMessage());
            return null;
        }
    }
}


