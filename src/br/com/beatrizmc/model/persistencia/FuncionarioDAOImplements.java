/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model.persistencia;

import br.com.beatrizmc.model.Funcionario;
import br.com.beatrizmc.persistencia.dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author guest01
 */
public class FuncionarioDAOImplements implements FuncionarioDAO { //implements
    //FuncionarioDAO{

    private static final String INSERT = "insert into funcionarios (nome, estadocivil,cpf,rg,sexo, nascionalidade, telefone,"
            + " telefone1, celular, email, dtnasc,salario,pis, hora,login, senha,estado, cidade, bairro, rua, numero, "
            + "complemento,cep ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?);";
    private static final String UPDATE = "update "
            + "funcionarios set nome=?,estadocivil=?,"
            + " cpf=?, rg=?, sexo=?, nascionalidade=?,telefone=?,"
            + "telefone1=?,celular=?,email=?, dtnasc=?,"
            + "salario=?, pis=?, hora=?, login=?,senha=?, estado=?, cidade = ?, bairro = ?, rua = ?, numero = ?, complemento = ?, cep = ? where codigo = ?;";
    private static final String LIST = "select"
            + " * from funcionarios;";
    private static final String REMOVE = "delete "
            + " from funcionarios where codigo = ?;";
    private static final String LISTBYID = "select "
            + "* from funcionarios where codigo = ?;";
    private static final String LISTBYNOME =
            "select * from funcionarios where "
            + "nome like ?;";
    public static final String VALIDARLOGIN = "select login, senha from funcionarios where login = ? and senha = ?;";

    @Override
    public int salve(Funcionario u) {
        if (u.getCodigo() == 0) {
            return insert(u);
        } else {
            return update(u);
        }
    }

    private int insert(Funcionario u) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT,
                    Statement.RETURN_GENERATED_KEYS);

            pstm.setString(1, u.getNome());
            pstm.setString(2, u.getEstadoCivil());
            pstm.setString(3, u.getCpf());
            pstm.setString(4, u.getRg());
            pstm.setString(5, u.getSexo());
            pstm.setString(6, u.getNascionalidade());
            pstm.setString(7, u.getTelefone());
            pstm.setString(8, u.getTelefone1());
            pstm.setString(9, u.getCelular());
            pstm.setString(10, u.getEmail());
            pstm.setDate(11, new java.sql.Date(u.getDtNascimento().getTime()));
            pstm.setDouble(12, u.getSal());
            pstm.setString(13, u.getPis());
            pstm.setString(14, u.getHora());
            pstm.setString(15, u.getLogin());
            pstm.setString(16, u.getSenha());
            pstm.setString(17, u.getUf());
            pstm.setString(18, u.getCidade());
            pstm.setString(19, u.getBairro());
            pstm.setString(20, u.getRua());
            pstm.setInt(21, u.getNumero());
            pstm.setString(22, u.getComplemento());
            pstm.setString(23, u.getCep());
           
            pstm.execute();

            try (ResultSet rs =
                    pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    retorno = rs.getInt(1);
                }
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao inserir: " + e);
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (SQLException ex) {
            }
            return retorno;
        }
    }

    @Override
    public boolean remove(int codigo) {
        boolean status = false;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(REMOVE);
            pstm.setInt(1, codigo);
            pstm.execute();
            status = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir um"
                    + "Funcionário" + e.getMessage());
        } finally {
            try {
                ConnectionFactory.
                        closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }
        }
        return status;
    }

    @Override
    public List<Funcionario> listAll() {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios =
                new ArrayList<>();
        try {
            con = ConnectionFactory.
                    getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario u = new Funcionario();
                //nome, foto,"
                //+ "estadocivil, cpf, rg, sexo, nascionalidade,telefone,telefone1,celular,"
                //+ "email, dtnasc, dtcadastro,salario, pis, hora, login,senha
                u.setCodigo(rs.getInt("codigo"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                funcionarios.add(u);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao listar as pessoas"
                    + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }
        }
        return funcionarios;


    }

    @Override
    public Funcionario listById(int codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario u = new Funcionario();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();

            while (rs.next()) {
                u.setNome(rs.getString("nome"));
                u.setEstadoCivil(rs.getString("estadocivil"));
                u.setCpf(rs.getString("cpf"));
                u.setRg(rs.getString("rg"));
                u.setSexo(rs.getString("sexo"));
                u.setNascionalidade(rs.getString("nascionalidade"));
                u.setTelefone(rs.getString("telefone"));
                u.setTelefone1(rs.getString("telefone1"));
                u.setCelular(rs.getString("celular"));
                u.setEmail(rs.getString("email"));
                u.setDtNascimento(rs.getDate("dtnasc"));
                u.setSal(rs.getDouble("salario"));
                u.setPis(rs.getString("pis"));
                u.setHora(rs.getString("hora"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setUf(rs.getString("estado"));
                u.setCidade(rs.getString("cidade"));
                u.setBairro(rs.getString("bairro"));
                u.setCep(rs.getString("cep"));
                u.setRua(rs.getString("rua"));
                u.setNumero(rs.getInt("numero"));
                u.setComplemento(rs.getString("complemento"));
                u.setCodigo(rs.getInt("codigo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao listar o usuário "
                    + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }
        }
        return u;
    }

    private int update(Funcionario u) {
        Connection con = null;
        PreparedStatement pstm = null;
        int retorno = -1;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, u.getNome());
            pstm.setString(2, u.getEstadoCivil());
            pstm.setString(3, u.getCpf());
            pstm.setString(4, u.getRg());
            pstm.setString(5, u.getSexo());
            pstm.setString(6, u.getNascionalidade());
            pstm.setString(7, u.getTelefone());
            pstm.setString(8, u.getTelefone1());
            pstm.setString(9, u.getCelular());
            pstm.setString(10, u.getEmail());
            pstm.setDate(11, new java.sql.Date(u.getDtNascimento().getTime()));
            pstm.setDouble(12, u.getSal());
            pstm.setString(13, u.getPis());
            pstm.setString(14, u.getHora());
            pstm.setString(15, u.getLogin());
            pstm.setString(16, u.getSenha());
            pstm.setString(17, u.getUf());
            pstm.setString(18, u.getCidade());
            pstm.setString(19, u.getBairro());
            pstm.setString(20, u.getRua());
            pstm.setInt(21, u.getNumero());
            pstm.setString(22, u.getComplemento());
            pstm.setString(23, u.getCep());
            pstm.setInt(24, u.getCodigo());
            pstm.execute();
            retorno = u.getCodigo();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao editar os dados"
                    + "do usuário " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }

        }
        return retorno;

    }

    @Override
    public List<Funcionario> listByNome(String nome) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario u = new Funcionario();
                u.setNome(rs.getString("nome"));
                u.setEstadoCivil(rs.getString("estadocivil"));
                u.setCpf(rs.getString("cpf"));
                u.setRg(rs.getString("rg"));
                u.setSexo(rs.getString("sexo"));
                u.setNascionalidade(rs.getString("nascionalidade"));
                u.setTelefone(rs.getString("telefone"));
                u.setTelefone1(rs.getString("telefone1"));
                u.setCelular(rs.getString("celular"));
                u.setEmail(rs.getString("email"));
                u.setDtNascimento(rs.getDate("dtnasc"));
                u.setSal(rs.getDouble("salario"));
                u.setPis(rs.getString("pis"));
                u.setHora(rs.getString("hora"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));        
                u.setUf(rs.getString("estado"));
                u.setCidade(rs.getString("cidade"));
                u.setBairro(rs.getString("bairro"));
                u.setCep(rs.getString("cep"));
                u.setRua(rs.getString("rua"));
                u.setNumero(rs.getInt("numero"));
                u.setComplemento(rs.getString("complemento"));
                u.setCodigo(rs.getInt("codigo"));
                funcionarios.add(u);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao pesquisar usuário"
                    + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao fechar a conexão"
                        + e.getMessage());
            }
        }
        return funcionarios;
    }

    @Override
    public boolean autenticarLogin(String login, String senha) {

        boolean autenticado = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = ConnectionFactory.getConnection();

            pstm = con.prepareStatement(VALIDARLOGIN);
            pstm.setString(1, login);
            pstm.setString(2, senha);

            rs = pstm.executeQuery();

            while (rs.next()) {
                autenticado = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao autentificar login: " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + ex.getMessage());
            }
        }
        return autenticado;

    }
}
