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
public class AcessoInstrumento extends Conexao{
    private int id;
    private String cor;
    private int ano;
    private String marca;
    private int id_cliente;
    private int id_tipo_instrumento;
    private ResultSet resultado;
    
    public AcessoInstrumento(){
        Conectar();
    }
    //BUSCA POR TODOS
    public ResultSet Lista()throws Exception{
        try{
        
            getStmt();
            resultado = stmt.executeQuery("SELECT * FROM INSTRUMENTO");
            return resultado;
        }catch (Exception ex){
            System.out.println("SQLException: "+ ex.getMessage());
            return null;
        }
    }
    
    //BUSCA POR ID
    public ResultSet BuscaExistente(int Codigo) throws Exception{

        try{
            getStmt();
            resultado = stmt.executeQuery("SELECT i.id, i.cor, i.ano, i.marca, t.nome as instrumento FROM instrumento i\n" +
                                        "inner join cliente c\n" +
                                        "on (i.id_cliente = c.id)\n" +
                                        "inner join tipoinstrumento t\n" +
                                        "on (i.id_tipo_instrumento = t.id)\n" +
                                        "WHERE i.id_cliente ="+Codigo);
            return resultado;
        }catch (Exception ex){
            System.out.println("SQLException: "+ex.getMessage());
            return null;
        }
    }
}



