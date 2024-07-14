
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;

public class Main_Ventana extends javax.swing.JFrame {
    
    

    public Main_Ventana() {
        initComponents();
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        mostrarFechaHora();
    }
    
     private void mostrarFechaHora(){
        EtiquetaHora.setText(time);
        EtiquetaFecha.setText(day);
        ActualizarHora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Aside = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        Panel_header = new javax.swing.JPanel();
        EtiquetaTitulo = new javax.swing.JLabel();
        EtiquetaHora = new javax.swing.JLabel();
        EtiquetaFecha = new javax.swing.JLabel();
        // establezco imagen a objeto icono
        ImageIcon icono = new ImageIcon(getClass().getResource("/Images/fondoAgenda.jpg"));
        Image imagen = icono.getImage();
        Panel_desktop = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Aside.setBackground(new java.awt.Color(247, 248, 243));
        Panel_Aside.setPreferredSize(new java.awt.Dimension(200, 550));

        btn_Agregar.setBackground(new java.awt.Color(245, 255, 250));
        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        btn_Agregar.setText("Crear");
        btn_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AgregarMouseExited(evt);
            }
        });
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Buscar.setBackground(new java.awt.Color(245, 255, 250));
        btn_Buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar.png"))); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BuscarMouseExited(evt);
            }
        });
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Editar.setBackground(new java.awt.Color(245, 255, 250));
        btn_Editar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editar.png"))); // NOI18N
        btn_Editar.setText("Editar");
        btn_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditarMouseExited(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(245, 255, 250));
        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_AsideLayout = new javax.swing.GroupLayout(Panel_Aside);
        Panel_Aside.setLayout(Panel_AsideLayout);
        Panel_AsideLayout.setHorizontalGroup(
            Panel_AsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AsideLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_AsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel_AsideLayout.setVerticalGroup(
            Panel_AsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AsideLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Aside, java.awt.BorderLayout.LINE_START);

        Panel_header.setBackground(new java.awt.Color(247, 236, 234));
        Panel_header.setPreferredSize(new java.awt.Dimension(900, 50));
        Panel_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtiquetaTitulo.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        EtiquetaTitulo.setText("Agenda de contactos");
        Panel_header.add(EtiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 6, -1, -1));

        EtiquetaHora.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        EtiquetaHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaHora.setText("Hora");
        EtiquetaHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EtiquetaHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EtiquetaHoraMouseExited(evt);
            }
        });
        Panel_header.add(EtiquetaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 270, -1));

        EtiquetaFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EtiquetaFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaFecha.setText("Fecha");
        EtiquetaFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EtiquetaFechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EtiquetaFechaMouseExited(evt);
            }
        });
        Panel_header.add(EtiquetaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 400, -1));

        getContentPane().add(Panel_header, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout Panel_desktopLayout = new javax.swing.GroupLayout(Panel_desktop);
        Panel_desktop.setLayout(Panel_desktopLayout);
        Panel_desktopLayout.setHorizontalGroup(
            Panel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        Panel_desktopLayout.setVerticalGroup(
            Panel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(Panel_desktop, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseEntered
        btn_Agregar.setBackground(Color.CYAN);
        btn_Agregar.setForeground(Color.black);
        btn_Agregar.setFont(new Font("ARIAL",Font.BOLD, 18));
    }//GEN-LAST:event_btn_AgregarMouseEntered

    private void btn_AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarMouseExited
        btn_Agregar.setBackground(Color.WHITE);
        btn_Agregar.setForeground(Color.black);
        btn_Agregar.setFont(new Font("SEGOE UI",Font.PLAIN, 18));
    }//GEN-LAST:event_btn_AgregarMouseExited

    private void btn_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseEntered
        btn_Buscar.setBackground(Color.CYAN);
        btn_Buscar.setForeground(Color.black);
        btn_Buscar.setFont(new Font("ARIAL",Font.BOLD, 18));
    }//GEN-LAST:event_btn_BuscarMouseEntered

    private void btn_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarMouseExited
        btn_Buscar.setBackground(Color.WHITE);
        btn_Buscar.setForeground(Color.black);
        btn_Buscar.setFont(new Font("SEGOE UI",Font.PLAIN, 18));
    }//GEN-LAST:event_btn_BuscarMouseExited

    private void btn_EditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarMouseEntered
        btn_Editar.setBackground(Color.CYAN);
        btn_Editar.setForeground(Color.black);
        btn_Editar.setFont(new Font("ARIAL",Font.BOLD, 18));
    }//GEN-LAST:event_btn_EditarMouseEntered

    private void btn_EditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditarMouseExited
        btn_Editar.setBackground(Color.WHITE);
        btn_Editar.setForeground(Color.black);
        btn_Editar.setFont(new Font("SEGOE UI",Font.PLAIN, 18));
    }//GEN-LAST:event_btn_EditarMouseExited

    private void btn_EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseEntered
        btn_Eliminar.setBackground(Color.CYAN);
        btn_Eliminar.setForeground(Color.black);
        btn_Eliminar.setFont(new Font("ARIAL",Font.BOLD, 18));
    }//GEN-LAST:event_btn_EliminarMouseEntered

    private void btn_EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseExited
        btn_Eliminar.setBackground(Color.WHITE);
        btn_Eliminar.setForeground(Color.black);
        btn_Eliminar.setFont(new Font("SEGOE UI",Font.PLAIN, 18));
    }//GEN-LAST:event_btn_EliminarMouseExited

    private void EtiquetaHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaHoraMouseEntered
        EtiquetaHora.setForeground(Color.BLUE);
        EtiquetaHora.setFont(new Font("ARIAL BLACK",Font.BOLD,30));
        EtiquetaFecha.setVisible(false);
    }//GEN-LAST:event_EtiquetaHoraMouseEntered

    private void EtiquetaHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaHoraMouseExited
        EtiquetaHora.setForeground(Color.black);
        EtiquetaHora.setFont(new Font("ARIAL BLACK",Font.BOLD,20));
        EtiquetaFecha.setVisible(true);
    }//GEN-LAST:event_EtiquetaHoraMouseExited

    private void EtiquetaFechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaFechaMouseEntered
        EtiquetaFecha.setForeground(Color.BLUE);
        EtiquetaFecha.setFont(new Font("ARIAL",Font.BOLD,13));        
    }//GEN-LAST:event_EtiquetaFechaMouseEntered

    private void EtiquetaFechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtiquetaFechaMouseExited
        EtiquetaFecha.setForeground(Color.black);
        EtiquetaFecha.setFont(new Font("ARIAL",Font.BOLD,12));   
    }//GEN-LAST:event_EtiquetaFechaMouseExited

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        Ventana_Ingreso crear = new Ventana_Ingreso();
        crear.setResizable(true);
        Panel_desktop.add(crear);
        crear.setVisible(true);
        crear.setResizable(true);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        Ventana_Muestra contactos = new Ventana_Muestra();
        Panel_desktop.add(contactos);
        contactos.setVisible(true);
    }//GEN-LAST:event_btn_BuscarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Main_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaFecha;
    private javax.swing.JLabel EtiquetaHora;
    private javax.swing.JLabel EtiquetaTitulo;
    private javax.swing.JPanel Panel_Aside;
    private javax.swing.JDesktopPane Panel_desktop;
    private javax.swing.JPanel Panel_header;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    // End of variables declaration//GEN-END:variables


    
    // formatear fecha en DIA, MES, NUMERO DIA, ANIO y hora en HORA, MINUTO, SEGUNDO
    SimpleDateFormat timeFormat = new SimpleDateFormat("kk:mm:ss ");
    SimpleDateFormat dayFormat = new SimpleDateFormat("EEE, MMM dd, yyyy");    
    
// se agrega la fecha y hora a las etiquetas
    String time = timeFormat.format(Calendar.getInstance().getTime());
    String day = dayFormat.format(Calendar.getInstance().getTime()); 
    
    
    // ******************** RECURSION PARA QUE SE ACTUALICE EL TIEMPO ********************
    private void ActualizarHora() {
        Thread hora = new Thread(new Runnable() {
            
            @Override
            public void run() {
                while (true) {
                    time = timeFormat.format(Calendar.getInstance().getTime());
                    EtiquetaHora.setText(time);

                    day = dayFormat.format(Calendar.getInstance().getTime());
                    EtiquetaFecha.setText(day);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                       //Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        // inicio el ciclo sin fin de la hora
        hora.start();

    }// ACTUALIZAR HORA ENDS

// ******************** RECURSION ENDS ********************
    
    
}

