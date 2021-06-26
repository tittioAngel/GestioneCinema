/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matte
 */
public class Interfaccia extends javax.swing.JFrame {

    /**
     * Creates new form Interfaccia
     */
    public Interfaccia() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        Titolo = new javax.swing.JLabel();
        qtaCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        stampa = new javax.swing.JButton();
        n_salaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTitoli = new javax.swing.JList<>();
        orariLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ora = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titolo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Titolo.setText("CINEMA");

        qtaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        qtaCombo.setSelectedItem(qtaCombo);
        qtaCombo.setToolTipText("");
        qtaCombo.setEnabled(false);

        jLabel2.setText("QTA DI BIGLIETTI");

        stampa.setText("STAMPA");
        stampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stampaActionPerformed(evt);
            }
        });

        n_salaLabel.setText("N. SALA");

        listaTitoli.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                listaTitoliMouseWheelMoved(evt);
            }
        });
        listaTitoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTitoliMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaTitoliMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaTitoli);

        orariLabel.setText("ORARI DISPONIBILI");

        jTextField1.setEnabled(false);

        ora.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 241, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Titolo)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(stampa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jPanel1Layout.createSequentialGroup()
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(orariLabel)
                                .add(jLabel2))
                            .add(18, 18, 18)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(qtaCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(ora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(n_salaLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(49, 49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(jScrollPane1))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(Titolo)
                        .add(36, 36, 36)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(orariLabel)
                            .add(ora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(37, 37, 37)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(qtaCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(n_salaLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 51, Short.MAX_VALUE)
                        .add(stampa)))
                .add(21, 21, 21))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTitoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTitoliMouseClicked
        
        //ora.addItem("18:00");
        ora.removeAllItems();
        System.out.println(c.selezionaOrarioFilm(s).size());
        ora.setEnabled(true);
        qtaCombo.setEnabled(true);
        try {
            c.riempiCatalogo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaccia.class.getName()).log(Level.SEVERE, null, ex);
        }
        s = listaTitoli.getSelectedValue();
        for(int j=0; j<c.selezionaOrarioFilm(s).size(); j++){
            ora.addItem(c.selezionaOrarioFilm(s).get(j).toString());
        }
        
        //System.out.println(listaTitoli.getSelectedValue());
        //listaTitoli.
        
    }//GEN-LAST:event_listaTitoliMouseClicked

    private void stampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stampaActionPerformed

    }//GEN-LAST:event_stampaActionPerformed

    private void listaTitoliMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_listaTitoliMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTitoliMouseWheelMoved

    private void listaTitoliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTitoliMousePressed

    }//GEN-LAST:event_listaTitoliMousePressed
    
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
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaccia().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titolo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JList<String> listaTitoli;
    private javax.swing.JLabel n_salaLabel;
    public javax.swing.JComboBox<String> ora;
    private javax.swing.JLabel orariLabel;
    public javax.swing.JComboBox<String> qtaCombo;
    private javax.swing.JButton stampa;
    // End of variables declaration//GEN-END:variables
    private String s;
    private Catalogo c = new Catalogo();

    public String getS() {
        return s;
    }
}
