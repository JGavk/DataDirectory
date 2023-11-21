package main;

import controller.MainController;

import visual.VisualRate;


public class Main {
    public static void main(String[] args) {
        VisualRate visual = new VisualRate();
        MainController controller = new MainController(visual);
        visual.setMainController(controller);
    }
}
