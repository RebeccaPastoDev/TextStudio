package semtexteditor;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class FilePane extends javax.swing.JPanel implements UndoableEditListener, DocumentListener {

    Font customFont;
    private TextEditorMain main;
    private File curFile;
    private String fileName;
    private boolean dirty;
    private UndoManager undoManager = new UndoManager();
    String findString;
    
    public FilePane(TextEditorMain m) {
        
        initComponents();
        txtCustom.getDocument().addUndoableEditListener(this);
        txtCustom.getDocument().addDocumentListener(this);
        this.main = m;
        this.curFile = null;
        this.fileName = null;
        this.dirty = true;
        
    }
    public FilePane(TextEditorMain m, File f, String s1, String s2) {
        
        initComponents();
        txtCustom.getDocument().addUndoableEditListener(this);
        txtCustom.getDocument().addDocumentListener(this);
        this.main = m;
        this.curFile = f;
        this.fileName = s1;
        this.dirty = false;
        this.txtCustom.setText(s2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspCustom = new javax.swing.JScrollPane();
        txtCustom = new javax.swing.JTextArea();

        txtCustom.setColumns(20);
        txtCustom.setRows(5);
        jspCustom.setViewportView(txtCustom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspCustom, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspCustom, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jspCustom;
    private javax.swing.JTextArea txtCustom;
    // End of variables declaration//GEN-END:variables
    public File getCurFile() {
        
        return this.curFile;
        
    }
    public void setCurFile(File f) {
        
        this.curFile = f;
        
    }
    public String getFileName() {
        
        return this.fileName;
        
    }
    public void setFileName(String s) {
        
        this.fileName = s;
        
    }
    public boolean getDirty() {
        
        return this.dirty;
        
    }
    public void setDirty(boolean b) {
        
        this.dirty = b;
        
    }
    public JTextArea getTextArea() {
        
        return this.txtCustom;
        
    }
    public void applyTheme(ColorTheme theme) {
        // Apply theme colors to JScrollPane and JTextPane
        jspCustom.setBackground(theme.getBackground()); // Scroll pane background
        txtCustom.setBackground(theme.getForeground()); // Text pane background
        txtCustom.setForeground(theme.getTextColor());  // Text pane text color

        // Optional: Adjust the caret color and selection color in JTextPane
        txtCustom.setCaretColor(theme.getTextColor());
        txtCustom.setSelectionColor(theme.getTextColor().darker()); // Darker selection color
        
    }

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {

        undoManager.addEdit(e.getEdit());
        
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

        this.setDirty(true);
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {

        this.setDirty(true);
        
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }
    public void undo() {
        
        if(undoManager.canUndo()) {
            
            try {
                
                undoManager.undo();
                
            } catch(Exception e) {
                
                JOptionPane.showMessageDialog(this, "An error occurred.  Can't Undo.\n" + e.getLocalizedMessage());
                
            }
            
        }
        
    }
    public void redo() {
        
        if(undoManager.canRedo()) {
            
            try {
                
                undoManager.redo();
                
            } catch(Exception e) {
                
                JOptionPane.showMessageDialog(this, "An error occurred.  Can't Undo.\n" + e.getLocalizedMessage());
                
            }
            
        }
        
    }
    public void deleteSelected() {
        
        StringBuilder sb = new StringBuilder(txtCustom.getText());
        sb.delete(txtCustom.getSelectionStart(), txtCustom.getSelectionEnd());
        txtCustom.setText(sb.toString());
        
    }
    //Four find methods
    public void findIncoming(FilePane fPane, int i, String s) {
    
        switch (i) {
            
            case 1:
                fPane.findNext(s);
                break;
            case 2:
                fPane.findPrevious(s);
                break;
            default:
                fPane.findAll(s);
                break;
                
        }
        
    }
    public void findNext(String s) {
        
        String text = this.txtCustom.getText();
        int curPos = this.txtCustom.getCaretPosition();
        int findPos = text.indexOf(s, curPos);
        
        if(findPos != -1) {
            
            try {
                
                this.txtCustom.grabFocus();
                this.txtCustom.select((curPos + findPos),(curPos + findPos + s.length()));
                this.txtCustom.setCaretPosition(curPos + findPos + s.length());
                
            } catch(Exception e) {
                
                JOptionPane.showMessageDialog(this, e.getStackTrace());
                
            }
            
        } else {
            
            java.awt.Toolkit.getDefaultToolkit().beep();
            main.setErrorMessage( "\"" + s + "\"" + " not found.");
            
        }
        
    }
    public void findPrevious(String s) {
        
        String text = this.txtCustom.getText();
        int curPos = this.txtCustom.getCaretPosition();
        
        String subText = text.substring(0, curPos);
        int findPos = subText.lastIndexOf(s);
        
        if(findPos != -1) {

            try {
                
                this.txtCustom.grabFocus();
                this.txtCustom.select(findPos, findPos + s.length());
                this.txtCustom.setCaretPosition(findPos);
                
            } catch(Exception e) {
                
                JOptionPane.showMessageDialog(this, e.getStackTrace());
                
            }
            
        } else {
            
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "\"" + s + "\"" + " not found.");
            
        }
        
    }
    public void findAll(String s) {
        
        int startIndex = 0;
        String searchString = this.txtCustom.getText();
        this.txtCustom.grabFocus();
        
        while(searchString.contains(s)) {
            
            this.txtCustom.select(startIndex + searchString.indexOf(s), (startIndex + searchString.indexOf(s) + s.length()));
            startIndex = (startIndex + searchString.indexOf(s) + s.length());
            searchString = searchString.substring(startIndex);
                    
        }
        
    }
    public void replace(String s1, String s2) {
        
        String newString = this.txtCustom.getText().replaceAll(s1, s2);
        this.txtCustom.setText(newString);
        
    }
    public void goTo(int i) {
        
        int charLocation = 0;
        String text = this.txtCustom.getText();
        ArrayList<String> lineArray = new ArrayList<>();
        
        Stream<String> lines = text.lines();
        Object[] objectArray = lines.toArray();
        for(Object o : objectArray) {
            
            lineArray.add((String)o);
            
        }
        for(String s : lineArray) {
            
            if(lineArray.indexOf(s) == i) {
                
                break;
                
            }
            charLocation = charLocation + s.length();
            
        }
        this.txtCustom.grabFocus();
        this.txtCustom.setCaretPosition(charLocation);
        
    }
    
}
