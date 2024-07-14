
package Ventana;

public class Ventana_Editar extends javax.swing.JInternalFrame {

    public Ventana_Editar() {
        initComponents();
        this.setSize(650, 500);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Lbl_nombre = new javax.swing.JLabel();
        Lbl_apellido = new javax.swing.JLabel();
        Lbl_telefono = new javax.swing.JLabel();
        Lbl_correo = new javax.swing.JLabel();
        Lbl_correo1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 230, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_nombre.setText("Nombre");
        jPanel2.add(Lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 30));

        Lbl_apellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_apellido.setText("Apellido");
        jPanel2.add(Lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 30));

        Lbl_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_telefono.setText("Telefono");
        jPanel2.add(Lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 30));

        Lbl_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_correo.setText("Correo");
        jPanel2.add(Lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        Lbl_correo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_correo1.setText("Dirección");
        jPanel2.add(Lbl_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));

        txt_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 230, 30));

        txt_Apellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 230, 30));

        txt_Telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, 30));

        txt_Correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(txt_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 360, 30));

        txt_Direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 360, 30));

        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 90, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Archivo archivo = new Archivo();
        archivo.crearArchivo();

        // creo variables locales para enviar a la clase
        String nombre, apellido, telefono, correo, direccion;

        // obtengo la informacion de las cajas de texto
        nombre = txt_Nombre.getText();
        apellido = txt_Apellido.getText();
        telefono = txt_Telefono.getText();
        correo = txt_Correo.getText();
        direccion = txt_Direccion.getText();

        // intancio el objeto de la clase Persona para enviar los datos de las variables
        Persona persona = new Persona(nombre, apellido, telefono, correo, direccion);

        // uso el Metodo ESCRIBIR de la clase Persona para enviar el objeto con los datos
        archivo.escribirTexto(persona);

        // Limpiar cajas luego del ingreso
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
        txt_Correo.setText("");
        txt_Direccion.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_apellido;
    private javax.swing.JLabel Lbl_correo;
    private javax.swing.JLabel Lbl_correo1;
    private javax.swing.JLabel Lbl_nombre;
    private javax.swing.JLabel Lbl_telefono;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
