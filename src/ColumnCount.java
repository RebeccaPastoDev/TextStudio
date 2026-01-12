package semtexteditor;

/**
 *
 * @author rebec
 */
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ColumnCount {
    
    private final JTabbedPane tabbedPane;
    private final JLabel lblColumnCount;

    public ColumnCount(JTabbedPane tabbedPane, JLabel lblColumn) {
        this.tabbedPane = tabbedPane;
        this.lblColumnCount = lblColumn;

        // Add a DocumentListener to each tab that exists
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            addDocumentListenerToTab(i);
        }

        // Add a listener to update column count when tabs are switched
        tabbedPane.addChangeListener(e -> updateColumnCount());
    }

    private void addDocumentListenerToTab(int index) {
        FilePane scrollPane = (FilePane) tabbedPane.getComponentAt(index);
        JTextArea childTextPane = scrollPane.getTextArea();

        childTextPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateColumnCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateColumnCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateColumnCount();
            }
        });
    }

    public void updateColumnCount() {
        FilePane scrollPane = (FilePane) tabbedPane.getSelectedComponent();
        JTextArea childTextPane = scrollPane.getTextArea();

        if (childTextPane != null) {
            int columnCount = countColumns(childTextPane);
            lblColumnCount.setText(Integer.toString(columnCount));
        }
    }

    private static int countColumns(JTextArea textArea) {
        if (textArea == null || textArea.getText().isEmpty()) {
            return 1;
        }

        // Get the maximum column width among all lines
        int maxColumnWidth = 0;
        for (String line : textArea.getText().split("\n")) {
            int lineWidth = getLineWidth(line);
            maxColumnWidth = Math.max(maxColumnWidth, lineWidth);
        }

        return maxColumnWidth;
    }

    private static int getLineWidth(String line) {
        // Assuming a fixed font width, calculate the width based on character count
        int fontWidth = 1; // Adjust based on your font and font size
        return line.length() * fontWidth;
    }
}