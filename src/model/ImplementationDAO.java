package model;

import java.util.Map;

public class ImplementationDAO {
    private static Structure structure;

    public ImplementationDAO() {
        this.structure = new Structure();
    }


    //Se uso para confirmar los HashMaps
    public static void printAllTeachers() {
        for (Map.Entry<Integer, Teacher> entry : structure.getTeachers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    //Regresa un profesor por ID
    public static Teacher retrieveTeacher(int id){
        return structure.getTeacherId(id);
    }
    //Añade un profesor o el metodo DAO para estructura
    public static void addTeacherFromUserInput(Teacher teacher) {
        // Añade al profe a la estructura fg
        structure.addTeacher(teacher.getId(), teacher);

    }
    //Busca la existencia de profesores
    public static boolean teacherExists(int id) {
        return structure.getTeachers().containsKey(id);
    }

    //Conecta el actualizado de un profesor
    public static void updateTeacherFromUserInput(int id, String name, String lastName, int age, long cellphone, String home, String topic) {
            // Llama el metodo Update
            structure.updateTeacher(id, name, lastName, age, cellphone, home, topic);

    }

    //Conecta el borrar de un profesor
    public static void popOneTeacher(int id){
        if (structure.getTeachers().containsKey(id)){
            structure.popTeacher(id);
        }

    }
    //Se uso para confirmar los HashMaps
    public static void printAllStudents() {

        for (Map.Entry<Integer, Student> entry : structure.getStudents().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    
    public static Student retrieveStudent(int id){
        return structure.getStudentId(id);
    }
    // Esto conecta el estudiante a la estructura
    public static void addStudentFromUserInput(Student student) {

        structure.addStudent(student.getId(), student);
    }
    public static boolean studentExists(int id) {
        return structure.getStudents().containsKey(id);
    }

    //Esto conecta la actualizacion un estudiante por su ID
    public static void updateStudentFromUserInput(int id, String name, String lastName, int age,  long cellphone, String home, String position) {
        structure.updateStudent(id, name, lastName, age, cellphone, home, position);



    }

    //Esto conecta el eliminar un estudiante por su ID
    public static void popOneStudent(int id){
        if (structure.getStudents().containsKey(id)){
            structure.popStudent(id);
        }

    }
    //Se uso para confirmar los HashMaps
    public void printAllWorkers() {
        //Este sout es para probar
        for (Map.Entry<Integer, Worker> entry : structure.getWorkers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public static Worker retrieveWorker(int id){
        return structure.getWorkerId(id);
    }
    public static void addWorkerFromUserInput(Worker worker) {
        structure.addWorker(worker.getId(),  worker);

    }
    public static void updateWorkerFromUserInput(int id, String name, String lastName, int age,  long cellphone, String home, String kind) {
        structure.updateWorker(id, name, lastName, age, cellphone, home, kind);
        ;

    }
    public static void popOneWorker(int id){
        if (structure.getWorkers().containsKey(id)){
            structure.popWorker(id);
        }

    }

    public static boolean workerExists(int id) {
        return structure.getWorkers().containsKey(id);
    }
}

