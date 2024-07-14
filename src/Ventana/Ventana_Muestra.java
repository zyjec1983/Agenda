package Ventana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana_Muestra extends javax.swing.JInternalFrame {
    
    DefaultTableModel tablaModelo = new DefaultTableModel();
    
    public Ventana_Muestra() {
        cargarModeloTabla();
        initComponents();
        this.setSize(650, 500);        
        
    }
    
    private void cargarModeloTabla() {
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Apellido");
        tablaModelo.addColumn("Telefono");
        tablaModelo.addColumn("Correo");
        tablaModelo.addColumn("Dirección");        
        
        leerTexto();
        
    }
    
    private void leerTexto() {
        String cadena;
        String fila[]; // se usará este arreglo pra ser llenado con los datos que estan en el archivo
        
        try {
            FileReader lector = new FileReader("AgendaContactos.txt");
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();            
            
            while(cadena != null){
                fila = cadena.split("%");
                tablaModelo.addRow(fila);
                cadena = lectura.readLine();
            }
            
        }   catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error, " + ex);
        }   catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Error, " + ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Contactos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 230, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setText("Contactos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        Tabla_Contactos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabla_Contactos.setModel(tablaModelo);
        jScrollPane2.setViewportView(Tabla_Contactos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 810, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Contactos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
