package model;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Active {
    private String kind;
    private List<String> homes;
    public Worker(int id, String name, String lastName, int age,  long cellphone, String home, String kind) {
        super(id, name, lastName, age, cellphone, home, "Worker");
        this.kind = kind;
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
    public String getKind(){
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public String listToString(List<?> list) {

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
                        ", Area: '" + getKind() + '\'';
    }
}
