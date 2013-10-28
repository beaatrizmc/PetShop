/*
 * cheque, avista, cartão debito, cartão credito
 */
package br.com.beatrizmc.model;

/**
 *
 * @author guest01
 */
public class FormaPagamento {
    private int cod;
    private String descricao;

    public FormaPagamento() {
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

    @Override
    public String toString() {
        return "FormaPagamento{" + "cod=" + cod + ", descricao=" + descricao + '}';
    }
    
}
