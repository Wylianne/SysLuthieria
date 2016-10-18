/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.util.Date;

/**
 *
 * @author Wylianne
 */
public class Orcamento {
    
    private Date dataValidade;

    public Orcamento(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}
