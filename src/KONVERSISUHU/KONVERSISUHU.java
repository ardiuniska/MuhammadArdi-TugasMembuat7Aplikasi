/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KONVERSISUHU;

/**
 *
 * @author h
 */
public class KONVERSISUHU extends javax.swing.JFrame {
private double suhu;
    private double celcius1;
    private double celcius2;
    private double celcius3;
    private double celcius4;

    private double reamur1;
    private double reamur2;
    private double reamur3;
    private double reamur4;

    private double fahrenheit1;
    private double fahrenheit2;
    private double fahrenheit3;
    private double fahrenheit4;

    private double kelvin1;
    private double kelvin2;
    private double kelvin3;
    private double kelvin4;
    /**
     * Creates new form KONVERSISUHU
     */
    public KONVERSISUHU() {
        initComponents();
        rdcelcius.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfahrenheit = new javax.swing.JTextField();
        txtreamor = new javax.swing.JTextField();
        txtkelvin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtsuhu = new javax.swing.JTextField();
        rdcelcius = new javax.swing.JRadioButton();
        rdfahrenheit = new javax.swing.JRadioButton();
        rdreamor = new javax.swing.JRadioButton();
        rdkelvin = new javax.swing.JRadioButton();
        btnkonversi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtcelcius = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtkelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelvinActionPerformed(evt);
            }
        });

        jLabel12.setText("=========================================================");

        jLabel13.setText("Nama");

        jLabel14.setText("NPM");

        jLabel15.setText("Kelas");

        jLabel16.setText(":");

        jLabel17.setText(":");

        jLabel18.setText(":");

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel19.setText("Muhammad Ardi");

        jLabel2.setText("=========================================================");

        jLabel20.setText("19630732");

        jLabel3.setText("HASIL KONVERSI");

        jLabel21.setText("NonReg Bjm 5B");

        jLabel4.setText("Celcius");

        jLabel22.setText("=========================================================");

        jLabel5.setText("Fahrenheit");

        jLabel6.setText("Reamur");

        jLabel7.setText("Kelvin");

        jLabel8.setText(":");

        jLabel9.setText(":");

        jLabel10.setText(":");

        jLabel1.setText("Suhu Awal");

        rdcelcius.setText("Celcius");

        rdfahrenheit.setText("Fahrenheit");

        rdreamor.setText("Reamur");

        rdkelvin.setText("Kelvin");

        btnkonversi.setText("Konversi");
        btnkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkonversiActionPerformed(evt);
            }
        });

        jLabel11.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnkonversi)
                                .addGap(18, 18, 18)
                                .addComponent(btnclear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdcelcius)
                                .addGap(18, 18, 18)
                                .addComponent(rdfahrenheit)
                                .addGap(18, 18, 18)
                                .addComponent(rdreamor)
                                .addGap(18, 18, 18)
                                .addComponent(rdkelvin))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfahrenheit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtreamor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel22)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdfahrenheit)
                    .addComponent(rdreamor)
                    .addComponent(rdcelcius)
                    .addComponent(rdkelvin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkonversi)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtfahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtreamor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtkelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(492, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtkelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelvinActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtsuhu.setText("");
        txtcelcius.setText("");
        txtfahrenheit.setText("");
        txtreamor.setText("");
        txtkelvin.setText("");
        rdcelcius.setSelected(false);
        rdfahrenheit.setSelected(false);
        rdreamor.setSelected(false);
        rdkelvin.setSelected(false);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkonversiActionPerformed
        suhu = Double.parseDouble(txtsuhu.getText());
        if (rdcelcius.isSelected()){
            txtcelcius.setText("" + suhu*1);
            txtreamor.setText("" + suhu*4/5);
            txtfahrenheit.setText(""+ (suhu*9/5+32));
            txtkelvin.setText("" + (suhu + 273.15));

        } else
        if (rdreamor.isSelected()){
            txtcelcius.setText("" + suhu*5/4);
            txtreamor.setText("" + suhu*1);
            txtfahrenheit.setText(""+ (suhu*9/4+32));
            txtkelvin.setText("" + (suhu * 5/4 + 272));
        } else
        if (rdfahrenheit.isSelected()){
            Double fk = ((suhu-32)*5/9);
            txtcelcius.setText("" + (suhu-32)*5/9);
            txtreamor.setText("" + (suhu-32)*4/9);
            txtfahrenheit.setText(""+ (suhu));
            txtkelvin.setText("" + (fk+272));

        } else
        if (rdkelvin.isSelected()){
            txtcelcius.setText("" + (suhu-272));
            txtreamor.setText("" + (suhu-272)*4/5);
            txtfahrenheit.setText(""+ (suhu-272)*9/5);
            txtkelvin.setText("" + (suhu));
        }
    }//GEN-LAST:event_btnkonversiActionPerformed

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
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KONVERSISUHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KONVERSISUHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnkonversi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdcelcius;
    private javax.swing.JRadioButton rdfahrenheit;
    private javax.swing.JRadioButton rdkelvin;
    private javax.swing.JRadioButton rdreamor;
    private javax.swing.JTextField txtcelcius;
    private javax.swing.JTextField txtfahrenheit;
    private javax.swing.JTextField txtkelvin;
    private javax.swing.JTextField txtreamor;
    private javax.swing.JTextField txtsuhu;
    // End of variables declaration//GEN-END:variables
}
