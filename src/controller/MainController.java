package controller;

import model.ImplementationDAO;
import model.Student;
import model.Teacher;
import model.Worker;
import visual.StudentForm;
import visual.TeacherForm;
import visual.VisualRate;
import visual.WorkerForm;

public class MainController {
    private VisualRate visual;

    private ImplementationDAO impDAO;
    private TeacherForm teacherForm;
    private StudentForm studentForm;
    private WorkerForm workerForm;
    public MainController(VisualRate visual){
        this.visual = visual;
        this.impDAO = new ImplementationDAO();
        this.teacherForm = teacherForm;
    }

    //Metodo para añadir los profesores desde TeacherForm al HashMap y a la tabla
    public void addTeacherFromForm(Teacher teacher) {

        impDAO.addTeacherFromUserInput(teacher);
        visual.updateTeacherTable(teacher);
        teacherForm.dispose();
    }

    //Metodo para buscar los profesores desde el DAO en el controllador, evitar que se conozcan las frames y el DAO
    public boolean teacherExists(int id) {
        return impDAO.teacherExists(id);
    }
    public boolean studentExists(int id){
        return impDAO.studentExists(id);
    }

    public boolean workerExists(int id){
        return impDAO.workerExists(id);
    }

    //Boton que abre el panel de añadir
    public void addButton1(){
        teacherForm = new TeacherForm(this,true, false);

    }

    public void addButton3() {
        studentForm = new StudentForm(this, true, false);
    }

    public void addstudentFromForm(Student student) {
        impDAO.addStudentFromUserInput(student);
        visual.updateStudentTable(student);
        studentForm.dispose();
    }

    public void addButton2() {
        workerForm = new WorkerForm(this,true,false);
    }

    public void addWorkerFromForm(Worker worker) {
        impDAO.addWorkerFromUserInput(worker);
        visual.updateWorkerTable(worker);
        workerForm.dispose();
    }
//Controla el boton de update desde el VisualRate
    public void btnUpdate1(int selectedID, int selectedRow) {

        teacherForm = new TeacherForm(this, false, true);
        teacherForm.setSelectedID(selectedID);
        teacherForm.setSelectedRow(selectedRow);
        teacherForm.setVisible(true);
    }

//Controla la actualizacion el profesor desde el formato visual
    public void updateTeacherForm(int selectedID, String name,String lastName,int age, long cellphone, String home, String topic) {
        impDAO.updateTeacherFromUserInput(selectedID,name,lastName,age,cellphone,home, topic);
        Teacher updatedTeacher  = impDAO.retrieveTeacher(selectedID);
        visual.refreshTeacherTable(updatedTeacher);
    }
//Abre el formato visual para actualizar un profesor, con su parametro de botones
    public void btnUpdate3(int selectedID, int selectedRow) {
        studentForm = new StudentForm(this,false,true);
        studentForm.setSelectedID(selectedID);
        studentForm.setSelectedRow(selectedRow);
        studentForm.setVisible(true);
    }
    //Controla la actualizacion al alumno desde el formato visual
    public void updateStudentForm(int selectedID, String name, String lastName, int age, long cellphone, String home, String position) {
        impDAO.updateStudentFromUserInput(selectedID,  name, lastName, age,  cellphone,home, position);
        Student updatedStudent  = impDAO.retrieveStudent(selectedID);
        visual.refreshStudentTable(updatedStudent);
    }

    public void btnUpdate2(int selectedID, int selectedRow) {
        workerForm = new WorkerForm(this,false,true);
        workerForm.setSelectedID(selectedID);
        workerForm.setSelectedRow(selectedRow);
        workerForm.setVisible(true);
    }
//Controla la actualizacion al personal desde el formato visual
    public void updateWorkerForm(int selectedID, String name, String lastName, int age, long cellphone, String home, String kind) {
        impDAO.updateWorkerFromUserInput(selectedID, name, lastName, age, cellphone, home, kind);
        Worker updatedWorker = impDAO.retrieveWorker(selectedID);
        visual.refreshWorkerTable(updatedWorker);
    }
//Controla el borrado de estudiantes
    public void popStudent(int id){
        impDAO.popOneStudent(id);
        visual.deleteUpdate();
    }
//Controla el borrado de profesores
    public void popTeacher(int id) {
        impDAO.popOneTeacher(id);
        visual.deleteUpdateT();
    }
//Controla el borrado de trabajadores
    public void popWorker(int id) {
        impDAO.popOneWorker(id);
        visual.deleteUpdateW();
    }
}

