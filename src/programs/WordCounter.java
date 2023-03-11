package programs;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.BorderLayout;
import java.util.StringTokenizer;

public class WordCounter {
    private JTextArea text;
    private JLabel wordCountLabel;

    public WordCounter() {
        text = new JTextArea();
        text.getDocument().addDocumentListener(new DocumentListener() {
            
            public void insertUpdate(DocumentEvent e) {
                updateWordCount();
            }

          
            public void removeUpdate(DocumentEvent e) {
                updateWordCount();
            }

 
            public void changedUpdate(DocumentEvent e) {
                updateWordCount();
            }
        });

        wordCountLabel = new JLabel("Words: 0");

        JFrame frame = new JFrame("Word Counter");
        frame.add(text);
        frame.add(wordCountLabel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void updateWordCount() {
        String textWritten = text.getText();
        if (textWritten == null || textWritten.isEmpty()) {
            wordCountLabel.setText("Words: 0");
        } else {
            StringTokenizer tokens = new StringTokenizer(textWritten);
            int wordCount = tokens.countTokens();
            wordCountLabel.setText("Words: " + wordCount);
        }
    }

    public static void main(String[] args) {
    	
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new WordCounter();
            }
        });
    }
}



