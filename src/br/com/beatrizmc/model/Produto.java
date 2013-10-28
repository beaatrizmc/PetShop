/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.util.Date;

/**
 *
 * @author guest01
 */
public class Produto {

    private int cod;
    private String descricao;
    private int codBarras;
    private CategoriaProduto categoria;
    private int qtdEstoque;
    private Double precoVenda;
    private Double precoCusto; 
    private Date dtValidade;
    private String status;

    public Produto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" + "cod=" + cod + ", descricao=" + descricao + ", codBarras=" + codBarras + ", categoria=" + categoria + ", qtdEstoque=" + qtdEstoque + ", precoVenda=" + precoVenda + ", precoCusto=" + precoCusto + ", dtValidade=" + dtValidade + ", status=" + status + '}';
    }
    
}
