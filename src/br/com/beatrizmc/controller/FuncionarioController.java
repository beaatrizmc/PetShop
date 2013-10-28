/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.controller;

import br.com.beatrizmc.model.Funcionario;
import br.com.beatrizmc.model.persistencia.FuncionarioDAOImplements;
import br.com.beatrizmc.persistencia.dao.FuncionarioDAO;
import java.util.List;

/**
 *
 * @author guest01
 */
public class FuncionarioController {
    
        public int salvar(Funcionario u) {
        FuncionarioDAO dao =
                new FuncionarioDAOImplements();
        return dao.salve(u);
    }

    public List<Funcionario> listarTodos() {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll();
    }
    
    public List<Funcionario> listByNome(String nome){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome);
    }

    public Funcionario listById(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listById(codigo);
    }
    
    public boolean remove(int id) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remove(id);
    }
        public boolean autenticarLogin (String login, String senha){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.autenticarLogin(login, senha);
    }
}