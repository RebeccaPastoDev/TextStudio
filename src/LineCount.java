package semtexteditor;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.*;
/**
 *
 * @author rebec
 */
public class LineCount {
    
    private final JTabbedPane tabbedPane;
    private final JLabel lblLineCount;
    
    public LineCount(JTabbedPane tabbedPane, JLabel lblLine) {
        this.tabbedPane = tabbedPane;
        this.lblLineCount = lblLine;

        // Add a DocumentListener to each tab that exists
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            addCaretListenerToTab(i);
        }
        tabbedPane.addChangeListener(e -> updateLineCount());
    }
    private void addCaretListenerToTab(int index) {
        FilePane scrollPane = (FilePane) tabbedPane.getComponentAt(index);
        JTextArea childTextPane = scrollPane.getTextArea();  // Access the JTextPane from the FilePane

        childTextPane.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                updateLineCount();
            }
        });
    }
    public void updateLineCount() {
        FilePane scrollPane = (FilePane) tabbedPane.getSelectedComponent();
        JTextArea childTextPane = scrollPane.getTextArea();  // Access the JTextPane from the selected tab

        if (childTextPane != null) {
            try {
                // Get the caret position
                int caretPosition = childTextPane.getCaretPosition();
            
                // Use Utilities class to determine line number
                int lineNumber = childTextPane.getDocument().getDefaultRootElement().getElementIndex(caretPosition) + 1;

                // Update label
                lblLineCount.setText(Integer.toString(lineNumber));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 1; 
        }
        return text.split("\\R").length; 
    }
}

