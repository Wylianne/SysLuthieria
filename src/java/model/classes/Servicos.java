/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

/**
 *
 * @author Wylianne
 */
public class Servicos {
    private String nome;
    private String descricao;
    private double valor;

    public Servicos(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
