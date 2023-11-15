package main;

import model.Active;


public class Main {
    public static void main(String[] args) {
        Active.Teacher teacher = new Active.Teacher(1,
                "John","Puke",
                59,300123452,"Pradera","Engineer");

        System.out.println("id: " + teacher.getId() + " name: " + teacher.getName() + " last name: " + teacher.getLastName() +
                " age: " + teacher.getAge() + " cellphone: " + teacher.getCellphone() + " home: " + teacher.getHome() +
                " topic: " + teacher.getTopic());
    }
}
