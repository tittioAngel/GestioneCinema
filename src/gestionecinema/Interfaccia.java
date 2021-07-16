/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Character.UnicodeScript.values;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;


public class Interfaccia extends javax.swing.JFrame {

    /**
     * Creates new form Interfaccia
     */
    public Interfaccia() throws FileNotFoundException {
        
        initComponents();
        try {
            c.riempiCatalogo();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaccia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File in = new File("src\\gestionecinema\\storico_biglietti.txt");
        Scanner input = new Scanner(in);
        
        while(input.hasNextLine()){
            String letta = input.nextLine();
            String[] riga = letta.split(",");
            int numSala = Integer.parseInt(riga[0]);
            String[] orario = riga[1].split(":");
            int ora = Integer.parseInt(orario[0]);
            int min = Integer.parseInt(orario[1]);
            int fila = Integer.parseInt(riga[2]);
            int sedile = Integer.parseInt(riga[3]);
            
            Orario orario_p = new Orario(ora,min);
            Posto posto = new Posto(sedile,fila);
            
            c.proiezioneScelta(orario_p,numSala).getSala_p().occupaPosto(posto);
        }
        
        String []s=new String[c.listaTitoliFilm().size()];
        for (int j=0;j<c.listaTitoliFilm().size();j++){
            s[j]=(String) (c.listaTitoliFilm().get(j));
        } 
        
        listaTitoli.setListData(s);
        listaTitoli.getLastVisibleIndex();
        
        this.stampa.setEnabled(false);
        
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
        qtaBigliettiLabel = new javax.swing.JLabel();
        stampa = new javax.swing.JButton();
        n_salaLabel = new javax.swing.JLabel();
        ListaTitoliFilm = new javax.swing.JScrollPane();
        listaTitoli = new javax.swing.JList<>();
        orariLabel = new javax.swing.JLabel();
        numSala = new javax.swing.JTextField();
        ora = new javax.swing.JComboBox<>();
        prezzo = new javax.swing.JLabel();
        prezzoTot = new javax.swing.JTextField();
        postiLibLabel = new javax.swing.JLabel();
        numPostiLib = new javax.swing.JTextField();
        infoFilm = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(508, 700));

        Titolo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Titolo.setText("CINEMA");

        qtaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        qtaCombo.setSelectedItem(qtaCombo);
        qtaCombo.setToolTipText("");
        qtaCombo.setEnabled(false);
        qtaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtaComboActionPerformed(evt);
            }
        });

        qtaBigliettiLabel.setText("QTA DI BIGLIETTI");

        stampa.setText("STAMPA");
        stampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stampaActionPerformed(evt);
            }
        });

        n_salaLabel.setText("N. SALA");

        listaTitoli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaTitoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTitoliMouseClicked(evt);
            }
        });
        ListaTitoliFilm.setViewportView(listaTitoli);

        orariLabel.setText("ORARI DISPONIBILI");

        numSala.setEnabled(false);

        ora.setEnabled(false);
        ora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oraMouseClicked(evt);
            }
        });

        prezzo.setText("PREZZO");

        prezzoTot.setEnabled(false);

        postiLibLabel.setText("POSTI LIBERI");

        numPostiLib.setEnabled(false);

        infoFilm.setText("INFO FILM");
        infoFilm.setEnabled(false);
        infoFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoFilmActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(ListaTitoliFilm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 241, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(infoFilm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(orariLabel)
                            .add(qtaBigliettiLabel)
                            .add(n_salaLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(qtaCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(ora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prezzoTot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, numPostiLib, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, numSala)))
                        .add(49, 49, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(stampa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(prezzo)
                                    .add(postiLibLabel))
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .add(jPanel1Layout.createSequentialGroup()
                .add(190, 190, 190)
                .add(Titolo)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(Titolo)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(orariLabel)
                            .add(ora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(8, 8, 8)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(n_salaLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(numSala, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(postiLibLabel)
                            .add(numPostiLib, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(qtaBigliettiLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(qtaCombo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(prezzo)
                            .add(prezzoTot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(ListaTitoliFilm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(stampa)
                        .add(31, 31, 31))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(infoFilm)
                        .add(20, 20, 20))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oraMouseClicked
        // TODO add your handling code here:
        numSala.setVisible(true);
        o = ora.getSelectedItem().toString();
        System.out.println(o);
        String[] parti = o.split(":");
        int ora1= Integer.parseInt(parti[0]);
        int minuto= Integer.parseInt(parti[1]);
        orario = new Orario(ora1,minuto);
        numSala.setText(c.visualizzaSalaFilm(s, orario)+"");
        b.setScelta(c.proiezioneScelta(s,orario,c.visualizzaSalaFilm(s, orario)));
        prezzoTot.setText(b.prezzo(n));
        if(b.getScelta().getSala_p().getnLiberi()==0){
            JOptionPane.showMessageDialog(null, "La sala "+b.getScelta().getSala_p().getNumero()+" alle ore "+b.getScelta().getOrario_p().toString()+" è PIENA","ATTENZIONE!!",ERROR_MESSAGE);
            this.numSala.setText("");
            this.prezzoTot.setText("");
            this.numPostiLib.setText("");
            this.listaTitoli.clearSelection();
            this.ora.removeAllItems();
        }else{
            this.numPostiLib.setText(b.getScelta().getSala_p().getnLiberi()+"");
        }
    }//GEN-LAST:event_oraMouseClicked

    private void listaTitoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTitoliMouseClicked

        this.ora.setEnabled(false);
        this.ora.removeAllItems();

        this.qtaCombo.setEnabled(true);
        this.stampa.setEnabled(true);

        s = listaTitoli.getSelectedValue();

        for(int j=0; j<c.visualizzaOrariFilm(s).size(); j++){
            ora.addItem(c.visualizzaOrariFilm(s).get(j).toString());
        }
        this.ora.setEnabled(true);
        n=qtaCombo.getSelectedIndex()+1;
        prezzoTot.setText(b.prezzo(n));
        
        this.infoFilm.setEnabled(true);
    }//GEN-LAST:event_listaTitoliMouseClicked

    private void stampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stampaActionPerformed
        try {
            b.stampaBiglietti(n);

        } catch (IOException ex) {
            Logger.getLogger(Interfaccia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.numSala.setText("");
        this.prezzoTot.setText("");
        this.numPostiLib.setText("");

        this.ora.setEnabled(false);

        this.listaTitoli.clearSelection();
        this.ora.removeAllItems();
    }//GEN-LAST:event_stampaActionPerformed

    private void qtaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtaComboActionPerformed
        n=qtaCombo.getSelectedIndex()+1;
        prezzoTot.setText(b.prezzo(n));
    }//GEN-LAST:event_qtaComboActionPerformed

    private void infoFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoFilmActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,c.restituisciFilm(s),"INFORMAZIONI SUL FILM",INFORMATION_MESSAGE);
    }//GEN-LAST:event_infoFilmActionPerformed
        
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
                try {
                    new Interfaccia().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interfaccia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListaTitoliFilm;
    private javax.swing.JLabel Titolo;
    private javax.swing.JButton infoFilm;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listaTitoli;
    private javax.swing.JLabel n_salaLabel;
    private javax.swing.JTextField numPostiLib;
    private javax.swing.JTextField numSala;
    private javax.swing.JComboBox<String> ora;
    private javax.swing.JLabel orariLabel;
    private javax.swing.JLabel postiLibLabel;
    private javax.swing.JLabel prezzo;
    private javax.swing.JTextField prezzoTot;
    private javax.swing.JLabel qtaBigliettiLabel;
    private javax.swing.JComboBox<String> qtaCombo;
    private javax.swing.JButton stampa;
    // End of variables declaration//GEN-END:variables
    private String s,o;
    private Catalogo c = new Catalogo();
    Biglietto b = new Biglietto();
    private int n;
    private Posto p = new Posto(0,0);
    Orario orario;
}
