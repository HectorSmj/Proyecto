
package Main;

import Banco.AgregarCuentasDebito;
import Empleado.AgregarEmpleado;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        agregarEmpleado = new javax.swing.JMenuItem();
        agregarAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agregarCuentaDebito = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jMenu1.setText("Programas");

        agregarEmpleado.setText("Agregar empleado");
        agregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(agregarEmpleado);

        agregarAlumno.setText("Agregar alumno");
        agregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(agregarAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Banca");

        agregarCuentaDebito.setText("Agregar Cuenta de Debito");
        agregarCuentaDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCuentaDebitoActionPerformed(evt);
            }
        });
        jMenu2.add(agregarCuentaDebito);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEmpleadoActionPerformed
        // TODO add your handling code here:
        AgregarEmpleado ventana = new AgregarEmpleado();
        escritorio.add(ventana);
        ventana.toFront();
        ventana.setVisible(true);
    }//GEN-LAST:event_agregarEmpleadoActionPerformed

    private void agregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarAlumnoActionPerformed

    private void agregarCuentaDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCuentaDebitoActionPerformed
        // TODO add your handling code here:
        AgregarCuentasDebito ventana = new AgregarCuentasDebito();
        escritorio.add(ventana);
        ventana.toFront();
        ventana.setVisible(true);
    }//GEN-LAST:event_agregarCuentaDebitoActionPerformed

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
    private javax.swing.JMenuItem agregarAlumno;
    private javax.swing.JMenuItem agregarCuentaDebito;
    private javax.swing.JMenuItem agregarEmpleado;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
