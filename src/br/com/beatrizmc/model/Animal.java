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
public class Animal {

    private int cod;
    private Raca raca;
    private Cliente cliente;
    private String nome;
    private String sexo;
    private String pai;
    private String mae;
    private String porte;
    private String Obs;
    private int idade;
    private Date dtCadastro;
    private Date dtNascimento;
    private String cor;
    private int numPedigree;
    private String status;

    public Animal() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPedigree() {
        return numPedigree;
    }

    public void setNumPedigree(int numPedigree) {
        this.numPedigree = numPedigree;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Animal{" + "cod=" + cod + ", raca=" + raca + ", cliente=" + cliente + ", nome=" + nome + ", sexo=" + sexo + ", pai=" + pai + ", mae=" + mae + ", porte=" + porte + ", Obs=" + Obs + ", idade=" + idade + ", dtCadastro=" + dtCadastro + ", dtNascimento=" + dtNascimento + ", cor=" + cor + ", numPedigree=" + numPedigree + ", status=" + status + '}';
    }
}
