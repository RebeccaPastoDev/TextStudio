package semtexteditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecialCharactersDialog extends JPanel {
    
    private String selectedCharacter = "";
    private TextEditorMain main;
    
    public SpecialCharactersDialog(TextEditorMain m) {
        
        this.main = m;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Arrange panels vertically
        // Create panels for each group
        JPanel mathPanel = createCharacterPanel("Mathematical Symbols", new String[] {"±", "÷", "×", "√", "∞", "≈", "≠", "≤", "≥"});
        JPanel arrowPanel = createCharacterPanel("Arrows", new String[] {"→", "←", "↑", "↓", "↔"});
        JPanel currencyPanel = createCharacterPanel("Currency Symbols", new String[] {"$", "€", "£", "¥", "₹", "¢"});
        JPanel miscPanel = createCharacterPanel("Miscellaneous", new String[] {"©", "®", "™", "…", "§", "¶"});
        // Add each group panel to the dialog
        add(mathPanel);
        add(arrowPanel);
        add(currencyPanel);
        add(miscPanel);
        // Set dialog properties

    }
    // Method to create a panel with character buttons for a given group
    private JPanel createCharacterPanel(String title, String[] characters) {
        
        JPanel panel = new JPanel(new GridLayout(0, 5, 5, 5)); // 5 columns, dynamic rows
        panel.setBorder(BorderFactory.createTitledBorder(title)); // Add title to panel
        // Create a button for each character
        for (String character : characters) {
            
            JButton button = new JButton(character);
            button.setFont(new Font("SansSerif", Font.PLAIN, 18)); // Set font size if needed
            button.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    FilePane fPane = (FilePane)main.getTabbedPane().getSelectedComponent();
                    fPane.getTextArea().append(button.getText());
                    main.closeSidebar();
                    
                }
                
            });
            panel.add(button); // Add button to the group panel
            
        }

        return panel;
        
    }
/*public class SpecialCharactersDialog extends JDialog {
    private String selectedCharacter = "";

    public SpecialCharactersDialog(JFrame parent) {
        super(parent, "Special Characters", true);

        // Grid layout for character buttons
        setLayout(new GridLayout(3, 3, 5, 5)); // Adjust rows and columns as needed

        // Array of special characters 
        String[] characters = {"©", "®", "±", "£", "€", "¥", "§", "µ", "¶"};

        // Create a button for each character
        for (String character : characters) {
            JButton button = new JButton(character);
            button.setFont(new Font("SansSerif", Font.PLAIN, 18)); // Set font size if needed
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedCharacter = character;
                    dispose(); // Close dialog when character is selected
                }
            });
            add(button); // Add button to the grid layout
        }

        // Set dialog properties
        pack();
        setLocationRelativeTo(parent); // Center the dialog relative to the parent frame
    }

    // Method to get the selected character after dialog is closed
    public String getSelectedCharacter() {
        return selectedCharacter;
    }*/
}