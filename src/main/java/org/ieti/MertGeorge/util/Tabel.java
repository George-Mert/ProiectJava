package org.ieti.MertGeorge.util;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabel {
    JFrame p;
    JLabel l;

    JButton button = new JButton("Add");
    JButton button2 = new JButton("save");
    public static void main(String[] args) {

        String data[][]={ {"1324","Laptop","670","DA"},
                {"102","Telefon","780","Nu"},
                {"101","Imprimanta","700","Nu"}};
        String[] labels = {"Id: ", "Produs: ", "Pret: ", "Validare: "};

        JTable table = new JTable(data, labels);

        // Set the table's model to a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel(data, labels);
        table.setModel(model);


        // Create a panel to hold the table and the "Add" button
        JPanel buttonPanel = new JPanel();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Produs");

        // Create a deletePanel to hold the "Delete" button
        JButton deleteButton = new JButton("Delete Produs");

        //Adds both buttons to a button panel
        buttonPanel.add(deleteButton);
        buttonPanel.add(addButton);
        panel.add(buttonPanel, BorderLayout.NORTH);

        // Create a frame to hold the panel
        JFrame frame = new JFrame("Store");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // Adds an "Add" button that opens the window when clicked
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create the input fields and save button
                JTextField nameField = new JTextField(10);
                JTextField scoreField = new JTextField(10);
                JTextField releaseDateField = new JTextField(10);
                JTextField genreField = new JTextField(10);
                JButton saveButton = new JButton("Save");

                // Input fields and save button
                JPanel inputPanel = new JPanel();
                inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
                inputPanel.add(new JLabel("Id:"));
                inputPanel.add(nameField);
                inputPanel.add(new JLabel("Nume"));
                inputPanel.add(scoreField);
                inputPanel.add(new JLabel("Pret:"));
                inputPanel.add(releaseDateField);
                inputPanel.add(new JLabel("Validare:"));
                inputPanel.add(genreField);
                inputPanel.add(saveButton);

                // Input panel window
                JFrame inputFrame = new JFrame("Add produs");
                inputFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                inputFrame.add(inputPanel);
                inputFrame.pack();
                inputFrame.setVisible(true);

                // Save button that adds the new object to the table
                saveButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String name = nameField.getText();
                        String score = scoreField.getText();
                        String releaseDate = releaseDateField.getText();
                        String genre = genreField.getText();
                        // Add the new object to the table
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(new String[] {name, score, releaseDate, genre});

                        // Closes the window
                        inputFrame.dispose();
                    }
                });
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                }
            }
        });
    }
}