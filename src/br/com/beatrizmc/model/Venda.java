/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author guest01
 */
public class Venda {
    private int cod;
    private Date dataVen;
    private Time horaVen;
    private Funcionario funcionario;
    private Cliente cliente;
    private FormaPagamento formaPag;
    private List<Produto> produto;

    public Venda() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDataVen() {
        return dataVen;
    }

    public void setDataVen(Date dataVen) {
        this.dataVen = dataVen;
    }

    public Time getHoraVen() {
        return horaVen;
    }

    public void setHoraVen(Time horaVen) {
        this.horaVen = horaVen;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(FormaPagamento formaPag) {
        this.formaPag = formaPag;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Venda{" + "cod=" + cod + ", dataVen=" + dataVen + ", horaVen=" + horaVen + ", funcionario=" + funcionario + ", cliente=" + cliente + ", formaPag=" + formaPag + ", produto=" + produto + '}';
    }

    
}
