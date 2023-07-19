/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorgui;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author DELL
 */
public class settraiff extends javax.swing.JFrame {
    String t="",gs="";
    public settraiff() {
        initComponents();
        setSize(500,200);
        k.setVisible(false);
        ki.setVisible(false);
        onei.setVisible(false);
        nisi.setVisible(false);
        sifi.setVisible(false);
        foei.setVisible(false);
        foze.setVisible(false);
        thei.setVisible(false);
        sisep.setVisible(false);
        no.setVisible(false);
        fonip.setVisible(false);
        sithp.setVisible(false);
        oneip.setVisible(false);
        tag.setVisible(false);
        gsg.setVisible(false);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        mc = new javax.swing.JTextField();
        k = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tag = new javax.swing.JLabel();
        gsg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        thei = new javax.swing.JRadioButton();
        nisi = new javax.swing.JRadioButton();
        foei = new javax.swing.JRadioButton();
        onei = new javax.swing.JRadioButton();
        sifi = new javax.swing.JRadioButton();
        foze = new javax.swing.JRadioButton();
        sisep = new javax.swing.JRadioButton();
        sithp = new javax.swing.JRadioButton();
        fonip = new javax.swing.JRadioButton();
        oneip = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ki = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        k.setText("Kilowatt Used");

        jLabel2.setText("MeterCode");

        tag.setText("Taxs");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        thei.setText("5.250 pounds");
        thei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theiActionPerformed(evt);
            }
        });

        nisi.setText("15.96 pounds");
        nisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nisiActionPerformed(evt);
            }
        });

        foei.setText("8.750 pounds");
        foei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foeiActionPerformed(evt);
            }
        });

        onei.setText("17.18 pounds");
        onei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneiActionPerformed(evt);
            }
        });

        sifi.setText("12.65 pounds");
        sifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifiActionPerformed(evt);
            }
        });

        foze.setText("18.40 pounds");
        foze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fozeActionPerformed(evt);
            }
        });

        sisep.setText("10pounds");
        sisep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisepActionPerformed(evt);
            }
        });

        sithp.setText("13 pounds");
        sithp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sithpActionPerformed(evt);
            }
        });

        fonip.setText("15 pounds");
        fonip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonipActionPerformed(evt);
            }
        });

        oneip.setText("18 pounds");
        oneip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneipActionPerformed(evt);
            }
        });

        no.setText("NONE");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        ki.setText("jLabel3");

        jLabel5.setText("Levies and polices");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ki, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sisep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oneip, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(nisi)
                            .addComponent(thei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sithp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(onei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(foei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gsg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fonip, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(foze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ki, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foei)
                            .addComponent(sifi)
                            .addComponent(thei)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nisi)
                    .addComponent(onei)
                    .addComponent(foze))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(gsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sisep)
                                    .addComponent(sithp)
                                    .addComponent(fonip))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneip)
                            .addComponent(no))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void theiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theiActionPerformed
        
        t=thei.getText();
        onei.setSelected(false);
        nisi.setSelected(false);
        sifi.setSelected(false);
        foei.setSelected(false);
        foze.setSelected(false);
        
    }//GEN-LAST:event_theiActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       long mc1=Long.parseLong(mc.getText());
        Operator o =new Operator();
        o.setmetercode(mc1);
        if(o.traiff()){
            long y=o.getKilowatt();
            String kilo = Long.toString(y);
            k.setVisible(true);
            ki.setVisible(true);
            onei.setVisible(true);
            nisi.setVisible(true);
            sifi.setVisible(true);
            foei.setVisible(true);
            foze.setVisible(true);
            thei.setVisible(true);
            sisep.setVisible(true);
            no.setVisible(true);
            fonip.setVisible(true);
            sithp.setVisible(true);
            oneip.setVisible(true);
            tag.setVisible(true);
            gsg.setVisible(true);
            setSize(618,470);
            k.setText("Kilowatt Consumed");
            ki.setText(kilo);
        }
        else
            JOptionPane.showMessageDialog(rootPane,"This Customer is not found","Error", ERROR_MESSAGE);
            
    }//GEN-LAST:event_searchActionPerformed

    private void foeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foeiActionPerformed
        t=foei.getText();
        foze.setSelected(false);
        thei.setSelected(false);
        onei.setSelected(false);
        nisi.setSelected(false);
        sifi.setSelected(false);
    }//GEN-LAST:event_foeiActionPerformed

    private void sifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifiActionPerformed
        t=sifi.getText();
        foei.setSelected(false);
        foze.setSelected(false);
        thei.setSelected(false);
        onei.setSelected(false);
        nisi.setSelected(false);
    }//GEN-LAST:event_sifiActionPerformed

    private void nisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisiActionPerformed
       t=nisi.getText();
        sifi.setSelected(false);
        foei.setSelected(false);
        foze.setSelected(false);
        thei.setSelected(false);
        onei.setSelected(false);
    }//GEN-LAST:event_nisiActionPerformed

    private void oneiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneiActionPerformed
       t=onei.getText();
        nisi.setSelected(false);
        sifi.setSelected(false);
        foei.setSelected(false);
        foze.setSelected(false);
        thei.setSelected(false);
    }//GEN-LAST:event_oneiActionPerformed

    private void fozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fozeActionPerformed
       t=foze.getText();
        foei.setSelected(false);
        thei.setSelected(false);
        onei.setSelected(false);
        nisi.setSelected(false);
        sifi.setSelected(false);
    }//GEN-LAST:event_fozeActionPerformed

    private void sisepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisepActionPerformed
       gs=sisep.getText();
       fonip.setSelected(false);
       sithp.setSelected(false);
       oneip.setSelected(false);
       no.setSelected(false);
    }//GEN-LAST:event_sisepActionPerformed

    private void sithpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sithpActionPerformed
       gs=sithp.getText();
       oneip.setSelected(false);
       no.setSelected(false);
       sisep.setSelected(false);
       fonip.setSelected(false);
       
    }//GEN-LAST:event_sithpActionPerformed

    private void fonipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonipActionPerformed
       gs=fonip.getText();
       sithp.setSelected(false);
       oneip.setSelected(false);
       no.setSelected(false);
       sisep.setSelected(false);
    }//GEN-LAST:event_fonipActionPerformed

    private void oneipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneipActionPerformed
        gs=oneip.getText();
        sisep.setSelected(false);
        no.setSelected(false);
        fonip.setSelected(false);
        sithp.setSelected(false);
    }//GEN-LAST:event_oneipActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        gs=no.getText();
        sisep.setSelected(false);
        oneip.setSelected(false);
        fonip.setSelected(false);
        sithp.setSelected(false);
    }//GEN-LAST:event_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(t.compareTo("")==0||gs.compareTo("")==0){
            JOptionPane.showMessageDialog(rootPane,"Please choose from both Taxs and GovermentSupport","Error", ERROR_MESSAGE);
        }
        else{
        Operator o = new Operator();
        long mc1=Long.parseLong(mc.getText());
        o.setmetercode(mc1);
        float f=Float.parseFloat(t.substring(0,4));
        if(!gs.equals("NONE")){
        int f1=Integer.parseInt(gs.substring(0,2));
        o.setTax(f+f1);}
        else{
        o.setTax(f);}
        if(o.tariff1()){ 
        JOptionPane.showMessageDialog(rootPane,"Updated Successfully");
        foze.setSelected(false);
        thei.setSelected(false);
        onei.setSelected(false);
        nisi.setSelected(false);
        sifi.setSelected(false);
        foei.setSelected(false);
        sisep.setSelected(false);
        oneip.setSelected(false);
        fonip.setSelected(false);
        sithp.setSelected(false);
        no.setSelected(false);}}
        
          
                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new operatorchoice().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(settraiff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settraiff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settraiff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settraiff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settraiff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JRadioButton foei;
    private javax.swing.JRadioButton fonip;
    private javax.swing.JRadioButton foze;
    private javax.swing.JLabel gsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel k;
    private javax.swing.JLabel ki;
    private javax.swing.JTextField mc;
    private javax.swing.JRadioButton nisi;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton onei;
    private javax.swing.JRadioButton oneip;
    private javax.swing.JButton search;
    private javax.swing.JRadioButton sifi;
    private javax.swing.JRadioButton sisep;
    private javax.swing.JRadioButton sithp;
    private javax.swing.JLabel tag;
    private javax.swing.JRadioButton thei;
    // End of variables declaration//GEN-END:variables
}
