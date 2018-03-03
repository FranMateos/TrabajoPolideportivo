package persistence;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class VentanaInsertar extends javax.swing.JFrame {

    public VentanaInsertar() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        rellenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDeporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioDeporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoPolideportivo = new javax.swing.JTextField();
        btnInsertarDeporte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMonitor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidosMonitor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDNIMonitor = new javax.swing.JTextField();
        cmbMonitorDeporte = new javax.swing.JComboBox<>();
        btnInsertarMonitor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellidosAlumno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbDeporteAlumno = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtDNIAlumno = new javax.swing.JTextField();
        btnInsertarAlumno = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Deporte");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Código de polideportivo");

        btnInsertarDeporte.setText("Insertar");
        btnInsertarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarDeporteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Monitor");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellidos");

        jLabel8.setText("DNI");

        btnInsertarMonitor.setText("Insertar");
        btnInsertarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarMonitorActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Alumno");

        jLabel11.setText("Nombre");

        jLabel12.setText("Apellidos");

        jLabel13.setText("Fecha de nacimiento");

        jLabel14.setText("Deporte");

        jLabel15.setText("DNI");

        btnInsertarAlumno.setText("Insertar");
        btnInsertarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAlumnoActionPerformed(evt);
            }
        });

        jLabel16.setText("Monitor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreMonitor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidosMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDNIMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNIAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel14)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoPolideportivo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMonitorDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbDeporteAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(2, 2, 2)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarAlumno)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnInsertarDeporte, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnInsertarMonitor)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoPolideportivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarDeporte)
                    .addComponent(jLabel16)
                    .addComponent(cmbMonitorDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtApellidosMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtDNIMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsertarMonitor)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cmbDeporteAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtDNIAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarAlumno))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarDeporteActionPerformed

        Deporte dep = new Deporte(txtNombreDeporte.getText(),
                new BigDecimal(txtPrecioDeporte.getText()),
                Integer.parseInt(txtCodigoPolideportivo.getText()),
                cmbMonitorDeporte.getSelectedItem().toString());
        if (QueriesEmbebidas.insertarNuevoDeporte(dep)) {
            JOptionPane.showMessageDialog(null, "Deporte añadido exitosamente");
            rellenarComboBox();
        } else {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar el deporte");
        }
    }//GEN-LAST:event_btnInsertarDeporteActionPerformed

    private void btnInsertarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarMonitorActionPerformed
        // TODO add your handling code here:
        Monitor mon = new Monitor(
                txtDNIMonitor.getText(),
                txtNombreMonitor.getText(),
                txtApellidosMonitor.getText());
        if (QueriesEmbebidas.insertarNuevoMonitor(mon)) {
            JOptionPane.showMessageDialog(null, "Monitor añadido exitosamente");
            rellenarComboBox();
        } else {
            JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar el monitor");
        }
    }//GEN-LAST:event_btnInsertarMonitorActionPerformed

    private void btnInsertarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAlumnoActionPerformed

        Date fec = new Date();
        try {
            String fecha[] = txtFechaNacimiento.getText().split("/");
            fec.setDate(Integer.parseInt(fecha[0]));
            fec.setMonth(Integer.parseInt(fecha[1]));
            fec.setYear(Integer.parseInt(fecha[2]));

            Alumno alu = new Alumno(
                    txtDNIAlumno.getText(),
                    txtNombreAlumno.getText(),
                    txtApellidosAlumno.getText(),
                    fec);
            if (QueriesEmbebidas.insertarNuevoAlumnoYDeporte(alu, (cmbDeporteAlumno.getSelectedIndex()+1))) {
                JOptionPane.showMessageDialog(null, "Alumno añadido exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ha habido un problema al insertar el alumno");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "La fecha ha de tener un formato dd/mm/aaaa");
        }
    }//GEN-LAST:event_btnInsertarAlumnoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInsertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertarAlumno;
    private javax.swing.JButton btnInsertarDeporte;
    private javax.swing.JButton btnInsertarMonitor;
    private javax.swing.JComboBox<String> cmbDeporteAlumno;
    private javax.swing.JComboBox<String> cmbMonitorDeporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidosAlumno;
    private javax.swing.JTextField txtApellidosMonitor;
    private javax.swing.JTextField txtCodigoPolideportivo;
    private javax.swing.JTextField txtDNIAlumno;
    private javax.swing.JTextField txtDNIMonitor;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreDeporte;
    private javax.swing.JTextField txtNombreMonitor;
    private javax.swing.JTextField txtPrecioDeporte;
    // End of variables declaration//GEN-END:variables

    private void rellenarComboBox() {
        List<Monitor> list = QueriesEmbebidas.listadoMonitores();
        List<Deporte> listDep = QueriesEmbebidas.listadoDeportes();
        cmbMonitorDeporte.removeAllItems();
        for (Monitor m : list) {
            cmbMonitorDeporte.addItem(m.getNombreMonitor());
        }
        cmbDeporteAlumno.removeAllItems();
        for (Deporte d : listDep) {
            cmbDeporteAlumno.addItem(d.getDescripcionDeporte() + "");
        }
    }
}
