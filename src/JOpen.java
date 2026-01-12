package semtexteditor;

import java.io.File;
import java.awt.*;
import javax.swing.JFileChooser;

public class JOpen extends javax.swing.JPanel {

    Font customFont;
    private TextEditorMain main;
    
    public JOpen() {
        
        initComponents();

    }
    public JOpen(TextEditorMain m) {
        
        initComponents();
        this.main = m;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcOpen = new javax.swing.JFileChooser();

        setMaximumSize(new java.awt.Dimension(420, 2066));
        setMinimumSize(new java.awt.Dimension(420, 466));
        setPreferredSize(new java.awt.Dimension(420, 466));

        jfcOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfcOpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfcOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfcOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jfcOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfcOpenActionPerformed

        if(evt.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
            
            main.closeSidebar();
           
        } else if(evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION) && jfcOpen.getSelectedFile() == null) {
            
            return;
            
        }
        else {
            
            File f = jfcOpen.getSelectedFile();
            main.openFile(f);
            
        }
        
    }//GEN-LAST:event_jfcOpenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfcOpen;
    // End of variables declaration//GEN-END:variables

}
