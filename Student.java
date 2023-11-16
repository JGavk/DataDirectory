package model;

public class Student extends Active {
    private String position;
    public Student(int id, String name, String lastName, int age,  long cellphone, String home, String position) {
        super(id, name, lastName, age, cellphone, home,"Student");
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
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
                        ", Grado: '" + position + '\'';
    }
}
