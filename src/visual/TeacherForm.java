package visual;

import controller.MainController;
import model.Teacher;
import model.ImplementationDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherForm extends JFrame implements ActionListener{
    private JTextField idField, nameField, lastNameField, ageField, cellphoneField, homeField, topicField;

    private JButton btnAdd, btnUpdate, btnDelete;
    private MainController controller;
    private ImplementationDAO impDAO;
    private VisualRate visualRate;
    public TeacherForm(ImplementationDAO impDAO, VisualRate visual) {
        this.impDAO = impDAO;
        this.controller = controller;
        this.visualRate = visual;

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
        btnDelete = new JButton("Delete");

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
        panel.add(new JLabel("Topic:"));
        panel.add(topicField);
        panel.add(btnAdd);
        panel.add(btnUpdate);
        panel.add(btnDelete);


        btnAdd.addActionListener(this);
        // Add panel to the frame
        getContentPane().add(panel);




    }

        @Override
        public void actionPerformed(ActionEvent e) {
            addTeacher();
        }



    private void addTeacher() {
        try{
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        int age = Integer.parseInt(ageField.getText());
        long cellphone = Long.parseLong(cellphoneField.getText());
        String home = homeField.getText();
        String topic = topicField.getText();
        if(impDAO.teacherExists(id)){
            JOptionPane.showMessageDialog(null,"La ID registrada ya existe","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Teacher teacher = new Teacher(id, name, lastName, age, cellphone, home, topic);
        impDAO.addTeacherFromUserInput(teacher);
        visualRate.updateTeacherTable(teacher);

        dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for numeric fields!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
