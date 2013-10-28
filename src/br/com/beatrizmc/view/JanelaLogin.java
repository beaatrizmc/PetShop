/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.view;

import br.com.beatrizmc.controller.FuncionarioController;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author guest01
 */
public class JanelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form JanelaLogin
     */
    public JanelaLogin() {
        initComponents();
    }

    private void autenticarLogin() {
        FuncionarioController fc = new FuncionarioController();
        JanelaPrincipal jp = new JanelaPrincipal();

        String login = txUsuario.getText();
        String senha = new String(txSenha.getPassword());

        boolean autenticado = fc.autenticarLogin(login, senha);

        if (autenticado == true) {
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso.");

            jp.setExtendedState(jp.MAXIMIZED_BOTH);
            jp.setLocationRelativeTo(null);
            jp.setVisible(true);
            this.dispose();
        } else if ((txUsuario.getText().equals("") || txUsuario.getText().equals(null)) || (txSenha.getText().equals("") || txSenha.getText().equals(null))) {
            JOptionPane.showMessageDialog(null, "Login e senha não foram preenchidos.");
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
            txSenha.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        txSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Usuário");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 140, 50, 15);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 180, 50, 15);

        txUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(txUsuario);
        txUsuario.setBounds(160, 130, 150, 30);

        txSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txSenha);
        txSenha.setBounds(160, 170, 150, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Entrar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 220, 33, 14);

        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1382380271_hand-right.png"))); // NOI18N
        btEntrar.setBorderPainted(false);
        btEntrar.setContentAreaFilled(false);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btEntrar);
        btEntrar.setBounds(290, 210, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 30, 110, 26);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema para PetShop");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 60, 180, 17);

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagem1.png"))); // NOI18N
        jPanel1.add(labelImagem);
        labelImagem.setBounds(0, 0, 420, 279);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        autenticarLogin();

    }//GEN-LAST:event_btEntrarActionPerformed

    private void txSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            autenticarLogin();
        }
    }//GEN-LAST:event_txSenhaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JPasswordField txSenha;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
