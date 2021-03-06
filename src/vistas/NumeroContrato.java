package vistas;

import javax.swing.ImageIcon;

public class NumeroContrato extends javax.swing.JFrame {

    public NumeroContrato() {
        initComponents();
        this.setTitle("Número de contrato");
        //ICONO
        setIconImage(new ImageIcon(getClass().getResource("/imgs/MercadoAbasto_icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfnumerocontrato = new javax.swing.JTextField();
        jbimprimir = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jbaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(2, 166, 57));
        jTextField2.setFont(new java.awt.Font("Open Sans", 1, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("NÚMERO DE CONTRATO");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/contrato.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        tfnumerocontrato.setFont(new java.awt.Font("Open Sans", 1, 40)); // NOI18N
        tfnumerocontrato.setForeground(new java.awt.Color(153, 153, 153));
        tfnumerocontrato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfnumerocontrato.setText("14 - 154");
        tfnumerocontrato.setBorder(null);
        tfnumerocontrato.setOpaque(false);
        jPanel2.add(tfnumerocontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 58, 260, 70));

        jbimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imprimir_off.png"))); // NOI18N
        jbimprimir.setBorder(null);
        jbimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbimprimir.setOpaque(false);
        jbimprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imprimir_on.png"))); // NOI18N
        jbimprimir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imprimir_on.png"))); // NOI18N
        jbimprimir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/imprimir_on.png"))); // NOI18N
        jPanel1.add(jbimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 145, -1, -1));

        jbcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancelar_off.png"))); // NOI18N
        jbcancelar.setBorder(null);
        jbcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbcancelar.setOpaque(false);
        jbcancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancelar_on.png"))); // NOI18N
        jbcancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancelar_on.png"))); // NOI18N
        jbcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cancelar_on.png"))); // NOI18N
        jPanel1.add(jbcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, -1, -1));

        jbaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aceptar_off.png"))); // NOI18N
        jbaceptar.setBorder(null);
        jbaceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbaceptar.setOpaque(false);
        jbaceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aceptar_on.png"))); // NOI18N
        jbaceptar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aceptar_on.png"))); // NOI18N
        jbaceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/aceptar_on.png"))); // NOI18N
        jPanel1.add(jbaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 145, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 189));

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
            java.util.logging.Logger.getLogger(NumeroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumeroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumeroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumeroContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumeroContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbaceptar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbimprimir;
    private javax.swing.JTextField tfnumerocontrato;
    // End of variables declaration//GEN-END:variables
}
