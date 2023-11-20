package model;

import java.util.Map;
import java.util.Scanner;

public class ImplementationDAO {
    private static Structure structure;

    public ImplementationDAO() {
        this.structure = new Structure();
    }
//Todos los prints probablemente se eliminan de aqui cuando se migre al MVC en cada DAO
    public static void printAllTeachers() {
        for (Map.Entry<Integer, Teacher> entry : structure.getTeachers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public static void addTeacherFromUserInput(Teacher teacher) {

        // Añade al profe a la estructura fg

        structure.addTeacher(teacher.getId(), teacher);
        System.out.println("Teacher added successfully!");
        printAllTeachers();

    }
    public static void updateTeacherFromUserInput(Scanner scanner) {
        System.out.print("Enter teacher ID to update: ");
        int id = scanner.nextInt();

        // Mira si existe la ID en teacher HashMap
        if (structure.getTeachers().containsKey(id)) {
            System.out.print("Enter new name: ");
            String name = scanner.next();

            System.out.print("Enter new last name: ");
            String lastName = scanner.next();

            System.out.print("Enter new age: ");
            int age = scanner.nextInt();

            System.out.print("Enter new cellphone: ");
            long cellphone = scanner.nextLong();


            // Llama el metodo Update
            structure.updateTeacher(id, name, lastName, age, cellphone);
            System.out.println("Teacher updated successfully!");
        } else {
            System.out.println("Teacher with ID " + id + " not found.");
        }
    }
    public static void popOneTeacher(Scanner scanner){
        int id = scanner.nextInt();
        if (structure.getTeachers().containsKey(id)){
            structure.popTeacher(id);
        }

    }

    public static void printAllStudents() {

        for (Map.Entry<Integer, Student> entry : structure.getStudents().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public static void addStudentFromUserInput(Student student) {

        // Pregunta si quiere añadir mas celulares
      /*  while (true) {
            System.out.print("Do you want to add another cellphone? (yes/no): ");
            String addCellphoneOption = scanner.next().toLowerCase();
            if (addCellphoneOption.equals("yes")) {
                System.out.print("Enter another cellphone: ");
                Long anotherCellphone = scanner.nextLong();
                student.addCellphone(anotherCellphone);
                System.out.println(student.getCellphones());
            } else {
                break;
            }
        }

        // Pregunta si quiere añadir mas casas
        while (true) {
            System.out.print("Do you want to add another home? (yes/no): ");
            String addHomeOption = scanner.next().toLowerCase();
            if (addHomeOption.equals("yes")) {
                System.out.print("Enter another home address: ");
                String anotherHome = scanner.next();
                student.addHome(anotherHome);
                System.out.println(student.getHomes());
            } else {
                break;
            }
        }
*/
        // Añade el estudiante a la estructura fg
        structure.addStudent(student.getId(), student);
        printAllStudents();
        System.out.println("Teacher added successfully!");

    }

    //Esto actualiza un estudiante por su ID
    public static void updateStudentFromUserInput(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();

        // Mira si existe la ID en teacher HashMap
        if (structure.getStudents().containsKey(id)) {
            System.out.print("Enter new name: ");
            String name = scanner.next();

            System.out.print("Enter new last name: ");
            String lastName = scanner.next();

            System.out.print("Enter new age: ");
            int age = scanner.nextInt();

            System.out.print("Enter new cellphone: ");
            long cellphone = scanner.nextLong();

            System.out.print("Enter new home address: ");
            String home = scanner.next();

            System.out.print("Enter new topic: ");
            String topic = scanner.next();

            // Llama el metodo Update
            structure.updateStudent(id, name, lastName, age, cellphone, home, topic);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    //Esto elimina un estudiante por su ID
    public static void popOneStudent(Scanner scanner){
        int id = scanner.nextInt();
        if (structure.getStudents().containsKey(id)){
            structure.popStudent(id);
        }

    }
    public void printAllWorkers() {
        //Este sout es para probar
        for (Map.Entry<Integer, Worker> entry : structure.getWorkers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public static void addWorkerFromUserInput(Worker worker) {

        structure.addWorker(worker.getId(),  worker);

        System.out.println("Worker added successfully!");

    }
    public static void updateWorkerFromUserInput(Scanner scanner) {
        System.out.print("Enter Worker ID to update: ");
        int id = scanner.nextInt();

        // Mira si existe la ID en worker HashMap
        if (structure.getWorkers().containsKey(id)) {
            System.out.print("Enter new name: ");
            String name = scanner.next();

            System.out.print("Enter new last name: ");
            String lastName = scanner.next();

            System.out.print("Enter new age: ");
            int age = scanner.nextInt();

            System.out.print("Enter new cellphone: ");
            long cellphone = scanner.nextLong();


            System.out.print("Enter new topic: ");
            String topic = scanner.next();

            // Llama el metodo Update
            structure.updateWorker(id, name, lastName, age, cellphone, topic);
            System.out.println("Worker updated successfully!");
        } else {
            System.out.println("Worker with ID " + id + " not found.");
        }
    }
    public static void popOneWorker(Scanner scanner){
        int id = scanner.nextInt();
        if (structure.getWorkers().containsKey(id)){
            structure.popWorker(id);
        }

    }
}
