package model;

public class Worker extends Active {
    private String kind;
    public Worker(int id, String name, String lastName, int age,  long cellphone, String home, String kind) {
        super(id, name, lastName, age, cellphone, home, "Worker");
        this.kind = kind;
    }
    public String getKind(){
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    @Override
    public String toString() {
        return
                "ID: " + getId() +
                        ", Nombre: '" + getName() + '\'' +
                        ", Apellido: '" + getLastName() + '\'' +
                        ", Edad: " + getAge() +
                        ", Telefono: " + getCellphone() +
                        ", Direccion: " + getHome() + '\'' +
                        ", Trabajo: '" + kind + '\'';
    }
}
