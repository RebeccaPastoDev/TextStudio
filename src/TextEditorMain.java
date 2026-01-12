
package semtexteditor;

import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.text.Document;
import com.formdev.flatlaf.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextEditorMain extends javax.swing.JFrame {
    
    Font customFont;
    private final FilePane file;
    private final WordCount wordCount; // Declare WordCount instance
    private final LineCount lineCount; // Declare LineCount instance
    private final ColumnCount columnCount; // Declare ColumnCount instance
    private int theme;
    private int zoomLevel = 100;
    private boolean autosaveToggle;
    private Color accent;
    
    public TextEditorMain() {
        
        try {

            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            
            Logger.getLogger(TextEditorMain.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        SwingUtilities.updateComponentTreeUI(this);
        initComponents();
        file = new FilePane(this);
        this.accent = mnbBar.getBackground();
        jtpEditor.addTab("Tab 1", file);
        splSplit.setRightComponent(null);
        wordCount = new WordCount(jtpEditor, lblWordNum);
        lineCount = new LineCount(jtpEditor, lblLineCount);
        columnCount = new ColumnCount(jtpEditor, lblColumnCount);
        this.theme = 0;
        this.autosaveToggle = false;
        
        //ToolTip to add comments to buttons for users
        btnOpen.setToolTipText("Open");
        btnSaveAs.setToolTipText("Save As");
        btnSave.setToolTipText("Save");
        btnSaveAll.setToolTipText("Save All");
        btnCopy.setToolTipText("Copy");
        btnCut.setToolTipText("Cut");
        btnPaste.setToolTipText("Paste");
        btnUndo.setToolTipText("Undo");
        btnRedo.setToolTipText("Redo");
        btnUndo.setToolTipText("Undo");
        btnFind.setToolTipText("Find");
        btnReplace.setToolTipText("Replace");
        btnUndo.setToolTipText("Undo");
        btnChar.setToolTipText("Insert Special Characters");
        btnPrint.setToolTipText("Print");
        btnClose.setToolTipText("Close");
        btnSettings.setToolTipText("Settings");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbTop = new javax.swing.JToolBar();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSaveAs = new javax.swing.JButton();
        btnSaveAll = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnCut = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        btnRedo = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnReplace = new javax.swing.JButton();
        btnChar = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        splSplit = new javax.swing.JSplitPane();
        jtpEditor = new javax.swing.JTabbedPane();
        jtbBottom = new javax.swing.JToolBar();
        lblLineLabel = new javax.swing.JLabel();
        lblLineCount = new javax.swing.JLabel();
        sepSep1 = new javax.swing.JToolBar.Separator();
        lblColumnLabel = new javax.swing.JLabel();
        lblColumnCount = new javax.swing.JLabel();
        sepSep3 = new javax.swing.JToolBar.Separator();
        lblWords = new javax.swing.JLabel();
        lblWordNum = new javax.swing.JLabel();
        sepSep2 = new javax.swing.JToolBar.Separator();
        lblZoom = new javax.swing.JLabel();
        sepSep4 = new javax.swing.JToolBar.Separator();
        lblError = new javax.swing.JLabel();
        mnbBar = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        itmNewTab = new javax.swing.JMenuItem();
        itmNewWindow = new javax.swing.JMenuItem();
        itmOpen = new javax.swing.JMenuItem();
        itmSave = new javax.swing.JMenuItem();
        itmSaveAs = new javax.swing.JMenuItem();
        itmPrint = new javax.swing.JMenuItem();
        itmCloseTab = new javax.swing.JMenuItem();
        itmCloseWindow = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        menEdit = new javax.swing.JMenu();
        itmCut = new javax.swing.JMenuItem();
        itmCopy = new javax.swing.JMenuItem();
        itmPaste = new javax.swing.JMenuItem();
        itmUndo = new javax.swing.JMenuItem();
        itmRedo = new javax.swing.JMenuItem();
        itmSelectAll = new javax.swing.JMenuItem();
        itmDelete = new javax.swing.JMenuItem();
        itmFind = new javax.swing.JMenuItem();
        itmReplace = new javax.swing.JMenuItem();
        itmGoTo = new javax.swing.JMenuItem();
        itmDateTime = new javax.swing.JMenuItem();
        itmSpec = new javax.swing.JMenuItem();
        menView = new javax.swing.JMenu();
        itmZoom = new javax.swing.JMenuItem();
        itmStatusBar = new javax.swing.JCheckBoxMenuItem();
        itmWrap = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TextStudio 1.0");
        setMinimumSize(new java.awt.Dimension(960, 540));

        jtbTop.setRollover(true);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Open_Light.png"))); // NOI18N
        btnOpen.setAlignmentY(0.0F);
        btnOpen.setFocusPainted(false);
        btnOpen.setFocusable(false);
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        jtbTop.add(btnOpen);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_Light.png"))); // NOI18N
        btnSave.setAlignmentY(0.0F);
        btnSave.setFocusPainted(false);
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jtbTop.add(btnSave);

        btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_As_Light.png"))); // NOI18N
        btnSaveAs.setAlignmentY(0.0F);
        btnSaveAs.setFocusPainted(false);
        btnSaveAs.setFocusable(false);
        btnSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveAs.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        jtbTop.add(btnSaveAs);

        btnSaveAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_All_Light.png"))); // NOI18N
        btnSaveAll.setAlignmentY(0.0F);
        btnSaveAll.setFocusPainted(false);
        btnSaveAll.setFocusable(false);
        btnSaveAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveAll.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSaveAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAllActionPerformed(evt);
            }
        });
        jtbTop.add(btnSaveAll);

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Copy_Light.png"))); // NOI18N
        btnCopy.setAlignmentY(0.0F);
        btnCopy.setFocusPainted(false);
        btnCopy.setFocusable(false);
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jtbTop.add(btnCopy);

        btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Cut_Light.png"))); // NOI18N
        btnCut.setAlignmentY(0.0F);
        btnCut.setFocusPainted(false);
        btnCut.setFocusable(false);
        btnCut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCut.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutActionPerformed(evt);
            }
        });
        jtbTop.add(btnCut);

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Paste_Light.png"))); // NOI18N
        btnPaste.setAlignmentY(0.0F);
        btnPaste.setFocusPainted(false);
        btnPaste.setFocusable(false);
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        jtbTop.add(btnPaste);

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Undo_Light.png"))); // NOI18N
        btnUndo.setAlignmentY(0.0F);
        btnUndo.setFocusPainted(false);
        btnUndo.setFocusable(false);
        btnUndo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUndo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnUndo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });
        jtbTop.add(btnUndo);

        btnRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Redo_Light.png"))); // NOI18N
        btnRedo.setAlignmentY(0.0F);
        btnRedo.setFocusPainted(false);
        btnRedo.setFocusable(false);
        btnRedo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRedo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRedo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedoActionPerformed(evt);
            }
        });
        jtbTop.add(btnRedo);

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Find_Light.png"))); // NOI18N
        btnFind.setAlignmentY(0.0F);
        btnFind.setFocusPainted(false);
        btnFind.setFocusable(false);
        btnFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFind.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnFind.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jtbTop.add(btnFind);

        btnReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Replace_Light.png"))); // NOI18N
        btnReplace.setAlignmentY(0.0F);
        btnReplace.setFocusPainted(false);
        btnReplace.setFocusable(false);
        btnReplace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReplace.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnReplace.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });
        jtbTop.add(btnReplace);

        btnChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Insert_Char_Light.png"))); // NOI18N
        btnChar.setAlignmentY(0.0F);
        btnChar.setFocusPainted(false);
        btnChar.setFocusable(false);
        btnChar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnChar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharActionPerformed(evt);
            }
        });
        jtbTop.add(btnChar);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Print_Light.png"))); // NOI18N
        btnPrint.setAlignmentY(0.0F);
        btnPrint.setFocusPainted(false);
        btnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrint.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jtbTop.add(btnPrint);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Close_Light.png"))); // NOI18N
        btnClose.setAlignmentY(0.0F);
        btnClose.setFocusPainted(false);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jtbTop.add(btnClose);

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Settings_Light.png"))); // NOI18N
        btnSettings.setAlignmentY(0.0F);
        btnSettings.setFocusPainted(false);
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSettings.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jtbTop.add(btnSettings);

        splSplit.setDividerSize(0);
        splSplit.setResizeWeight(1.0);
        splSplit.setMaximumSize(new java.awt.Dimension(3840, 2066));
        splSplit.setMinimumSize(new java.awt.Dimension(960, 446));
        splSplit.setPreferredSize(new java.awt.Dimension(960, 446));

        jtpEditor.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtpEditor.setMaximumSize(new java.awt.Dimension(3840, 3840));
        jtpEditor.setMinimumSize(new java.awt.Dimension(640, 446));
        jtpEditor.setPreferredSize(new java.awt.Dimension(960, 446));
        splSplit.setLeftComponent(jtpEditor);

        jtbBottom.setBackground(new java.awt.Color(255, 255, 255));
        jtbBottom.setRollover(true);
        jtbBottom.setPreferredSize(new java.awt.Dimension(192, 28));

        lblLineLabel.setText("Line: ");
        jtbBottom.add(lblLineLabel);

        lblLineCount.setText("1");
        jtbBottom.add(lblLineCount);

        sepSep1.setBackground(new java.awt.Color(0, 0, 0));
        jtbBottom.add(sepSep1);

        lblColumnLabel.setText("Column: ");
        jtbBottom.add(lblColumnLabel);

        lblColumnCount.setText("1");
        jtbBottom.add(lblColumnCount);

        sepSep3.setBackground(new java.awt.Color(0, 0, 0));
        jtbBottom.add(sepSep3);

        lblWords.setText("Word Count: ");
        jtbBottom.add(lblWords);

        lblWordNum.setText("0");
        jtbBottom.add(lblWordNum);

        sepSep2.setBackground(new java.awt.Color(0, 0, 0));
        jtbBottom.add(sepSep2);

        lblZoom.setText("Zoom: %");
        jtbBottom.add(lblZoom);
        jtbBottom.add(sepSep4);

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(214, 0, 0));
        jtbBottom.add(lblError);

        mnbBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        mnbBar.setBorderPainted(false);
        mnbBar.setFocusable(false);
        mnbBar.setMaximumSize(new java.awt.Dimension(32767, 32767));
        mnbBar.setMinimumSize(new java.awt.Dimension(120, 28));
        mnbBar.setPreferredSize(new java.awt.Dimension(120, 28));

        menFile.setText("File");

        itmNewTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmNewTab.setText("New Tab");
        itmNewTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNewTabActionPerformed(evt);
            }
        });
        menFile.add(itmNewTab);

        itmNewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmNewWindow.setText("New Window");
        itmNewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNewWindowActionPerformed(evt);
            }
        });
        menFile.add(itmNewWindow);

        itmOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmOpen.setText("Open");
        itmOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmOpenActionPerformed(evt);
            }
        });
        menFile.add(itmOpen);

        itmSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSave.setText("Save");
        itmSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSaveActionPerformed(evt);
            }
        });
        menFile.add(itmSave);

        itmSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSaveAs.setText("Save as");
        itmSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSaveAsActionPerformed(evt);
            }
        });
        menFile.add(itmSaveAs);

        itmPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmPrint.setText("Print");
        itmPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPrintActionPerformed(evt);
            }
        });
        menFile.add(itmPrint);

        itmCloseTab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCloseTab.setText("Close Tab");
        itmCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCloseTabActionPerformed(evt);
            }
        });
        menFile.add(itmCloseTab);

        itmCloseWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCloseWindow.setText("Close Window");
        itmCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCloseWindowActionPerformed(evt);
            }
        });
        menFile.add(itmCloseWindow);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        menFile.add(itmExit);

        mnbBar.add(menFile);

        menEdit.setText("Edit");
        menEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menEditActionPerformed(evt);
            }
        });

        itmCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCut.setText("Cut");
        itmCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCutActionPerformed(evt);
            }
        });
        menEdit.add(itmCut);

        itmCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCopy.setText("Copy");
        itmCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCopyActionPerformed(evt);
            }
        });
        menEdit.add(itmCopy);

        itmPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmPaste.setText("Paste");
        itmPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPasteActionPerformed(evt);
            }
        });
        menEdit.add(itmPaste);

        itmUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmUndo.setText("Undo");
        itmUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUndoActionPerformed(evt);
            }
        });
        menEdit.add(itmUndo);

        itmRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRedo.setText("Redo");
        itmRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRedoActionPerformed(evt);
            }
        });
        menEdit.add(itmRedo);

        itmSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSelectAll.setText("Select all");
        itmSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSelectAllActionPerformed(evt);
            }
        });
        menEdit.add(itmSelectAll);

        itmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itmDelete.setText("Delete");
        itmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeleteActionPerformed(evt);
            }
        });
        menEdit.add(itmDelete);

        itmFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmFind.setText("Find");
        itmFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmFindActionPerformed(evt);
            }
        });
        menEdit.add(itmFind);

        itmReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmReplace.setText("Replace");
        itmReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReplaceActionPerformed(evt);
            }
        });
        menEdit.add(itmReplace);

        itmGoTo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmGoTo.setText("Go To...");
        itmGoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGoToActionPerformed(evt);
            }
        });
        menEdit.add(itmGoTo);

        itmDateTime.setText("Time/Date");
        itmDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDateTimeActionPerformed(evt);
            }
        });
        menEdit.add(itmDateTime);

        itmSpec.setText("Special Characters...");
        itmSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSpecActionPerformed(evt);
            }
        });
        menEdit.add(itmSpec);

        mnbBar.add(menEdit);

        menView.setText("View");

        itmZoom.setText("Zoom");
        itmZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmZoomActionPerformed(evt);
            }
        });
        menView.add(itmZoom);

        itmStatusBar.setSelected(true);
        itmStatusBar.setText("Status Bar");
        itmStatusBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmStatusBarActionPerformed(evt);
            }
        });
        menView.add(itmStatusBar);

        itmWrap.setText("Word Wrap");
        itmWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmWrapActionPerformed(evt);
            }
        });
        menView.add(itmWrap);

        mnbBar.add(menView);

        setJMenuBar(mnbBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtbBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(splSplit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(splSplit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jtbBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="ActionPeformed Methods">
    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        
        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().copy();

    }//GEN-LAST:event_btnCopyActionPerformed
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        splSplit.setRightComponent(new JFind(this));
        
    }//GEN-LAST:event_btnFindActionPerformed
    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed

        splSplit.setRightComponent(new JReplace(this));
        
    }//GEN-LAST:event_btnReplaceActionPerformed
    private void itmNewTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNewTabActionPerformed
    FilePane newFilePane = new FilePane(this);

    int newFontSize = (int) ((zoomLevel / 100.0) * 12);  
    Font currentFont = newFilePane.getTextArea().getFont();
    newFilePane.getTextArea().setFont(currentFont.deriveFont((float) newFontSize));

    jtpEditor.addTab("Tab " + (jtpEditor.getTabCount() + 1), newFilePane);

    // Initialize the counters for word, line, and column count
    WordCount wordCount = new WordCount(jtpEditor, lblWordNum);
    LineCount lineCount = new LineCount(jtpEditor, lblLineCount);
    ColumnCount columnCount = new ColumnCount(jtpEditor, lblColumnCount);
        
    }//GEN-LAST:event_itmNewTabActionPerformed
    private void itmOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmOpenActionPerformed
        
        splSplit.setRightComponent(new JOpen(this));
        
    }//GEN-LAST:event_itmOpenActionPerformed
    private void itmSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSaveActionPerformed

        FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
        if((fPane.getCurFile() == null)) {
            
            splSplit.setRightComponent(new JSaveAs(this));
            
        } else {
            
            saveFile(fPane, fPane.getCurFile());
            
        }
        
    }//GEN-LAST:event_itmSaveActionPerformed
    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
  
        splSplit.setRightComponent(new JExit(this));
        
    }//GEN-LAST:event_itmExitActionPerformed
    private void itmPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPasteActionPerformed
        
        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().paste();
        
    }//GEN-LAST:event_itmPasteActionPerformed
    private void itmRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRedoActionPerformed
        
        FilePane f = (FilePane)jtpEditor.getSelectedComponent();
        f.redo();
        
    }//GEN-LAST:event_itmRedoActionPerformed
    private void itmUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUndoActionPerformed

        FilePane f = (FilePane)jtpEditor.getSelectedComponent();
        f.undo();
        
    }//GEN-LAST:event_itmUndoActionPerformed
    private void itmReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReplaceActionPerformed

        splSplit.setRightComponent(new JReplace(this));
        
    }//GEN-LAST:event_itmReplaceActionPerformed
    private void itmGoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmGoToActionPerformed

        splSplit.setRightComponent(new JGoTo(this));
        
    }//GEN-LAST:event_itmGoToActionPerformed
    private void itmDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDateTimeActionPerformed

        String currentDateTime = CurrentTimeDate.getCurrentDateTime();
        StringBuilder message = new StringBuilder();
        message.append(currentDateTime);
        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().setText(((FilePane)jtpEditor.getSelectedComponent()).getTextArea().getText() + message.toString());
        
    }//GEN-LAST:event_itmDateTimeActionPerformed
    private void itmNewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNewWindowActionPerformed
        
        new TextEditorMain().setVisible(true);
        
    }//GEN-LAST:event_itmNewWindowActionPerformed
    private void itmSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSaveAsActionPerformed

        splSplit.setRightComponent(new JSaveAs(this));
        
    }//GEN-LAST:event_itmSaveAsActionPerformed
    private void itmPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPrintActionPerformed

        FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
        this.saveFile(fPane, fPane.getCurFile());
        int caretLoc = fPane.getTextArea().getCaretPosition();
        java.awt.print.PrinterJob pj = java.awt.print.PrinterJob.getPrinterJob();
        java.awt.print.PageFormat pf = pj.pageDialog(pj.defaultPage());
        fPane.getTextArea().setCaretPosition(0);
        JComponentVista vista = new JComponentVista(fPane.getTextArea(), pf);
        pj.setPageable(vista);
        try {
            
            pj.print();
            
        } catch(PrinterException pe) {
            
            lblError.setText("Error Printing File" + pe.getLocalizedMessage());
                
        } finally {
            
            fPane.getTextArea().setCaretPosition(caretLoc);
            
        }
        
    }//GEN-LAST:event_itmPrintActionPerformed
    private void itmCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCloseTabActionPerformed
                                   
        int count = jtpEditor.getTabCount();
        if (count > 1) {
           jtpEditor.remove(jtpEditor.getSelectedIndex()); 
        } else if (count == 1) {
            
                int selectedIndex = jtpEditor.getSelectedIndex();
                if(selectedIndex != -1){
                    this.dispose();
                }
        }
        
    }//GEN-LAST:event_itmCloseTabActionPerformed
    private void itmCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCloseWindowActionPerformed
        
        this.dispose();
        int frameCount = 0;
        for(Frame f : TextEditorMain.getFrames()) {
            
            if(f.isValid() == true) {
                
                frameCount = frameCount + 1;
                
            }
            
        }
        if(frameCount <= 0) {
            
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_itmCloseWindowActionPerformed
    private void itmCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCutActionPerformed

        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().cut();
        
    }//GEN-LAST:event_itmCutActionPerformed
    private void itmCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCopyActionPerformed

        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().copy();
        
    }//GEN-LAST:event_itmCopyActionPerformed
    private void itmSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSelectAllActionPerformed

        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().selectAll();
        
    }//GEN-LAST:event_itmSelectAllActionPerformed
    private void itmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeleteActionPerformed

        FilePane f = (FilePane)jtpEditor.getSelectedComponent();
        f.deleteSelected();
        
    }//GEN-LAST:event_itmDeleteActionPerformed
    private void itmFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmFindActionPerformed

        splSplit.setRightComponent(new JFind(this));
        
    }//GEN-LAST:event_itmFindActionPerformed
    private void itmSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSpecActionPerformed

        splSplit.setRightComponent(new SpecialCharactersDialog(this));
        
    }//GEN-LAST:event_itmSpecActionPerformed
    private void itmZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmZoomActionPerformed

        JSettings settings = new JSettings(this);
        splSplit.setRightComponent(settings);
        settings.getSlider().grabFocus();
        
    }//GEN-LAST:event_itmZoomActionPerformed
    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        splSplit.setRightComponent(new JOpen(this));
        
    }//GEN-LAST:event_btnOpenActionPerformed
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
        if((fPane.getCurFile() == null)) {
            
            splSplit.setRightComponent(new JSaveAs(this));
            
        } else {
            
            saveFile(fPane, fPane.getCurFile());
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed

        splSplit.setRightComponent(new JSaveAs(this));
        
    }//GEN-LAST:event_btnSaveAsActionPerformed
    private void btnSaveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAllActionPerformed

        ArrayList<FilePane> paneList = new ArrayList<>();
        
        for(int i = 0; i < jtpEditor.getTabCount(); i++) {
            
            FilePane fPane = (FilePane)jtpEditor.getComponentAt(i);
            paneList.add(fPane);
            
        }
        for(FilePane fPane : paneList) {
            
            if((fPane.getCurFile() == null)) {
            
                splSplit.setRightComponent(new JSaveAs(this));
            
            } else {

                saveFile(fPane, fPane.getCurFile());
                
            }
            
        }
        
    }//GEN-LAST:event_btnSaveAllActionPerformed
    private void btnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutActionPerformed

        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().cut();
        
    }//GEN-LAST:event_btnCutActionPerformed
    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        
        ((FilePane)jtpEditor.getSelectedComponent()).getTextArea().paste();
        
    }//GEN-LAST:event_btnPasteActionPerformed
    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        
        FilePane f = (FilePane)jtpEditor.getSelectedComponent();
        f.undo();
        
    }//GEN-LAST:event_btnUndoActionPerformed
    private void btnRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedoActionPerformed
        
        FilePane f = (FilePane)jtpEditor.getSelectedComponent();
        f.redo();
        
    }//GEN-LAST:event_btnRedoActionPerformed
    private void btnCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharActionPerformed

        splSplit.setRightComponent(new SpecialCharactersDialog(this));
        
    }//GEN-LAST:event_btnCharActionPerformed
    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed

        splSplit.setRightComponent(new JSettings(this));
        
    }//GEN-LAST:event_btnSettingsActionPerformed
    private void menEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menEditActionPerformed
    }//GEN-LAST:event_menEditActionPerformed
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

        FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
        this.saveFile(fPane, fPane.getCurFile());
        int caretLoc = fPane.getTextArea().getCaretPosition();
        java.awt.print.PrinterJob pj = java.awt.print.PrinterJob.getPrinterJob();
        java.awt.print.PageFormat pf = pj.pageDialog(pj.defaultPage());
        fPane.getTextArea().setCaretPosition(0);
        JComponentVista vista = new JComponentVista(fPane.getTextArea(), pf);
        pj.setPageable(vista);
        try {
            
            pj.print();
            
        } catch(PrinterException pe) {
            
            lblError.setText("Error Printing File" + pe.getLocalizedMessage());
                
        } finally {
            
            fPane.getTextArea().setCaretPosition(caretLoc);
            
        }
        
    }//GEN-LAST:event_btnPrintActionPerformed
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        
        this.dispose();
        int frameCount = 0;
        for(Frame f : TextEditorMain.getFrames()) {
            
            if(f.isValid() == true) {
                
                frameCount = frameCount + 1;
                
            }
            
        }
        if(frameCount <= 0) {
            
            System.exit(0);
            
        }
        
    }//GEN-LAST:event_btnCloseActionPerformed
    private void itmStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmStatusBarActionPerformed

        jtbBottom.setVisible(itmStatusBar.getState());
      
    }//GEN-LAST:event_itmStatusBarActionPerformed
    private void itmWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmWrapActionPerformed

        FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
        fPane.getTextArea().setLineWrap(itmWrap.getState());
        
    }//GEN-LAST:event_itmWrapActionPerformed
    // </editor-fold>
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            
            new TextEditorMain().setVisible(true);
        
        });
        
        SwingUtilities.invokeLater(TextEditorMain::new);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChar;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRedo;
    private javax.swing.JButton btnReplace;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAll;
    private javax.swing.JButton btnSaveAs;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnUndo;
    private javax.swing.JMenuItem itmCloseTab;
    private javax.swing.JMenuItem itmCloseWindow;
    private javax.swing.JMenuItem itmCopy;
    private javax.swing.JMenuItem itmCut;
    private javax.swing.JMenuItem itmDateTime;
    private javax.swing.JMenuItem itmDelete;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmFind;
    private javax.swing.JMenuItem itmGoTo;
    private javax.swing.JMenuItem itmNewTab;
    private javax.swing.JMenuItem itmNewWindow;
    private javax.swing.JMenuItem itmOpen;
    private javax.swing.JMenuItem itmPaste;
    private javax.swing.JMenuItem itmPrint;
    private javax.swing.JMenuItem itmRedo;
    private javax.swing.JMenuItem itmReplace;
    private javax.swing.JMenuItem itmSave;
    private javax.swing.JMenuItem itmSaveAs;
    private javax.swing.JMenuItem itmSelectAll;
    private javax.swing.JMenuItem itmSpec;
    private javax.swing.JCheckBoxMenuItem itmStatusBar;
    private javax.swing.JMenuItem itmUndo;
    private javax.swing.JCheckBoxMenuItem itmWrap;
    private javax.swing.JMenuItem itmZoom;
    private javax.swing.JToolBar jtbBottom;
    private javax.swing.JToolBar jtbTop;
    private javax.swing.JTabbedPane jtpEditor;
    private javax.swing.JLabel lblColumnCount;
    private javax.swing.JLabel lblColumnLabel;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLineCount;
    private javax.swing.JLabel lblLineLabel;
    private javax.swing.JLabel lblWordNum;
    private javax.swing.JLabel lblWords;
    private javax.swing.JLabel lblZoom;
    private javax.swing.JMenu menEdit;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menView;
    private javax.swing.JMenuBar mnbBar;
    private javax.swing.JToolBar.Separator sepSep1;
    private javax.swing.JToolBar.Separator sepSep2;
    private javax.swing.JToolBar.Separator sepSep3;
    private javax.swing.JToolBar.Separator sepSep4;
    private javax.swing.JSplitPane splSplit;
    // End of variables declaration//GEN-END:variables
 
    public JTabbedPane getTabbedPane() {
        
        return this.jtpEditor;
        
    }
    public int getTheme() {
        
        return theme;
        
    }
    public Color getAccent() {
        
        return this.accent;
        
    }
    public void setAutosaveToggle(boolean b) {
        
        this.autosaveToggle = b;
        
    }
    public void openFile(File f) {
       
        try {
            
            if(!f.exists()) {

                return;

            }
            
            BufferedReader reader = new BufferedReader(new FileReader(f));
            StringBuilder builder = new StringBuilder(256);
            String s;
            
            while((s=reader.readLine()) != null) {

                builder.append(s).append(System.getProperty("line.separator"));
                
            }
            
            String s1 = builder.toString();
            jtpEditor.insertTab(f.getName(), null, new FilePane(this, f, f.getName(), s1), null, jtpEditor.getTabCount());
            jtpEditor.setSelectedIndex(jtpEditor.getTabCount() - 1);
            reader.close();
            
            
        } catch(Exception e) {
            
            lblError.setText("Unable to open file.");
            
        }
        splSplit.setRightComponent(null);
        
    }
    public void saveFile(FilePane fPane, File f) {
        
        try {
            
            BufferedReader reader = new BufferedReader(new StringReader(fPane.getTextArea().getText()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
            String s2;
            while((s2 = reader.readLine()) != null) {
                
                writer.write(s2 + System.getProperty("line.separator"));
                
            }
            writer.flush();
            reader.close();
            writer.close();
            ((FilePane)jtpEditor.getSelectedComponent()).setCurFile(f);
            ((FilePane)jtpEditor.getSelectedComponent()).setDirty(false);
            jtpEditor.setTabComponentAt(jtpEditor.getSelectedIndex(), new JLabel(f.getName()));
            
        } catch(Exception e) {
            
            lblError.setText("Unable to save file.");
            
        }
        splSplit.setRightComponent(null);
        
    }
    public void saveAsFile(String s1, File directory) {
        
        try {
            
            File newFile = new File(directory, s1);
            
            FilePane fPane = (FilePane)jtpEditor.getSelectedComponent();
            BufferedReader reader = new BufferedReader(new StringReader(fPane.getTextArea().getText()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            String s2;
            while((s2 = reader.readLine()) != null) {
                
                writer.write(s2 + System.getProperty("line.separator"));
                
            }
            writer.flush();
            reader.close();
            writer.close();
            ((FilePane)jtpEditor.getSelectedComponent()).setCurFile(newFile);
            ((FilePane)jtpEditor.getSelectedComponent()).setDirty(false);
            jtpEditor.setTabComponentAt(jtpEditor.getSelectedIndex(), new JLabel(newFile.getName()));
            
        } catch(Exception e) {
            
            lblError.setText("Unable to save all files.");
            
        }
        splSplit.setRightComponent(null);
        
    }
    public void autoSaveFile() {
   
        //COMING SOON^tm
        
    }    
    public void setTheme(JSettings settings, TextEditorMain main, int i) {
        
        if(i == 0) {
            
            try {
            
                UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
                btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Open_Light.png")));
                btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_Light.png")));
                btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_As_Light.png")));
                btnSaveAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_All_Light.png")));
                btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Copy_Light.png")));
                btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Cut_Light.png")));
                btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Paste_Light.png")));
                btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Undo_Light.png")));
                btnRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Redo_Light.png")));
                btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Find_Light.png")));
                btnReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Replace_Light.png")));
                btnChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Insert_Char_Light.png")));
                btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Print_Light.png")));
                btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Close_Light.png")));
                btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Settings_Light.png")));
                SwingUtilities.updateComponentTreeUI(main);
                SwingUtilities.updateComponentTreeUI(settings);
                theme = 0;
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException  ex) {
            
                Logger.getLogger(TextEditorMain.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        } else {
            
            try {
            
                UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
                btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Open_Dark.png")));
                btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_Dark.png")));
                btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_As_Dark.png")));
                btnSaveAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Save_All_Dark.png")));
                btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Copy_Dark.png")));
                btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Cut_Dark.png")));
                btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Paste_Dark.png")));
                btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Undo_Dark.png")));
                btnRedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Redo_Dark.png")));
                btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Find_Dark.png")));
                btnReplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Replace_Dark.png")));
                btnChar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Insert_Char_Dark.png")));
                btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Print_Dark.png")));
                btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Close_Dark.png")));
                btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semtexteditor/icons/Settings_Dark.png")));
                SwingUtilities.updateComponentTreeUI(main);
                SwingUtilities.updateComponentTreeUI(settings);
                theme = 1;
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException  ex) {
            
                Logger.getLogger(TextEditorMain.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
        }
        
    }
    public void setErrorMessage(String s) {
        
        lblError.setText(s);
        
    }
    public void statusBarColor(Color c) {
        
        mnbBar.setBackground(c);
        jtbBottom.setBackground(c);
        if(((c.getRed() * .299) + (c.getGreen() * .587) + (c.getBlue() * .114)) > 128) {
            
            lblLineLabel.setForeground(Color.BLACK);
            lblLineCount.setForeground(Color.BLACK);
            lblColumnLabel.setForeground(Color.BLACK);
            lblColumnCount.setForeground(Color.BLACK);
            lblWords.setForeground(Color.BLACK);
            lblWordNum.setForeground(Color.BLACK);
            lblZoom.setForeground(Color.BLACK);
            
        } else {
            
            lblLineLabel.setForeground(Color.WHITE);
            lblLineCount.setForeground(Color.WHITE);
            lblColumnLabel.setForeground(Color.WHITE);
            lblColumnCount.setForeground(Color.WHITE);
            lblWords.setForeground(Color.WHITE);
            lblWordNum.setForeground(Color.WHITE);
            lblZoom.setForeground(Color.WHITE);
            
        }
        double distance = Math.sqrt(Math.pow(c.getRed() - 255, 2) + Math.pow(c.getGreen() - 0, 2) +Math.pow(c.getBlue() - 0, 2));
        double threshold = 100;
        if(distance < threshold) {
            
            lblError.setForeground(Color.BLUE);
            
        } else {
            
            lblError.setForeground(Color.RED);
            
        }
        this.accent = c;
        
    }
    public void closeSidebar() {
        
        splSplit.setRightComponent(null);
        
    }
    Component getFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getZoomLevel() {
        
        return zoomLevel;
        
    }
    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
        updateAllTabsZoom();
    }

    private void updateAllTabsZoom() {
        for (int i = 0; i < getTabbedPane().getTabCount(); i++) {
            FilePane fPane = (FilePane) getTabbedPane().getComponentAt(i);
            int newFontSize = (int) ((zoomLevel / 100.0) * 12);  // Assuming base font size is 12
            Font currentFont = fPane.getTextArea().getFont();
            fPane.getTextArea().setFont(currentFont.deriveFont((float) newFontSize));
        }
    }
    
}
