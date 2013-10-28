/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.util.List;

/**
 *
 * @author guest01
 */
public class EntradaProduto {
    private int cod;
    private Fornecedor fornecedor;
    private List<Produto> produto;
    private int qtde;

    public EntradaProduto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "EntradaProduto{" + "cod=" + cod + ", fornecedor=" + fornecedor + ", produto=" + produto + ", qtde=" + qtde + '}';
    }
    
}
