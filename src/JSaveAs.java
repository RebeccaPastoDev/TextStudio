package semtexteditor;

import java.awt.*;
import java.io.File;
import javax.swing.JFileChooser;

public class JSaveAs extends javax.swing.JPanel {

    Font customFont;
    private TextEditorMain main;
    
    public JSaveAs() {
        
        initComponents();
        
    }
    public JSaveAs(TextEditorMain m) {
        
        initComponents();
        this.main = m;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcSave = new javax.swing.JFileChooser();

        setMaximumSize(new java.awt.Dimension(420, 2066));
        setMinimumSize(new java.awt.Dimension(420, 466));
        setPreferredSize(new java.awt.Dimension(420, 466));

        jfcSave.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jfcSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfcSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfcSave, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfcSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jfcSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfcSaveActionPerformed

        if(evt.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
            
            main.closeSidebar();
           
        } else {

            File f = jfcSave.getCurrentDirectory();
            main.saveAsFile(jfcSave.getSelectedFile().getName(), f);
            
        }

    }//GEN-LAST:event_jfcSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfcSave;
    // End of variables declaration//GEN-END:variables

}
