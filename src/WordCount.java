//AI 
package semtexteditor;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class WordCount {
    
    private final JTabbedPane tabbedPane;
    private final JLabel lblWordNum;

    // Constructor: Assigns the JTabbedPane and word count JLabel
    public WordCount(JTabbedPane tabbedPane, JLabel lblWords) {
        this.tabbedPane = tabbedPane;
        this.lblWordNum = lblWords;

        // Add a DocumentListener to each tab that exists
        for (int i = 0; i < tabbedPane.getTabCount(); i++) {
            addDocumentListenerToTab(i);
        }
        // Add listener to update word count when tabs are switched
        tabbedPane.addChangeListener(e -> updateWordCount());
    }

    // Add a DocumentListener to track changes in text for the given tab index
    private void addDocumentListenerToTab(int index) {
        FilePane scrollPane = (FilePane) tabbedPane.getComponentAt(index);
        JTextArea childTextPane = scrollPane.getTextArea();  // Access the JTextPane from the FilePane

        childTextPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateWordCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateWordCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateWordCount();
            }
        });
    }

    // Update the word count for the selected tab
    public void updateWordCount() {
        FilePane scrollPane = (FilePane) tabbedPane.getSelectedComponent();
        JTextArea childTextPane = scrollPane.getTextArea();  // Access the JTextPane from the selected tab

        if (childTextPane != null) {
            String text = childTextPane.getText();
            int wordCount = countWords(text);
            lblWordNum.setText(Integer.toString(wordCount));
        }
    }

    // Utility function to count words in a given text
    private int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}