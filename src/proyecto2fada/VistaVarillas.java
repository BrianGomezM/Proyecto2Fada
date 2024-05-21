package proyecto2fada;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto2fada.Clases.LeerArchivoPlano;
import static proyecto2fada.Clases.LeerArchivoPlano.varillasArchivo;

public class VistaVarillas extends javax.swing.JFrame {

    LeerArchivoPlano le = new LeerArchivoPlano();

    public VistaVarillas() {
        initComponents();
        setLocationRelativeTo(null);
        inhabilitarBotones();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cargarTxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        obtenerVarilla = new javax.swing.JButton();
        longitud = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("PROYECTO VARILLAS ");

        cargarTxt.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        cargarTxt.setForeground(new java.awt.Color(51, 153, 0));
        cargarTxt.setText("CARGAR .TXT");
        cargarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarTxtActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        obtenerVarilla.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        obtenerVarilla.setForeground(new java.awt.Color(0, 153, 0));
        obtenerVarilla.setText("obtener varilla");
        obtenerVarilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerVarillaActionPerformed(evt);
            }
        });

        longitud.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N

        resultado1.setEditable(false);
        resultado1.setColumns(20);
        resultado1.setRows(5);
        jScrollPane2.setViewportView(resultado1);

        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar proceso", "Dinamico", "Voraz" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cargarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(obtenerVarilla))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cargarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(obtenerVarilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerVarillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerVarillaActionPerformed
        resultado1.setText("");
        String procesar = "";
        Integer valor = (Integer) longitud.getValue();
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione el algoritmo");
                break;
            case 1:
                procesar = metodoSolucionDinamico.dinamico(valor);
                resultado1.setText(procesar);
                break;
            case 2:
                procesar = metodoSolucion.procesar(valor);
                resultado1.setText(procesar);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_obtenerVarillaActionPerformed

    private void cargarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarTxtActionPerformed
        try {
            if (le.leerArchivo()) {
                habilitar();
                resultado.setText("");
                JOptionPane.showMessageDialog(null, "Se cargo el archivo correctamente");
                cargarArchivoT();
            } else {
                JOptionPane.showMessageDialog(null, "Error al cargar el  archivo");
            }
        } catch (IOException ex) {
            System.err.println("Error al cargar archivo");
        }
    }//GEN-LAST:event_cargarTxtActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cargarArchivoT() {
        String res = "Varillas  ||   Total\n";
        for (int i = 0; i < varillasArchivo.size(); i++) {
            res += "   " + varillasArchivo.get(i).getLongitud() + "       ||    " + varillasArchivo.get(i).getValor() + "\n";
        }
        resultado.setText(res);

    }

    private void habilitar() {
        resultado.setEnabled(false);
        longitud.setEnabled(true);
        obtenerVarilla.setEnabled(true);
        resultado1.setEnabled(false);
        jComboBox1.setEnabled(true);
    }

    private void inhabilitarBotones() {
        jComboBox1.setEnabled(false);
        resultado.setEnabled(false);
        longitud.setEnabled(false);
        obtenerVarilla.setEnabled(false);
        resultado1.setEnabled(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVarillas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner longitud;
    private javax.swing.JButton obtenerVarilla;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextArea resultado1;
    // End of variables declaration//GEN-END:variables
}
