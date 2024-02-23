package gof.behavioural.memento;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEditor extends JFrame {

    private final JTextArea theArticle = new JTextArea(40, 60);
    private final CareTaker careTaker = new CareTaker();
    private final Originator originator = new Originator();
    private final JButton saveButton;
    private final JButton undoButton;
    private final JButton redoButton;

    private int savedFiles = 0, articleIndex = 0;

    public TextEditor() {
        this.setSize(750, 780);
        this.setTitle("Memento Text Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var panel1 = new JPanel(new BorderLayout());
        panel1.add(new JLabel("Article"), BorderLayout.NORTH);
        panel1.add(theArticle, BorderLayout.CENTER);

        var saveListener = new ButtonListener();
        var undoListener = new ButtonListener();
        var redoListener = new ButtonListener();

        var buttonPanel = new JPanel();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);

        buttonPanel.add(saveButton);
        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);
        panel1.add(buttonPanel, BorderLayout.SOUTH);

        this.add(panel1);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == saveButton) {
                save();
            }
            if (event.getSource() == undoButton) {
                undo();
            }
            if (event.getSource() == redoButton) {
                redo();
            }
        }

        private void save() {
            var textInTextArea = theArticle.getText();
            originator.setArticle(textInTextArea);
            careTaker.addMemento(originator.saveArticle());

            savedFiles++;
            articleIndex++;

            System.out.println("Runner: saved files: " + savedFiles);

            undoButton.setEnabled(true);
        }

        private void undo() {
            if (articleIndex >= 1) {
                articleIndex--;
                var textBoxString = originator.getArticle(careTaker.getMemento(articleIndex));
                theArticle.setText(textBoxString);
                redoButton.setEnabled(true);
            } else {
                undoButton.setEnabled(false);
            }
        }

        private void redo() {
            if ((savedFiles - 1) > articleIndex) {
                articleIndex++;
                var textBoxString = originator.getArticle(careTaker.getMemento(articleIndex));
                theArticle.setText(textBoxString);
                undoButton.setEnabled(true);
            } else {
                redoButton.setEnabled(false);
            }
        }
    }
}
