/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author guest01
 */
public class SaidaProduto {

    private int cod;
    private String motivo;
    private List<Produto> produto;
    private Date data;
    private int qtde;

    public SaidaProduto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "SaidaProduto{" + "cod=" + cod + ", motivo=" + motivo + ", produto=" + produto + ", data=" + data + ", qtde=" + qtde + '}';
    }

  
}
