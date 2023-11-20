package controller;

import model.StudentImplementationDAO;
import model.ImplementationDAO;
import model.WorkerImplementationDAO;
import visual.VisualRate;

public class MainController {
    private VisualRate visual;
    private StudentImplementationDAO stuDAO;
    private ImplementationDAO teaDAO;
    private WorkerImplementationDAO worDAO;

    public MainController(){
        this.visual = visual;
        this.stuDAO = stuDAO;
        this.teaDAO = teaDAO;
        this.worDAO = worDAO;
    }

}
