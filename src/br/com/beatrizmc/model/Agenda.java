/*
 * Agendamento dos serviços para saber os serviços a afetuar no dia
 */
package br.com.beatrizmc.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Beatriz Marcelina
 */
public class Agenda {
    private int cod;
    private Date dataAge;
    private Time hora;
    private List<Servico> servico;
    private Animal animal;
    private String status;

    public Agenda() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDataAge() {
        return dataAge;
    }

    public void setDataAge(Date dataAge) {
        this.dataAge = dataAge;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }


    public Animal getAnimal() {
        return animal;
    }

    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Agenda{" + "cod=" + cod + ", dataAge=" + dataAge + ", hora=" + hora + ", servico=" + servico + ", animal=" + animal + ", status=" + status + '}';
    }

}
