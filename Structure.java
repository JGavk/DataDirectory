package model;

import java.util.HashMap;
//Estructura de datos con sus HashMap para ingresar cada item con una key la key es la ID
public class Structure {
    private HashMap<Integer, Active.Teacher> teachers;
    private HashMap<Integer, Active.Student> students;
    private HashMap<Integer, Active.Worker> workers;
//Constructor donde se inicializan los HashMaps
    public Structure(){
        teachers = new HashMap<>();
        students = new HashMap<>();
        workers = new HashMap<>();
    }
    
    //Metodo de agregado de profesores
    public void addTeacher(int id, String name, String lastName, int age, int cellphone, String home, String topic) {
        Active.Teacher teacher = new Active.Teacher(id, name, lastName, age, cellphone, home, topic);
        teachers.put(id, teacher);
    }
    
    //Metodo de actualizado de profesores
    public void updateTeacher(int id, String name, String lastName, int age, int cellphone, String home, String topic) {
        Active.Teacher teacher = teachers.get(id);
        if (teacher!= null) {
            teacher.setName(name);
            teacher.setLastName(lastName);
            teacher.setAge(age);
            teacher.setCellphone(cellphone);
            teacher.setHome(home);

        }
    }
    
    //Metodo de borrado de profesores
    public void popTeacher (int id){
        Active.Teacher teacher = teachers.get(id);
        if(teacher!=null){
            teachers.remove(id);
        }
    }
    //Metodo Getter
    public HashMap<Integer, Active.Teacher> getTeachers() {
        return teachers;
    }

    //Metodo de añadir trabajadores
    public void addWorker(int id, String name, String lastName, int age, int cellphone, String home, String kind) {
        Active.Worker worker = new Active.Worker(id, name, lastName, age, cellphone, home, kind);
        workers.put(id, worker);
    }
    
    //Metodo de actualizar trabajadores
    public void updateWorker(int id, String name, String lastName, int age, int cellphone, String home, String kind) {
        Active.Worker worker = workers.get(id);
        if (worker!= null) {
            worker.setName(name);
            worker.setLastName(lastName);
            worker.setAge(age);
            worker.setCellphone(cellphone);
            worker.setHome(home);
            worker.setKind(kind);

        }
    }
    
    //Metodo de borrado de trabajadores
    public void popWorker (int id, String name, String lastName, int age, int cellphone, String home, String kind){
        Active.Worker worker = workers.get(id);
        if(worker!=null){
            workers.remove(id);
        }
    }
    
    //Getter de trabajadores
    public HashMap<Integer, Active.Worker> getWorkers() {
        return workers;
    }

    //Metodo de añadir estudiantes a su respectivo HashMap
    public void addStudent(int id, String name, String lastName, int age, int cellphone, String home, String position) {
        Active.Student student = new Active.Student(id, name, lastName, age, cellphone, home, position);
        students.put(id, student);
    }
    
    //Metodo de actualizar estudiantes
    public void updateStudent(int id, String name, String lastName, int age, int cellphone, String home, String position) {
        Active.Student student = students.get(id);
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
    public void popStudent (int id, String name, String lastName, int age, int cellphone, String home, String position){
        Active.Student student = students.get(id);
        if(student!=null){
            students.remove(id);
        }
    }
    
    //Getter de estudiantes
    public HashMap<Integer, Active.Student> getStudents() {
        return students;
    }


}
