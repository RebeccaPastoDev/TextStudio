package semtexteditor;

import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.*;

public class JSettings extends javax.swing.JPanel implements ItemListener, ChangeListener {

    Font customFont;
    private TextEditorMain main;
    private final int autosaveInterval = 60;
    
    public JSettings() {
        
        initComponents();
        
    }
    public JSettings(TextEditorMain m) {
        
        initComponents();
        this.main = m;
        FilePane fPane = (FilePane)main.getTabbedPane().getSelectedComponent();
        int fontSize = fPane.getTextArea().getFont().getSize();
        int sliderValue = (int)(fontSize / 12 * 100);
        sldZoom.setValue(sliderValue);
        cmbTheme.setSelectedIndex(main.getTheme());
        spinRed.setValue(main.getAccent().getRed());
        spinGreen.setValue(main.getAccent().getGreen());
        spinBlue.setValue(main.getAccent().getBlue());
        ColorCanvas.setBackground(main.getAccent());
        cmbTheme.addItemListener((ItemListener)this);
        sldZoom.addChangeListener(this);
        spinRed.addChangeListener(this);
        spinGreen.addChangeListener(this);
        spinBlue.addChangeListener(this);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAutosave = new javax.swing.JLabel();
        tglAutosave = new javax.swing.JToggleButton();
        sepSep1 = new javax.swing.JSeparator();
        lblZoom = new javax.swing.JLabel();
        sldZoom = new javax.swing.JSlider();
        sepSep2 = new javax.swing.JSeparator();
        lblTheme = new javax.swing.JLabel();
        cmbTheme = new javax.swing.JComboBox<>();
        lblColor = new javax.swing.JLabel();
        lblRed = new javax.swing.JLabel();
        spinRed = new javax.swing.JSpinner();
        lblGreen = new javax.swing.JLabel();
        spinGreen = new javax.swing.JSpinner();
        lblBlue = new javax.swing.JLabel();
        spinBlue = new javax.swing.JSpinner();
        ColorCanvas = new javax.swing.JPanel();
        lblTest = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(320, 2066));
        setMinimumSize(new java.awt.Dimension(320, 466));
        setPreferredSize(new java.awt.Dimension(320, 466));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Settings");

        lblAutosave.setText("Autosave (COMING SOON):");

        tglAutosave.setText("OFF");
        tglAutosave.setEnabled(false);
        tglAutosave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglAutosaveActionPerformed(evt);
            }
        });

        lblZoom.setText("Zoom (%):");

        sldZoom.setMajorTickSpacing(25);
        sldZoom.setMaximum(250);
        sldZoom.setMinimum(50);
        sldZoom.setPaintLabels(true);
        sldZoom.setPaintTicks(true);
        sldZoom.setSnapToTicks(true);

        lblTheme.setText("Theme:");

        cmbTheme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Dark" }));
        cmbTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbThemeActionPerformed(evt);
            }
        });

        lblColor.setText("Accent Color:");

        lblRed.setText("R:");

        spinRed.setMinimumSize(new java.awt.Dimension(56, 22));
        spinRed.setPreferredSize(new java.awt.Dimension(56, 22));

        lblGreen.setText("G:");

        spinGreen.setMinimumSize(new java.awt.Dimension(56, 22));
        spinGreen.setPreferredSize(new java.awt.Dimension(56, 22));

        lblBlue.setText("B:");

        spinBlue.setMinimumSize(new java.awt.Dimension(56, 22));
        spinBlue.setPreferredSize(new java.awt.Dimension(56, 22));

        ColorCanvas.setBackground(new java.awt.Color(255, 255, 255));
        ColorCanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        lblTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTest.setText("The quick brown fox jumps over the lazy dog.");

        javax.swing.GroupLayout ColorCanvasLayout = new javax.swing.GroupLayout(ColorCanvas);
        ColorCanvas.setLayout(ColorCanvasLayout);
        ColorCanvasLayout.setHorizontalGroup(
            ColorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ColorCanvasLayout.setVerticalGroup(
            ColorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTest, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepSep2)
                    .addComponent(sepSep1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTheme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ColorCanvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAutosave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglAutosave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblZoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sldZoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblRed, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglAutosave)
                    .addComponent(lblAutosave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepSep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZoom)
                    .addComponent(sldZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepSep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTheme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRed, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void tglAutosaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglAutosaveActionPerformed

        if(tglAutosave.isSelected() == true) {
           
            tglAutosave.setText("ON");

            
        } else {
            
            tglAutosave.setText("OFF");
            
        }

    }//GEN-LAST:event_tglAutosaveActionPerformed
    private void cmbThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbThemeActionPerformed
    }//GEN-LAST:event_cmbThemeActionPerformed
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        main.closeSidebar();

    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ColorCanvas;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cmbTheme;
    private javax.swing.JLabel lblAutosave;
    private javax.swing.JLabel lblBlue;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblGreen;
    private javax.swing.JLabel lblRed;
    private javax.swing.JLabel lblTest;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZoom;
    private javax.swing.JSeparator sepSep1;
    private javax.swing.JSeparator sepSep2;
    private javax.swing.JSlider sldZoom;
    private javax.swing.JSpinner spinBlue;
    private javax.swing.JSpinner spinGreen;
    private javax.swing.JSpinner spinRed;
    private javax.swing.JToggleButton tglAutosave;
    // End of variables declaration//GEN-END:variables

    public JSlider getSlider() {
        
        return sldZoom;
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {

        if(e.getSource() == sldZoom) {
            
            int zoom = sldZoom.getValue();
            main.setZoomLevel(zoom);
            
        } else {
            
            int r = (int)spinRed.getValue();
            int g = (int)spinGreen.getValue();
            int b = (int)spinBlue.getValue();     
            if (r > 255) {

                r = 255;
                spinRed.setValue(r);

            }
            if (g > 255) {

                g = 255;
                spinGreen.setValue(g);

            }
            if (b > 255) { 

                b = 255;
                spinBlue.setValue(b);

            }
            if (r < 0) {

                r = 0;
                spinRed.setValue(r);

            }
            if (g < 0) {

                g = 0;
                spinGreen.setValue(g);

            }
            if (b < 0) {

                b = 0;
                spinBlue.setValue(b);

            }
            Color color = new Color(r,g,b);
            ColorCanvas.setBackground(color);
            if(((color.getRed() * .299) + (color.getGreen() * .587) + (color.getBlue() * .114)) > 128) {
                
                lblTest.setForeground(Color.BLACK);
                
            } else {
                
                lblTest.setForeground(Color.WHITE);
                
            }
            main.statusBarColor(color);

        }
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {

        if(cmbTheme.getSelectedIndex() == 0) {
            
            main.setTheme(this, this.main, 0);
            
        }
        else {
            
            main.setTheme(this, this.main, 1);
            
        }
        
    }
    
}
