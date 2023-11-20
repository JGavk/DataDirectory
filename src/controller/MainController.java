package controller;

import model.ImplementationDAO;
import visual.TeacherForm;
import visual.VisualRate;

public class MainController {
    private VisualRate visual;

    private ImplementationDAO impDAO;
    private TeacherForm teacherForm;

    public MainController(){
        this.visual = visual;
        this.impDAO = impDAO;
        this.teacherForm = teacherForm;
    }
    public void setVisual(){
        this.visual=visual;
    }

    public void addButton1(){
        teacherForm = new TeacherForm(impDAO, visual);

    }
}
