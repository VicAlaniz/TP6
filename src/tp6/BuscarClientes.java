/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class BuscarClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarClienes
     */
    public BuscarClientes() {
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

        jlTelefono = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jlDni = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jlCiudad = new javax.swing.JLabel();
        jtCiudad = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);

        jlTelefono.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(0, 153, 153));
        jlTelefono.setText("Teléfono");

        jlTitulo.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jlTitulo.setText("Buscar Clientes");

        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jlDni.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jlDni.setForeground(new java.awt.Color(0, 153, 153));
        jlDni.setText("DNI");

        jtDni.setEditable(false);

        jlApellido.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(0, 153, 153));
        jlApellido.setText("Apellido");

        jtApellido.setEditable(false);

        jlNombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(0, 153, 153));
        jlNombre.setText("Nombre");

        jtNombre.setEditable(false);

        jlCiudad.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jlCiudad.setForeground(new java.awt.Color(0, 153, 153));
        jlCiudad.setText("Ciudad");

        jtCiudad.setEditable(false);
        jtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCiudadActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addGap(27, 27, 27)
                .addComponent(jbSalir)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefono)
                            .addComponent(jlDni)
                            .addComponent(jlApellido)
                            .addComponent(jlNombre)
                            .addComponent(jlCiudad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtTelefono)
                            .addComponent(jtDni)
                            .addComponent(jtApellido)
                            .addComponent(jtNombre)
                            .addComponent(jtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jlTitulo)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlDni)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCiudad)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCiudadActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
            // TODO add your handling code here:
            String telefono = jtTelefono.getText();
            Cliente c = FormularioClientes.getDirectorio().buscarCliente(telefono);
            Directorio dir = FormularioClientes.getDirectorio();
            
            if (dir.buscarCliente(telefono)!=null){
            jtDni.setText(c.getDni()+"");
            jtNombre.setText(c.getNombre());
            jtApellido.setText(c.getApellido());
            jtCiudad.setText(c.getCiudad());
            }
            else {
                JOptionPane.showMessageDialog(this, "Teléfono no encontrado");
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed
 
       private void limpiar() {
            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtCiudad.setText("");
            jtTelefono.setText("");
       }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}