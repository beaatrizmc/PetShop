/*
 * Banho(porte grande, medio pequeno), tosa(porte grande, medio pequeno), tosar(porte grande, medio pequeno)
 */
package br.com.beatrizmc.model;

import java.sql.Time;

/**
 *
 * @author guest01
 */
public class Servico {

    private int cod;
    private String descricao;
    private Double preco;
    private Time duracao;

    public Servico() {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Servico{" + "cod=" + cod + ", descricao=" + descricao + ", preco=" + preco + ", duracao=" + duracao + '}';
    }
}
