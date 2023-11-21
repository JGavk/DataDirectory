package visual;

import controller.MainController;
import model.Student;
import model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame implements ActionListener {
    private JTextField idField, nameField, lastNameField, ageField, cellphoneField, homeField, topicField;

    private JButton btnAdd, btnUpdate;
    private MainController controller;
    private int selectedID, selectedRow;
    public StudentForm(MainController controller, boolean showAdd, boolean showUpdate){
        this.controller = controller;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        idField = new JTextField(7);
        nameField = new JTextField(7);
        lastNameField = new JTextField(7);
        ageField = new JTextField(7);
        cellphoneField = new JTextField(7);
        homeField = new JTextField(7);
        topicField = new JTextField(7);
        btnAdd = new JButton("Add");
        btnAdd.setPreferredSize(new Dimension(100,100));
        btnUpdate = new JButton("Update");

        // Set up layout
        JPanel panel = new JPanel(new GridLayout(9, 1));
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Last Name:"));
        panel.add(lastNameField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);
        panel.add(new JLabel("Cellphone:"));
        panel.add(cellphoneField);
        panel.add(new JLabel("Home:"));
        panel.add(homeField);
        panel.add(new JLabel("Class:"));
        panel.add(topicField);
        btnAdd.setVisible(showAdd);
        btnUpdate.setVisible(showUpdate);
        panel.add(btnAdd);
        panel.add(btnUpdate);
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this::actionDone);

        getContentPane().add(panel);
    }

    private void actionDone(ActionEvent a) {
        updateStudent();
    }
    //Setter del seleccion ID en fila desde VisualRate
    public void setSelectedID(int selectedID){
        this.selectedID = selectedID;
    }
    public void setSelectedRow (int selectedRow){
        this.selectedRow = selectedRow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAdd){
            addStudent();
        }
    }

    private void addStudent() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String lastName = lastNameField.getText();
            int age = Integer.parseInt(ageField.getText());
            long cellphone = Long.parseLong(cellphoneField.getText());
            String home = homeField.getText();
            String topic = topicField.getText();

            if (controller.studentExists(id)) {
                JOptionPane.showMessageDialog(null, "La ID registrada ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Student student = new Student(id, name, lastName, age, cellphone, home, topic);
            controller.addstudentFromForm(student);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for numeric fields!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Manda al controllador el Actualizado
    private void updateStudent(){

        idField.setEnabled(false);
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        int age = Integer.parseInt(ageField.getText());
        long cellphone = Long.parseLong(cellphoneField.getText());
        String home = homeField.getText();
        String topic = topicField.getText();

        controller.updateStudentForm(this.selectedID, name, lastName,age, cellphone, home, topic);
    }

}

