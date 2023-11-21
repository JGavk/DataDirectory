package visual;
import controller.MainController;
import model.Student;
import model.Teacher;
import model.Worker;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VisualRate extends JFrame implements  ActionListener{
    private JButton btnDelete1, btnDelete2, btnDelete3 , btnAdd1,btnAdd2,btnAdd3, btnUpdate1,btnUpdate2,btnUpdate3, btnClose;
    private JPanel inputPanel,teacherPanel,teacherBPanel,workerBPanel,studentBPanel,studentPanel,workerPanel, btn1Panel, btn2Panel, btn3Panel;
    private DefaultTableModel teacherTable, studentTable, workerTable;
    private JLabel studentTitle, teacherTitle, workerTitle;
    private MainController controller;
    private JTable table;
    private int selectedID, selectedRow;

    public VisualRate (){


        setTitle("University Directory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,900);
        setLocationRelativeTo(null);
        setResizable(false);
        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(4,4));
        mainContainer.setBackground(Color.DARK_GRAY);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.ORANGE));

        //--------------------------------------------------------
        teacherPanel = new JPanel(new GridLayout(1,1));
        teacherPanel.setPreferredSize(new Dimension(400,400));
        teacherPanel.setBorder(new LineBorder(Color.black,1));
        //---------------------------------------------------------
        //Creación de la table para profesores
        teacherTable = new DefaultTableModel();
        teacherTable.addColumn("ID");
        teacherTable.addColumn("Name");
        teacherTable.addColumn("LastName");
        teacherTable.addColumn("Age");
        teacherTable.addColumn("Cellphone");
        teacherTable.addColumn("Home");
        teacherTable.addColumn("Study");
        table = new JTable(teacherTable);
        
        //Metodo para buscar por mouse la ID 
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = table.getSelectedRow();
                    int column = table.getSelectedColumn();
                    selectedID = (int) table.getValueAt(selectedRow,0);
                    System.out.println("El ID"+ selectedID);
                    btnUpdate1.setEnabled(true);
                    btnDelete1.setEnabled(true);
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(table);
        teacherPanel.add(scrollPane);
        table.setModel(teacherTable);
        table.setDefaultEditor(Object.class, null); //Quita la Edicion desde la tabla
        mainContainer.add(teacherPanel, BorderLayout.WEST); //Añade la tabla

        //------------------------------------------------------------
        workerPanel = new JPanel(new GridLayout(1,1));
        workerPanel.setPreferredSize(new Dimension(400,400));
        workerPanel.setBorder(new LineBorder(Color.BLACK,1));
        //-------------------------------------------------------------
        workerTable = new DefaultTableModel();
        workerTable.addColumn("ID");
        workerTable.addColumn("Name");
        workerTable.addColumn("LastName");
        workerTable.addColumn("Age");
        workerTable.addColumn("Cellphone");
        workerTable.addColumn("Home");
        workerTable.addColumn("Area");
        JTable table3 = new JTable(workerTable);

        //Metodo para buscar por mouse la ID
        table3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = table3.getSelectedRow();
                    int column = table3.getSelectedColumn();
                    selectedID = (int) table3.getValueAt(selectedRow,0);
                    System.out.println("El ID"+ selectedID);
                    btnUpdate2.setEnabled(true);
                    btnDelete2.setEnabled(true);
                }
            }
        });
        JScrollPane scrollPane2 = new JScrollPane(table3);
        workerPanel.add(scrollPane2);
        table3.setModel(workerTable);
        table3.setDefaultEditor(Object.class, null);
        mainContainer.add(workerPanel, BorderLayout.CENTER);


        //--------------------------------------------------------------
        studentPanel = new JPanel(new GridLayout(1,1));
        studentPanel.setPreferredSize(new Dimension(400,400));
        studentPanel.setBorder(new LineBorder(Color.black,1));
        //---------------------------------------------------------------
        studentTable = new DefaultTableModel();
        studentTable.addColumn("ID");
        studentTable.addColumn("Name");
        studentTable.addColumn("LastName");
        studentTable.addColumn("Age");
        studentTable.addColumn("Cellphone");
        studentTable.addColumn("Home");
        studentTable.addColumn("Class");
        JTable table2 = new JTable(studentTable);
        
        
        //Metodo para buscar por mouse la ID
        table2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = table2.getSelectedRow();
                    int column = table2.getSelectedColumn();
                    selectedID = (int) table2.getValueAt(selectedRow,0);
                    System.out.println("El ID"+ selectedID);
                    btnUpdate3.setEnabled(true);
                    btnDelete3.setEnabled(true);
                }
            }
        });
        JScrollPane scrollPane1 = new JScrollPane(table2);
        studentPanel.add(scrollPane1);
        table2.setModel(studentTable);
        table2.setDefaultEditor(Object.class, null);
        mainContainer.add(studentPanel, BorderLayout.EAST);
        //---------------------------------------------------------------

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
        btnUpdate1 = new JButton("Actualizar");
        btnUpdate1.setEnabled(false);
        btnUpdate1.addActionListener(this::actionDone);
        btnDelete1 = new JButton("Eliminar");
        btnDelete1.addActionListener(this::actionDel2);
        btnDelete1.setEnabled(false);
        btn1Panel.add(btnAdd1);
        btn1Panel.add(btnUpdate1);
        btn1Panel.add(btnDelete1);
        teacherBPanel.setPreferredSize(new Dimension(400,200));
        teacherBPanel.setBorder(new LineBorder(Color.BLACK,1));
        inputPanel.add(teacherBPanel, BorderLayout.WEST);
        //----------------------------------------------------------------

        workerBPanel = new JPanel(new FlowLayout());
        workerTitle = new JLabel("Añade un trabajador");
        workerBPanel.add(workerTitle);
        btn2Panel = new JPanel(new FlowLayout());
        workerBPanel.add(btn2Panel);
        btnAdd2 = new JButton("Añadir");
        btnAdd2.addActionListener(this::actionWork);
        btnDelete2 = new JButton("Eliminar");
        btnUpdate2 = new JButton("Actualizar");
        btnUpdate2.setEnabled(false);
        btnDelete2.setEnabled(false);
        btnDelete2.addActionListener(this::actionDel3);
        btnUpdate2.addActionListener(this::actionUpdate);
        btn2Panel.add(btnAdd2);
        btn2Panel.add(btnUpdate2);
        btn2Panel.add(btnDelete2);
        workerBPanel.setPreferredSize(new Dimension(400,200));
        workerBPanel.setBorder(new LineBorder(Color.BLACK,1));
        inputPanel.add(workerBPanel, BorderLayout.CENTER);
        //------------------------------------------------------------------

        studentBPanel = new JPanel(new FlowLayout());
        studentTitle = new JLabel("Añade un estudiante");
        studentBPanel.add(studentTitle);
        btn3Panel = new JPanel(new FlowLayout());
        studentBPanel.add(btn3Panel);
        btnAdd3 = new JButton("Añadir");
        btnAdd3.addActionListener(this::action);
        btnDelete3 = new JButton("Eliminar");
        btnUpdate3 = new JButton("Actualizar");
        btnUpdate3.addActionListener(this::actionDid);
        btnUpdate3.setEnabled(false);
        btnDelete3.setEnabled(false);
        btnDelete3.addActionListener(this::actionDel);
        btn3Panel.add(btnAdd3);
        btn3Panel.add(btnUpdate3);
        btn3Panel.add(btnDelete3);
        studentBPanel.setPreferredSize(new Dimension(400,200));
        studentBPanel.setBorder(new LineBorder(Color.BLACK,1));
        inputPanel.add(studentBPanel, BorderLayout.EAST);
        //----------------------------------------------------------------

        setVisible(true);
    }

    private void actionDel3(ActionEvent i) {
        if(controller.workerExists(this.selectedID)){
            controller.popWorker(this.selectedID);
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona uno!! ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actionDel2(ActionEvent r) {
        if(controller.teacherExists(this.selectedID)){
            controller.popTeacher(this.selectedID);
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona uno!! ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    private void actionDel(ActionEvent w) {
        if(controller.studentExists(this.selectedID)){
            controller.popStudent(this.selectedID);
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona uno!! ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void actionUpdate(ActionEvent s) {
        if(controller.workerExists(this.selectedID)){
            controller.btnUpdate2(this.selectedID,this.selectedRow);
        }


    }

    private void actionDid(ActionEvent p) {
        if(controller.studentExists(this.selectedID)){
            controller.btnUpdate3(this.selectedID,this.selectedRow);
        }


    }

    //Listeners and controller
    private void actionDone(ActionEvent m) {
         if(controller.teacherExists(this.selectedID)){
             controller.btnUpdate1(this.selectedID, this.selectedRow);
         }
    }

    private void actionWork(ActionEvent l) {
        if (l.getSource()==btnAdd2){
            controller.addButton2();
        }
    }

    private void action(ActionEvent n) {
        if (n.getSource()==btnAdd3){
            controller.addButton3();
        }
    }
    //Actualizacion con tabla y mouse
    public void updateTeacherTable(Teacher teacher) {
        teacherTable.addRow(new Object[]{teacher.getId(), teacher.getName(),
                teacher.getLastName(),teacher.getAge(), teacher.getCellphone(),
                teacher.getHome(), teacher.getTopic()});
    }

    public void refreshTeacherTable (Teacher teacher){
        teacherTable.setValueAt(teacher.getName(),this.selectedRow,1);
        teacherTable.setValueAt(teacher.getLastName(), this.selectedRow,2);
        teacherTable.setValueAt(teacher.getAge(), this.selectedRow, 3);
        teacherTable.setValueAt(teacher.getTopic(), this.selectedRow,6);
    }

    public void setMainController(MainController controller) {
        this.controller = controller;
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnAdd1) {
                controller.addButton1();
            }
        }
    //Actualizacion con tabla y mouse
    public void updateStudentTable(Student student) {
        studentTable.addRow(new Object[]{student.getId(), student.getName(),
                student.getLastName(),student.getAge(), student.getCellphone(),
                student.getHome(), student.getPosition()});
    }
    //Actualizacion con tabla y mouse
    public void updateWorkerTable(Worker worker) {
        workerTable.addRow(new Object[]{worker.getId(), worker.getName(),
                worker.getLastName(),worker.getAge(), worker.getCellphone(),
                worker.getHome(), worker.getKind()});
    }
    //Metodos para refrescar las tablas en la actualizacion
    public void refreshStudentTable(Student student) {
        studentTable.setValueAt(student.getName(),this.selectedRow,1);
        studentTable.setValueAt(student.getLastName(), this.selectedRow,2);
        studentTable.setValueAt(student.getAge(), this.selectedRow, 3);
        studentTable.setValueAt(student.getPosition(), this.selectedRow,6);
    }

    public void refreshWorkerTable(Worker worker) {
        workerTable.setValueAt(worker.getName(),this.selectedRow,1);
        workerTable.setValueAt(worker.getLastName(), this.selectedRow,2);
        workerTable.setValueAt(worker.getAge(), this.selectedRow, 3);
        workerTable.setValueAt(worker.getKind(), this.selectedRow,6);
    }
    //Metodos Delete
    public void deleteUpdate() {
        studentTable.removeRow(selectedRow);
    }
    public void deleteUpdateT(){
        teacherTable.removeRow(selectedRow);
    }

    public void deleteUpdateW() {
        workerTable.removeRow(selectedRow);
    }
}
