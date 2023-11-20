package model;

import java.util.HashMap;
//Estructura de datos con sus HashMap para ingresar cada item con una key la key es la ID
public class Structure {
    private HashMap<Integer, Teacher> teachers;
    private HashMap<Integer, Student> students;
    private HashMap<Integer, Worker> workers;
//Constructor donde se inicializan los HashMaps
    public Structure(){
        teachers = new HashMap<>();
        students = new HashMap<>();
        workers = new HashMap<>();
    }

    //Metodo de agregado de profesores
    public void addTeacher(int id, Teacher teacher) {
        teachers.put(id, teacher);
    }

    //Metodo de actualizado de profesores
    public void updateTeacher(int id, String name, String lastName, int age, long cellphone) {
        Teacher teacher = teachers.get(id);
        if (teacher!= null) {
            teacher.setName(name);
            teacher.setLastName(lastName);
            teacher.setAge(age);
            teacher.setCellphone(cellphone);


        }
    }

    //Metodo de borrado de profesores
    public void popTeacher (int id){
        Teacher teacher = teachers.get(id);
        if(teacher!=null){
            teachers.remove(id);
        }
    }
    //Metodo Getter
    public HashMap<Integer, Teacher> getTeachers() {
        return teachers;
    }

    //Metodo de añadir trabajadores
    public void addWorker(int id, Worker worker) {
        workers.put(id, worker);
    }

    //Metodo de actualizar trabajadores
    public void updateWorker(int id, String name, String lastName, int age, long cellphone, String kind) {
        Worker worker = workers.get(id);
        if (worker!= null) {
            worker.setName(name);
            worker.setLastName(lastName);
            worker.setAge(age);
            worker.setCellphone(cellphone);
            worker.setKind(kind);

        }
    }

    //Metodo de borrado de trabajadores
    public void popWorker (int id){
        Worker worker = workers.get(id);
        if(worker!=null){
            workers.remove(id);
        }
    }

    //Getter de trabajadores
    public HashMap<Integer, Worker> getWorkers() {
        return workers;
    }

    //Metodo de añadir estudiantes a su respectivo HashMap
    public void addStudent(int id, Student student) {
        students.put(id, student);
    }

    //Metodo de actualizar estudiantes
    public void updateStudent(int id, String name, String lastName, int age, long cellphone, String home, String position) {
        Student student = students.get(id);
        if (student!= null) {
            student.setName(name);
            student.setLastName(lastName);
            student.setAge(age);
            student.setCellphone(cellphone);
            student.setHome(home);
            student.setPosition(position);

        }
    }

    //Metodo de borrado de estudiantes
    public void popStudent (int id){
        Student student = students.get(id);
        if(student!=null){
            students.remove(id);
        }
    }

    //Getter de estudiantes
    public HashMap<Integer, Student> getStudents() {
        return students;
    }


}
