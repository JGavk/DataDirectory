package controller;

import model.ImplementationDAO;
import model.Teacher;
import visual.TeacherForm;
import visual.VisualRate;

public class MainController {
    private VisualRate visual;

    private ImplementationDAO impDAO;
    private TeacherForm teacherForm;

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

    //Boton que abre el panel de añadir
    public void addButton1(){
        teacherForm = new TeacherForm(this);

    }

}
