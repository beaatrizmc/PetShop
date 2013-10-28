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
public class HitoricoVacina {
    private int cod;
    private Date dataVac;
    private Animal animal;
    private Vacina vacina;
    private Funcionario funcionario;

    public HitoricoVacina() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDataVac() {
        return dataVac;
    }

    public void setDataVac(Date dataVac) {
        this.dataVac = dataVac;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "HitoricoVacina{" + "cod=" + cod + ", dataVac=" + dataVac + ", animal=" + animal + ", vacina=" + vacina + ", funcionario=" + funcionario + '}';
    }
    
    
}
