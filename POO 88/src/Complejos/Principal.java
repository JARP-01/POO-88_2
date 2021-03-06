package Complejos;

public class Principal extends javax.swing.JFrame {

    Operaciones numero = new Operaciones();
    Operaciones numero2 = new Operaciones();

    double real = 0;
    double imaginario = 0;

    public Principal() {
        initComponents();
        
        this.setTitle("Calculadora de numeros complejos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldR1 = new javax.swing.JTextField();
        TextFieldC1 = new javax.swing.JTextField();
        TextFieldC2 = new javax.swing.JTextField();
        TextFieldR2 = new javax.swing.JTextField();
        BotonSuma = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        BotonMultiplicacion = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        BotonNorma = new javax.swing.JButton();
        BotonConjugado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora Complejos");

        jLabel2.setText("Real");

        jLabel3.setText("Complejo");

        jLabel4.setText("Real");

        jLabel5.setText("Complejo");

        TextFieldR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldR1ActionPerformed(evt);
            }
        });

        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });

        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });

        BotonMultiplicacion.setText("x");
        BotonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicacionActionPerformed(evt);
            }
        });

        BotonDivision.setText("/");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });

        BotonNorma.setText("Norma");
        BotonNorma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNormaActionPerformed(evt);
            }
        });

        BotonConjugado.setText("Conjugado");
        BotonConjugado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConjugadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Resultado");

        jLabel8.setText("Digite el primer numero complejo");

        jLabel9.setText("Digite el segundo numero complejo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldR2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldC2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldR1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldC1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(BotonConjugado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(BotonNorma))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(TextFieldR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonMultiplicacion)
                            .addComponent(BotonDivision)
                            .addComponent(BotonSuma)
                            .addComponent(BotonResta))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonNorma)
                        .addGap(16, 16, 16)
                        .addComponent(BotonConjugado)
                        .addGap(4, 4, 4)))
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed

        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        real = Double.parseDouble(TextFieldR2.getText());
        numero2.setReal(real);
        imaginario = Double.parseDouble(TextFieldC2.getText());
        numero2.setImaginario(imaginario);

        jLabel7.setText(String.valueOf(numero.Suma(numero2)));

    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        real = Double.parseDouble(TextFieldR2.getText());
        numero2.setReal(real);
        imaginario = Double.parseDouble(TextFieldC2.getText());
        numero2.setImaginario(imaginario);

        jLabel7.setText(String.valueOf(numero.Resta(numero2)));
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicacionActionPerformed
        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        real = Double.parseDouble(TextFieldR2.getText());
        numero2.setReal(real);
        imaginario = Double.parseDouble(TextFieldC2.getText());
        numero2.setImaginario(imaginario);
        
        jLabel7.setText(String.valueOf(numero.Multiplicacion(numero2)));
    }//GEN-LAST:event_BotonMultiplicacionActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        real = Double.parseDouble(TextFieldR2.getText());
        numero2.setReal(real);
        imaginario = Double.parseDouble(TextFieldC2.getText());
        numero2.setImaginario(imaginario);
        
        jLabel7.setText(String.valueOf(numero.Division(numero2)));
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonConjugadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConjugadoActionPerformed
        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        
        jLabel7.setText(String.valueOf(numero.Conjugado()));
    }//GEN-LAST:event_BotonConjugadoActionPerformed

    private void TextFieldR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldR1ActionPerformed

    private void BotonNormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNormaActionPerformed
        real = Double.parseDouble(TextFieldR1.getText());
        numero.setReal(real);
        imaginario = Double.parseDouble(TextFieldC1.getText());
        numero.setImaginario(imaginario);
        
        jLabel7.setText(String.valueOf(numero.Norma()));
    }//GEN-LAST:event_BotonNormaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConjugado;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonMultiplicacion;
    private javax.swing.JButton BotonNorma;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JTextField TextFieldC1;
    private javax.swing.JTextField TextFieldC2;
    private javax.swing.JTextField TextFieldR1;
    private javax.swing.JTextField TextFieldR2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
