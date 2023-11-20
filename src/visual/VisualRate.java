package visual;
import controller.MainController;
import model.ImplementationDAO;
import model.Teacher;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualRate extends JFrame implements  ActionListener{
    private JButton btnDelete1, btnDelete2, btnDelete3 , btnAdd1,btnAdd2,btnAdd3, btnUpdate1,btnUpdate2,btnUpdate3, btnClose;
    private JPanel inputPanel,teacherPanel,teacherBPanel,workerBPanel,studentBPanel,studentPanel,workerPanel, btn1Panel, btn2Panel, btn3Panel;
    private DefaultTableModel teacherTable, studentTable, workerTable;
    private JLabel studentTitle, teacherTitle, workerTitle;
    private MainController controller;
    private ImplementationDAO teacherDAO;
    public VisualRate (ImplementationDAO teacherDAO){
        this.teacherDAO = teacherDAO;

        setTitle("University Directory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,900);
        setLocationRelativeTo(null);

        setResizable(false);
        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(4,4));
        mainContainer.setBackground(Color.DARK_GRAY);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.ORANGE));

        teacherPanel = new JPanel(new GridLayout(1,1));
        teacherPanel.setPreferredSize(new Dimension(400,400));
        teacherPanel.setBorder(new LineBorder(Color.black,1));
        //---------------------------------------------------------
        teacherTable = new DefaultTableModel();
        teacherTable.addColumn("ID");
        teacherTable.addColumn("Name");
        teacherTable.addColumn("LastName");
        teacherTable.addColumn("Cellphone");
        teacherTable.addColumn("Home");
        teacherTable.addColumn("Area");
        JTable table = new JTable(teacherTable);
        JScrollPane scrollPane = new JScrollPane(table);
        teacherPanel.add(scrollPane);
        table.setModel(teacherTable);
        mainContainer.add(teacherPanel, BorderLayout.WEST);


        workerPanel = new JPanel(new GridLayout(1,1));
        workerPanel.setPreferredSize(new Dimension(400,400));
        workerPanel.setBorder(new LineBorder(Color.BLACK,1));
        //-------------------------------------------------------------
        workerTable = new DefaultTableModel();
        workerTable.addColumn("ID");
        workerTable.addColumn("Name");
        workerTable.addColumn("LastName");
        workerTable.addColumn("Cellphone");
        workerTable.addColumn("Home");
        workerTable.addColumn("Area");
        JTable table3 = new JTable(workerTable);
        JScrollPane scrollPane2 = new JScrollPane(table3);
        workerPanel.add(scrollPane2);
        table3.setModel(workerTable);
        mainContainer.add(workerPanel, BorderLayout.CENTER);



        studentPanel = new JPanel(new GridLayout(1,1));
        studentPanel.setPreferredSize(new Dimension(400,400));
        studentPanel.setBorder(new LineBorder(Color.black,1));
        //---------------------------------------------------------------
        studentTable = new DefaultTableModel();
        studentTable.addColumn("ID");
        studentTable.addColumn("Name");
        studentTable.addColumn("LastName");
        studentTable.addColumn("Cellphone");
        studentTable.addColumn("Home");
        studentTable.addColumn("Area");
        JTable table2 = new JTable(studentTable);
        JScrollPane scrollPane1 = new JScrollPane(table2);
        studentPanel.add(scrollPane1);
        table2.setModel(studentTable);
        mainContainer.add(studentPanel, BorderLayout.EAST);



        inputPanel = new JPanel(new BorderLayout());
        inputPanel.setPreferredSize(new Dimension(100,200));
        inputPanel.setBorder(new LineBorder(Color.BLACK,1));
        inputPanel.setBackground(Color.DARK_GRAY);
        mainContainer.add(inputPanel,BorderLayout.SOUTH);

        teacherBPanel = new JPanel(new FlowLayout());
        teacherTitle = new JLabel("Añade un profesor");
        teacherBPanel.add(teacherTitle);
        btn1Panel = new JPanel(new FlowLayout());
        teacherBPanel.add(btn1Panel);

        btnAdd1 = new JButton("Añadir");
        btnAdd1.addActionListener(this);

        btnDelete1 = new JButton("Eliminar");
        btnUpdate1 = new JButton("Actualizar");
        btn1Panel.add(btnAdd1);



        btn1Panel.add(btnUpdate1);
        btn1Panel.add(btnDelete1);
        teacherBPanel.setPreferredSize(new Dimension(400,200));
        teacherBPanel.setBorder(new LineBorder(Color.BLACK,1));
        //teacherBPanel.setBackground(Color.WHITE);
        inputPanel.add(teacherBPanel, BorderLayout.WEST);


        workerBPanel = new JPanel(new FlowLayout());
        workerTitle = new JLabel("Añade un trabajador");
        workerBPanel.add(workerTitle);
        btn2Panel = new JPanel(new FlowLayout());
        workerBPanel.add(btn2Panel);
        btnAdd2 = new JButton("Añadir");
        btnDelete2 = new JButton("Eliminar");
        btnUpdate2 = new JButton("Actualizar");
        btn2Panel.add(btnAdd2);
        btn2Panel.add(btnUpdate2);
        btn2Panel.add(btnDelete2);
        workerBPanel.setPreferredSize(new Dimension(400,200));
        workerBPanel.setBorder(new LineBorder(Color.BLACK,1));
        //workerBPanel.setBackground(Color.WHITE);
        inputPanel.add(workerBPanel, BorderLayout.CENTER);

        studentBPanel = new JPanel(new FlowLayout());
        studentTitle = new JLabel("Añade un estudiante");
        studentBPanel.add(studentTitle);
        btn3Panel = new JPanel(new FlowLayout());
        studentBPanel.add(btn3Panel);
        btnAdd3 = new JButton("Añadir");
        btnDelete3 = new JButton("Eliminar");
        btnUpdate3 = new JButton("Actualizar");
        btn3Panel.add(btnAdd3);
        btn3Panel.add(btnUpdate3);
        btn3Panel.add(btnDelete3);
        studentBPanel.setPreferredSize(new Dimension(400,200));
        studentBPanel.setBorder(new LineBorder(Color.BLACK,1));
        //studentBPanel.setBackground(Color.WHITE);
        inputPanel.add(studentBPanel, BorderLayout.EAST);




        setVisible(true);
    }

    public void updateTeacherTable(Teacher teacher) {

        System.out.println("Actualiarrrr");

        teacherTable.addRow(new Object[]{teacher.getId(), teacher.getName(),
                teacher.getLastName(), teacher.getCellphone(),
                teacher.getHome(), teacher.getTopic()});
    }
    //Listeners and controller
    public void setMainController(MainController controller) {
        this.controller = controller;
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnAdd1) {
                controller.addButton1();

            }
        }


}
