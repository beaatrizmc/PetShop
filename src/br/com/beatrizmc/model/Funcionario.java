/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.sql.Time;

/**
 *
 * @author guest01
 */
public class Funcionario extends PessoaFisica{
    private String cargo;
    private double sal;
    private String pis;
    private Time time;
    private String login;
    private String senha;
    private String funcao;

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

   

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + ", sal=" + sal + ", pis=" + pis + ", time=" + time + ", login=" + login + ", senha=" + senha + ", funcao=" + funcao + '}';
    }
    
}
