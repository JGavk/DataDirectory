package visual;

import model.Teacher;
import model.ImplementationDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm extends JFrame {
    private JTextField idField, nameField, lastNameField, ageField, cellphoneField, homeField, topicField;

    private JButton btnAdd, btnUpdate, btnDelete;

    private ImplementationDAO teacherDAO;

    public TeacherForm(ImplementationDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
        idField = new JTextField(10);
        nameField = new JTextField(10);
        lastNameField = new JTextField(10);
        ageField = new JTextField(10);
        cellphoneField = new JTextField(10);
        homeField = new JTextField(10);
        topicField = new JTextField(10);
        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        // Set up layout
        JPanel panel = new JPanel(new GridLayout(8, 2));
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
        panel.add(new JLabel("Topic:"));
        panel.add(topicField);
        panel.add(btnAdd);
        panel.add(btnUpdate);
        panel.add(btnDelete);

        // Add panel to the frame
        getContentPane().add(panel);


        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTeacher();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // updateTeacher();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // deleteTeacher();
            }
        });
    }

    private void addTeacher() {

        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        int age = Integer.parseInt(ageField.getText());
        long cellphone = Long.parseLong(cellphoneField.getText());
        String home = homeField.getText();
        String topic = topicField.getText();


        Teacher teacher = new Teacher(id, name, lastName, age, cellphone, home, topic);


        teacherDAO.addTeacherFromUserInput(teacher);
    }
}