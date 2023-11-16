package model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Active {
    private String topic;

    private List<String> homes;

    public Teacher(int id, String name, String lastName, int age, long cellphone, String home, String topic) {
        super(id, name, lastName, age, cellphone, home, "Teacher");
        this.topic = topic;
        this.homes = new ArrayList<>();
        this.homes.add(home);
    }



    public void addCellphone(long cellphone) {
        setCellphone(cellphone);
        
    }

    public List<Long> getCellphones() {
        return getCellphone();
    }


    public void addHome(String home) {
        this.homes.add(home);
    }

    public List<String> getHomes() {
        return homes;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String listToString(List<?> list) {
        //Testeo de sout para funcion

        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(obj -> {
            stringBuilder.append(obj).append(", ");
        });

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        String phonesString = listToString(getCellphones());
        String homesString = listToString(getHomes());

        return
                "ID: " + getId() +
                        ", Nombre: '" + getName() + '\'' +
                        ", Apellido: '" + getLastName() + '\'' +
                        ", Edad: " + getAge() +
                        ", Telefonos: " + phonesString +
                        ", Direcciones: " + homesString +
                        ", Area: '" + getTopic() + '\'';
    }
}
