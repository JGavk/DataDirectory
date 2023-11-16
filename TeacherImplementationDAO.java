
import java.util.Map;
import java.util.Scanner;

public class TeacherImplementationDAO {
    private static Structure structure;

    public TeacherImplementationDAO() {
        this.structure = new Structure();
    }
//Todos los prints probablemente se eliminan de aqui cuando se migre al MVC en cada DAO
    public static void addTeacherFromUserInput(Scanner scanner) {
        System.out.print("Enter teacher ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter teacher name: ");
        String name = scanner.next();

        System.out.print("Enter teacher last name: ");
        String lastName = scanner.next();

        System.out.print("Enter teacher age: ");
        int age = scanner.nextInt();

        System.out.print("Enter teacher cellphone: ");
        long cellphone = scanner.nextLong();

        System.out.print("Enter teacher home address: ");
        String home = scanner.next();

        System.out.print("Enter teacher topic: ");
        String topic = scanner.next();
        Teacher teacher = new Teacher(id, name, lastName, age, cellphone, home, topic);

        // Pregunta si quiere añadir mas celulares
        while (true) {
            System.out.print("Do you want to add another cellphone? (yes/no): ");
            String addCellphoneOption = scanner.next().toLowerCase();
            if (addCellphoneOption.equals("yes")) {
                System.out.print("Enter another cellphone: ");
                Long anotherCellphone = scanner.nextLong();
                teacher.addCellphone(anotherCellphone);
                System.out.println(teacher.getCellphones());
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
                teacher.addHome(anotherHome);
                System.out.println(teacher.getHomes());
            } else {
                break;
            }
        }

        // Añade al profe a la estructura fg
        structure.addTeacher(id, teacher);

        System.out.println("Teacher added successfully!");

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
    //Deleteo
    public static void popOneTeacher(Scanner scanner){
        int id = scanner.nextInt();
        if (structure.getTeachers().containsKey(id)){
            structure.popTeacher(id);
        }

    }
    //Implementacion de impresion de todos los profesores
    public void printAllTeachers() {
        for (Map.Entry<Integer, Teacher> entry : structure.getTeachers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

