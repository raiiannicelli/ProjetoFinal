//Ricardo Lima 2565510
//Geisily Varga 2478404;
//Raí I. Morato 2623420;

package br.com.banco.visao;
import javax.swing.JOptionPane;

import br.com.banco.controle.GerenciadorDeContas;
import br.com.banco.modelo.ContaBancaria;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ricardo
 */
public class FormDeposito extends javax.swing.JFrame {

    private FormConta telaPrincipal;
    
    /**
     * Creates new form FormDeposito
     */
    public FormDeposito() {
        initComponents();
    }
    
    public FormDeposito(FormConta telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        initComponents();
        preencherDadosConta();
    }
    
    private void preencherDadosConta() {
        if (telaPrincipal != null && telaPrincipal.getConta() != null) {
            ContaBancaria conta = telaPrincipal.getConta();
            cxNumeroConta.setText(conta.getNumeroConta());
            cxAgencia.setText(conta.getAgencia());
            cxNumeroConta.setEnabled(false); // Desabilita edição
            cxAgencia.setEnabled(false); // Desabilita edição
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtNumeroConta = new javax.swing.JLabel();
        cxNumeroConta = new javax.swing.JTextField();
        rtValorDeposito = new javax.swing.JLabel();
        cxValorDeposito = new javax.swing.JTextField();
        btDepositar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rtDeposito = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        rtAgencia = new javax.swing.JLabel();
        cxAgencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtNumeroConta.setText("Número da conta");

        cxNumeroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumeroContaActionPerformed(evt);
            }
        });

        rtValorDeposito.setText("Valor para depósito");

        btDepositar.setText("Depositar");
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rtDeposito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtDeposito.setText("Depósito");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rtAgencia.setText("Agência");

        cxAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAgenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(rtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rtAgencia)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDepositar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(rtValorDeposito)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNumeroConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtAgencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(rtValorDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar)
                    .addComponent(btLimpar))
                .addGap(42, 42, 42)
                .addComponent(btSair)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxNumeroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumeroContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumeroContaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        String numeroConta = cxNumeroConta.getText().trim();
        String agencia = cxAgencia.getText().trim();
        String valorTexto = cxValorDeposito.getText().trim();
        
        if (numeroConta.isEmpty() || agencia.isEmpty() || valorTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            double valor = Double.parseDouble(valorTexto);
            if (valor <= 0) {
                JOptionPane.showMessageDialog(this, "O valor do depósito deve ser positivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ContaBancaria conta = GerenciadorDeContas.buscarConta(numeroConta, agencia);
            
            if (conta != null) {
                boolean sucesso = GerenciadorDeContas.depositar(numeroConta, agencia, valor);
                
                if (sucesso) {
                    // Atualizar a tela principal
                    if (telaPrincipal != null) {
                        telaPrincipal.atualizarSaldo();
                    }
                    
                    JOptionPane.showMessageDialog(this, 
                        "Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!\n" +
                        "Novo saldo: R$ " + String.format("%.2f", conta.getSaldo() + valor), 
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Fecha o formulário após o depósito
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao realizar o depósito. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Conta não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            cxValorDeposito.requestFocus();
        }
        
        limpar();
    }//GEN-LAST:event_btDepositarActionPerformed

    private void cxAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAgenciaActionPerformed

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Confirmação de Saída",
                JOptionPane.YES_NO_OPTION
        );
        if(resp==0){
            dispose();
        }
    }
    
    public void limpar() {
        cxNumeroConta.setText("");
        cxValorDeposito.setText("");
        cxAgencia.setText("");
        cxNumeroConta.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAgencia;
    private javax.swing.JTextField cxNumeroConta;
    private javax.swing.JTextField cxValorDeposito;
    private javax.swing.JLabel rtAgencia;
    private javax.swing.JLabel rtDeposito;
    private javax.swing.JLabel rtNumeroConta;
    private javax.swing.JLabel rtValorDeposito;
    // End of variables declaration//GEN-END:variables
}
