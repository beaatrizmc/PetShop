/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.view;

import br.com.beatrizmc.controller.FuncionarioController;
import br.com.beatrizmc.model.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class FuncionarioListaGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();

    public FuncionarioListaGUI() {
        initComponents();
        criaJTable();
        painelRolagem.setViewportView(tabela);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelRolagem = new javax.swing.JScrollPane();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        painelRolagem.setBackground(new java.awt.Color(255, 255, 255));

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo_32.png"))); // NOI18N
        btInserir.setToolTipText("Adicionar usuário");
        btInserir.setBorder(null);
        btInserir.setContentAreaFilled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar 32.png"))); // NOI18N
        btEditar.setToolTipText("Editar");
        btEditar.setContentAreaFilled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(255, 255, 255));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir 32.png"))); // NOI18N
        btRemover.setToolTipText("Remover");
        btRemover.setBorder(null);
        btRemover.setContentAreaFilled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar.:");

        txPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txPesquisar))
                    .addComponent(painelRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEditar)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idUsuario = (int) tabela.getValueAt(linhaSelecionada, 0);
            FuncionarioInserirGUI ui = new FuncionarioInserirGUI(modelo, linhaSelecionada, idUsuario);
            ui.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada.");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        FuncionarioInserirGUI ui = new FuncionarioInserirGUI(modelo);
        //Posicionar a janela no meio da tela.
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void txPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisarActionPerformed
        String nome = txPesquisar.getText();
        FuncionarioController uc = new FuncionarioController();

        uc.listByNome(nome);

        modelo.setNumRows(0);
        for (Funcionario u : uc.listByNome(nome)) {
            modelo.addRow(new Object[]{u.getCodigo(), u.getNome(), u.getCpf(), u.getLogin()});
        }
    }//GEN-LAST:event_txPesquisarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = -1;
        linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int id = (int) tabela.getValueAt(linhaSelecionada, 0);
            FuncionarioController uc = new FuncionarioController();
            if (uc.remove(id)) {
                JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
                modelo.removeRow(linhaSelecionada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada.");
        }
    }//GEN-LAST:event_btRemoverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane painelRolagem;
    private javax.swing.JTextField txPesquisar;
    // End of variables declaration//GEN-END:variables

    private void criaJTable() {
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Usuário");
        preencherJTable();
    }

    private void preencherJTable() {
        FuncionarioController uc = new FuncionarioController();
        for (Funcionario u : uc.listarTodos()) {
            modelo.addRow(new Object[]{u.getCodigo(), u.getNome(), u.getCpf(), u.getLogin()});
        }
    }
}