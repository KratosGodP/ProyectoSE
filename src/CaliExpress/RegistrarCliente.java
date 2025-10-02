
package CaliExpress;

import BEXPRESS.model.Cliente;
import javax.swing.JOptionPane;

public class RegistrarCliente extends javax.swing.JPanel {
    private Integer filaEditando = null;
private Integer idEditando   = null;


    public RegistrarCliente() {
        initComponents();
    }
public RegistrarCliente(int fila, int id, String dni, String nombre, String email, String tel, String dir) {
    initComponents();
    

    txtDni.setText(dni);
    txtNombre.setText(nombre);
    txtEmail.setText(email);
    txtTelefono.setText(tel);
    txtDireccion.setText(dir);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        Dirección = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Registro de Cliente");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Nombre :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Telefono :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Dni :");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Correo :");

        Dirección.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Dirección.setText("Dirección :");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dirección)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDni)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))))
                .addGap(347, 347, 347))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dirección))
                .addGap(36, 36, 36)
                .addComponent(btnRegistrar)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                                           
    String dni     = txtDni.getText().trim();
    String nombre  = txtNombre.getText().trim();
    String email   = txtEmail.getText().trim();
    String tel     = txtTelefono.getText().trim();
    String dir     = txtDireccion.getText().trim();

    // --- Validaciones ---
    if (!dni.matches("\\d{8}|\\d{11}")) { // DNI(8) o RUC(11)
        JOptionPane.showMessageDialog(this, "DNI/RUC inválido"); return;
    }
    if (nombre.isEmpty()) { JOptionPane.showMessageDialog(this, "El nombre es obligatorio"); return; }
    if (email.isEmpty()) { JOptionPane.showMessageDialog(this, "El correo es obligatorio"); return; }
    if (!email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
        JOptionPane.showMessageDialog(this, "Correo inválido"); return;
    }
    if (!tel.matches("\\d{6,15}")) {
        JOptionPane.showMessageDialog(this, "Teléfono inválido (6 a 15 dígitos)"); return;
    }
    if (dir.isEmpty()) { JOptionPane.showMessageDialog(this, "La dirección es obligatoria"); return; }

    // (Opcional) evitar duplicado por DNI/RUC en la tabla:
    for (int i = 0; i < HClientes.modelo.getRowCount(); i++) {
        String dniTabla = (String) HClientes.modelo.getValueAt(i, 3); // col 3 = Dni
        if (dniTabla.equals(dni)) { JOptionPane.showMessageDialog(this, "El DNI/RUC ya existe"); return; }
    }

    // --- Registrar en la tabla ---
    int id = HClientes.modelo.getRowCount() + 1;
    String fecha = java.time.LocalDateTime.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    HClientes.modelo.addRow(new Object[]{ id, nombre, email, dni, tel, dir, fecha });

    JOptionPane.showMessageDialog(this, "Cliente registrado correctamente");
    Dashboard.todoPanel(new HClientes());   // volver a la lista

    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dirección;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
