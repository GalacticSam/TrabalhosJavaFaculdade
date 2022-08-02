package cadastro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aluno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gurma
 */
public class TelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    
    ArrayList<Aluno> alunos = new ArrayList<>();
    int currentID;

    public TelaAluno() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGSexo = new javax.swing.ButtonGroup();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLRA = new javax.swing.JLabel();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFeminino = new javax.swing.JRadioButton();
        jLSexo = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBExibir = new javax.swing.JButton();
        jBFirst = new javax.swing.JButton();
        jBPrevious = new javax.swing.JButton();
        jBNext = new javax.swing.JButton();
        jBLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADisplay = new javax.swing.JTextArea();
        jTFRA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Alunos");
        setResizable(false);

        jLNome.setText("Nome:");

        jLRA.setText("RA:");

        jBGSexo.add(jRBMasculino);
        jRBMasculino.setSelected(true);
        jRBMasculino.setText("Masculino");

        jBGSexo.add(jRBFeminino);
        jRBFeminino.setText("Feminino");

        jLSexo.setText("Sexo:");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBExibir.setText("Exibir");
        jBExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExibirActionPerformed(evt);
            }
        });

        jBFirst.setText("<<");
        jBFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFirstActionPerformed(evt);
            }
        });

        jBPrevious.setText("<");
        jBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreviousActionPerformed(evt);
            }
        });

        jBNext.setText(">");
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });

        jBLast.setText(">>");
        jBLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLastActionPerformed(evt);
            }
        });

        jTADisplay.setEditable(false);
        jTADisplay.setColumns(20);
        jTADisplay.setRows(5);
        jScrollPane1.setViewportView(jTADisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLSexo)
                            .addComponent(jLRA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFRA, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRBMasculino)
                        .addGap(79, 79, 79)
                        .addComponent(jRBFeminino)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExibir)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLast)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLRA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino)
                    .addComponent(jLSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCadastrar)
                    .addComponent(jBPesquisar)
                    .addComponent(jBExcluir)
                    .addComponent(jBExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFirst)
                    .addComponent(jBPrevious)
                    .addComponent(jBNext)
                    .addComponent(jBLast))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:
        alunos.add(new Aluno(jTFNome.getText(), jTFRA.getText(), jRBMasculino.isSelected()));
        jTFNome.setText("");
        jTFRA.setText("");
        jRBMasculino.setSelected(true);
        currentID = alunos.size() - 1;
        jTADisplay.setText(alunos.get(currentID).toString());
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // TODO add your handling code here:
        boolean encontrado = false;
        
        for (int i = 0; i < alunos.size(); i++) {
            if(jTFNome.getText().isBlank() || jTFRA.getText().isBlank()){
                if(jTFNome.getText().equals(alunos.get(i).getNome()) && !jTFNome.getText().isBlank()){
                    jTADisplay.setText(alunos.get(i).toString());
                    encontrado = true;
                    currentID = i;
                }else if(jTFRA.getText().equals(alunos.get(i).getRA()) && !jTFRA.getText().isBlank()){
                    jTADisplay.setText(alunos.get(i).toString());
                    encontrado = true;
                    currentID = i;
                }
            }else{
                if(jTFNome.getText().equals(alunos.get(i).getNome()) && jTFRA.getText().equals(alunos.get(i).getRA())){
                    jTADisplay.setText(alunos.get(i).toString());
                    encontrado = true;
                    currentID = i;
                }
            }
        }
        if (!encontrado){
            JOptionPane.showMessageDialog(null,"Aluno nao encontrado", "Erro", HEIGHT);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        // TODO add your handling code here:
        alunos.remove(alunos.get(currentID));
        if (alunos.isEmpty()){
            jTADisplay.setText("");
        }else if(currentID < alunos.size()){
            jTADisplay.setText(alunos.get(currentID).toString());
        }else if (!alunos.isEmpty()){
            jTADisplay.setText(alunos.get(currentID - 1).toString());
            currentID--;
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExibirActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < alunos.size(); i++) {
            sb.append("Aluno "+ (i + 1) + " {\n" + alunos.get(i) + "\n}\n\n");
        }
        
        JOptionPane.showMessageDialog(null, sb, "Lista alunos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBExibirActionPerformed

    private void jBFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFirstActionPerformed
        // TODO add your handling code here:
        currentID = 0;
        jTADisplay.setText(alunos.get(currentID).toString());
    }//GEN-LAST:event_jBFirstActionPerformed

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        // TODO add your handling code here:
        if(currentID > 0){
            currentID--;
            jTADisplay.setText(alunos.get(currentID).toString());
        }
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        // TODO add your handling code here:
        if(currentID < alunos.size() - 1){
            currentID++;
            jTADisplay.setText(alunos.get(currentID).toString());
        }
    }//GEN-LAST:event_jBNextActionPerformed

    private void jBLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLastActionPerformed
        currentID = alunos.size() - 1;
        jTADisplay.setText(alunos.get(currentID).toString());
    }//GEN-LAST:event_jBLastActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBExibir;
    private javax.swing.JButton jBFirst;
    private javax.swing.ButtonGroup jBGSexo;
    private javax.swing.JButton jBLast;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBPrevious;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRA;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADisplay;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRA;
    // End of variables declaration//GEN-END:variables
}
