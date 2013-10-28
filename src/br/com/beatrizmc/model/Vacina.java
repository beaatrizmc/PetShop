/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

/**
 *
 * @author guest01
 */
public class Vacina {
    private int cod;
    private String tipo;
    private double doce;
    private double preco;

    public Vacina() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDoce() {
        return doce;
    }

    public void setDoce(double doce) {
        this.doce = doce;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Vacina{" + "cod=" + cod + ", tipo=" + tipo + ", doce=" + doce + ", preco=" + preco + '}';
    }
    
}
