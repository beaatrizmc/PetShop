/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author guest01
 */
public class ConsultaVeterinaria {
    
    private int cod;
    private Animal animal; 
    private Funcionario funcionario;
    private String laudo;
    private Date data;
    private Time hora;
    
    
    public ConsultaVeterinaria() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "ConsultaVeterinaria{" + "cod=" + cod + ", animal=" + animal + ", funcionario=" + funcionario + ", laudo=" + laudo + ", data=" + data + ", hora=" + hora + '}';
    }
    
}
