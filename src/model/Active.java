/*
Juan Pablo Puerta Gaviria 2240033
Miguel Angel Soto Espitia 2240019
14/11/23-21/11/23
*/
package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Clase abstracta para extender a nuevas clases sus caracteristicas
public abstract class Active {
    private int age, id;
    private List<Long> devices;
    private List<String> homes;
    private String name, lastName;
//Constructor de la clase abtracta, inicializador
    public Active(int id, String name, String lastName, int age, long cellphone, String home, String type) {
        this.age = age;
        this.id = id;
        this.devices = new ArrayList<>();
        this.devices.add(cellphone);
        this.homes = new ArrayList<>();
        this.homes.add(home);
        this.name = name;
        this.lastName = lastName;
    }
    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Long> getCellphone() {
        return devices;
    }

    public void setCellphone(long cellphone) {
        this.devices.add(cellphone);
    }

    public List<String> getHome() {
        return homes;
    }

    public void setHome(String home) {
        this.homes.add(home);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

