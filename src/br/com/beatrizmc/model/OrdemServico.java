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
public class OrdemServico {

    private int cod;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Servico> servico;
    private Double desconto;
    private Double total;

    public OrdemServico() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "cod=" + cod + ", cliente=" + cliente + ", funcionario=" + funcionario + ", servico=" + servico + ", desconto=" + desconto + ", total=" + total + '}';
    }


}
