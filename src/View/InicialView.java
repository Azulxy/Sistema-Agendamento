/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.InicialController;
import Model.Paciente;
import Model.Paciente;
import Repository.PacienteRepository;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvazu
 */
public class InicialView extends javax.swing.JFrame {
    private PacienteRepository repository;
    /**
     * Creates new form InicialView
     */
    public InicialView() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonNovaConsulta = new javax.swing.JButton();
        jButtonExcluirConsulta = new javax.swing.JButton();
        jButtonFinalziarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Boas vindas ao sistema de agendamento");

        jTableTabela.setModel(criarModeloTabela());
        jScrollPane1.setViewportView(jTableTabela);

        jButtonNovaConsulta.setText("NovaConsulta");

        jButtonExcluirConsulta.setText("Excluir Consulta");

        jButtonFinalziarConsulta.setText("Finalizar Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButtonNovaConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFinalziarConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalziarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluirConsulta;
    private javax.swing.JButton jButtonFinalziarConsulta;
    private javax.swing.JButton jButtonNovaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    // End of variables declaration//GEN-END:variables

private DefaultTableModel criarModeloTabela() {
    ArrayList<Paciente> listaPacientes = PacienteRepository.listarPaciente();
    String[] colunas = {"Paciente", "CPF", "Telefone", "Data", "Já é Paciente", "Consulta Realizada"};
    DefaultTableModel tabela = new DefaultTableModel(colunas, 0);
    for (Paciente p : listaPacientes) {
        String[] linha = {
            p.getNome(),
            p.getCpf(),
            p.getTelefone(),
            p.getData(),
            Boolean.toString(p.isJaEraPaciente()),
            Boolean.toString(p.isConsultaRealizada())
        };
        tabela.addRow(linha);
    }
    return tabela;
}
    public void atualizarTabela() {
        ArrayList<Paciente> listaPacientes = repository.listarPaciente();
        DefaultTableModel model = (DefaultTableModel) jTableTabela.getModel();
        model.setRowCount(0); // Limpa a tabela antes de atualizar

        for (Paciente paciente : listaPacientes) {
           model.addRow(new Object[]{paciente.getNome(), paciente.getCpf(), paciente.getTelefone(), paciente.getData()});
        }
    }
    
public javax.swing.JButton getjButtonNovaConsulta() {
    return jButtonNovaConsulta;
}

public javax.swing.JButton getjButtonExcluirConsulta() {
    return jButtonExcluirConsulta;
}

public javax.swing.JButton getjButtonFinalziarConsulta() {
    return jButtonFinalziarConsulta;
}
}
