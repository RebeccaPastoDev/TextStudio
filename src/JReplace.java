package semtexteditor;

public class JReplace extends javax.swing.JPanel {

    private TextEditorMain main;
    
    public JReplace() {
        
        initComponents();
        
    }
    public JReplace(TextEditorMain m) {
        
        initComponents();
        this.main = m;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblReplace = new javax.swing.JLabel();
        txtReplace = new javax.swing.JTextField();
        lblWith = new javax.swing.JLabel();
        txtWith = new javax.swing.JTextField();
        btnDoReplace = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(320, 2066));
        setMinimumSize(new java.awt.Dimension(320, 466));
        setPreferredSize(new java.awt.Dimension(320, 466));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Replace Functions");

        lblReplace.setText("Replace:");

        lblWith.setText("With:");

        txtWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWithActionPerformed(evt);
            }
        });

        btnDoReplace.setText("Replace");
        btnDoReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoReplaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDoReplace))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWith, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReplace, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWith, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtReplace))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtReplace)
                    .addComponent(lblReplace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWith, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWith))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoReplace)
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="ActionPerformed Methods">
    private void txtWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWithActionPerformed
    }//GEN-LAST:event_txtWithActionPerformed
    private void btnDoReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoReplaceActionPerformed

        FilePane fPane = (FilePane)(main.getTabbedPane().getSelectedComponent());
        fPane.replace(txtReplace.getText(), txtWith.getText());
        main.closeSidebar();

    }//GEN-LAST:event_btnDoReplaceActionPerformed
    // </editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoReplace;
    private javax.swing.JLabel lblReplace;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWith;
    private javax.swing.JTextField txtReplace;
    private javax.swing.JTextField txtWith;
    // End of variables declaration//GEN-END:variables

}
