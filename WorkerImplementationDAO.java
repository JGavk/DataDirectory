package model;


import java.util.Map;
import java.util.Scanner;

public class WorkerImplementationDAO {
    private static Structure structure;

    public WorkerImplementationDAO(){
        this.structure = new Structure();
    }
    //Todos los prints probablemente se eliminan de aqui cuando se migre al MVC en cada DAO
    public static void addWorkerFromUserInput(Scanner scanner) {
        System.out.print("Enter Worker ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Worker name: ");
        String name = scanner.next();

        System.out.print("Enter Worker last name: ");
        String lastName = scanner.next();

        System.out.print("Enter Worker age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Worker cellphone: ");
        long cellphone = scanner.nextLong();

        System.out.print("Enter Worker home address: ");
        String home = scanner.next();

        System.out.print("Enter Job: ");
        String topic = scanner.next();
        Worker worker = new Worker(id, name, lastName, age, cellphone, home, topic);

        // Pregunta si quiere añadir mas celulares
        while (true) {
            System.out.print("Do you want to add another cellphone? (yes/no): ");
            String addCellphoneOption = scanner.next().toLowerCase();
            if (addCellphoneOption.equals("yes")) {
                System.out.print("Enter another cellphone: ");
                Long anotherCellphone = scanner.nextLong();
                worker.addCellphone(anotherCellphone);
                System.out.println(worker.getCellphones());
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
                worker.addHome(anotherHome);
                System.out.println(worker.getHomes());
            } else {
                break;
            }
        }

        // Añade el estudiante a la estructura fg
        structure.addWorker(id, worker);

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
    public void printAllWorkers() {
        //Este sout es para probar
        for (Map.Entry<Integer, Worker> entry : structure.getWorkers().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
