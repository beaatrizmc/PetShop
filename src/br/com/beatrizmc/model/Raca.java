/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

/**
 *
 * @author guest01
 */
public class Raca {
    private int cod;
    private String nome;
    private String especie;

    public Raca() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Raca{" + "cod=" + cod + ", nome=" + nome + ", especie=" + especie + '}';
    }
    
}
