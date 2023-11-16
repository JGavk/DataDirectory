package model;

import java.util.Map;
import java.util.Scanner;

public class StudentImplementationDAO {
    private static Structure structure;

    public StudentImplementationDAO(){
        this.structure = new Structure();
    }
//Todos los prints probablemente se eliminan de aqui cuando se migre al MVC en cada DAO
    public static void addStudentFromUserInput(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Student name: ");
        String name = scanner.next();

        System.out.print("Enter Student last name: ");
        String lastName = scanner.next();

        System.out.print("Enter Student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Student cellphone: ");
        long cellphone = scanner.nextLong();

        System.out.print("Enter Student home address: ");
        String home = scanner.next();

        System.out.print("Enter Student Class: ");
        String topic = scanner.next();
        Student student = new Student(id, name, lastName, age, cellphone, home, topic);

        // Pregunta si quiere añadir mas celulares
        while (true) {
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

        // Añade el estudiante a la estructura fg
        structure.addStudent(id, student);

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
    public void printAllStudents() {

        for (Map.Entry<Integer, Student> entry : structure.getStudents().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
