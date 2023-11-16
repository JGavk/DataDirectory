package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Active {
    private String position;
    private List<String> homes;
    public Student(int id, String name, String lastName, int age,  long cellphone, String home, String position) {
        super(id, name, lastName, age, cellphone, home,"Student");
        this.position = position;
        this.homes = new ArrayList<>();
        this.homes.add(home);
    }
    public String getPosition(){
        return position;
    }
    public void addCellphone(long cellphone) {
        setCellphone(cellphone);
        //this.devices.add(cellphone);
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
    public void setPosition(String position){
        this.position = position;
    }
    public String listToString(List<?> list) {
        //Testeo de sout para funcion
        System.out.println("OBJ  " + list.toString());
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
                        ", Area: '" + getPosition() + '\'';
    }
}
