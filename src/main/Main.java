/*
Juan Pablo Puerta Gaviria 2240033
Miguel Angel Soto Espitia 2240019
14/11/23-21/11/23
*/
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
