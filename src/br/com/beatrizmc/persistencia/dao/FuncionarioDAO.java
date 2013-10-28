/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.persistencia.dao;

import br.com.beatrizmc.model.Funcionario;
import java.util.List;

/**
 *
 * @author guest01
 */
public interface FuncionarioDAO {
    int salve(Funcionario u);
    boolean remove (int codigo);
    List<Funcionario> listAll();
    Funcionario listById(int codigo);   
    List<Funcionario> listByNome(String nome);
    boolean autenticarLogin (String login, String senha);
}
