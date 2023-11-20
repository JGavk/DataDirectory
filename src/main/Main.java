package main;

import model.*;
import visual.VisualRate;


public class Main {
    public static void main(String[] args) {
        new VisualRate(new ImplementationDAO());






        /* TeacherImplementationDAO dao = new TeacherImplementationDAO();
        StudentImplementationDAO dao1 = new StudentImplementationDAO();
        WorkerImplementationDAO dao2 = new WorkerImplementationDAO();
        Scanner scanner = new Scanner(System.in);

        int option;
        while (true) {
            System.out.println("1. Add teacher\n" +"2. Update teacher\n"
                    +"3. Print all Teachers\n"+"4. Delete a Teacher\n"+"5. Add Student\n"
                    +"6. Update Student\n"+"7. Delete a Student\n"
                    +"8. Print all Students\n"+"9. Add a Worker\n"
                    +"10. Update a Worker\n"+"11. Delete a Worker\n"
                    +"12. Print all Workers\n"+ "13. Exit\n");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
//Esto hay que mudarlo al controlador con la respectiva forma de visual para mostrarlo BOTONES con campos de texto para el scanner
            //Estos metodos se llaman desde el controlador, para cada DAO
            if (option == 1) {
                dao.addTeacherFromUserInput(scanner);
                dao.printAllTeachers();
            } else if (option == 2) {
                dao.updateTeacherFromUserInput(scanner);
                //dao.printAllTeachers();
            } else if (option == 3) {
                dao.printAllTeachers();

            } else if (option==4){
                dao.popOneTeacher(scanner);
            } else if (option==5){
                dao1.addStudentFromUserInput(scanner);
                dao1.printAllStudents();

            } else if (option==6){
                dao1.updateStudentFromUserInput(scanner);
                dao1.printAllStudents();

            } else if (option==7){
                dao1.popOneStudent(scanner);
                dao1.printAllStudents();

            } else if (option==8){

                dao1.printAllStudents();

            } else if (option==9){
                dao2.addWorkerFromUserInput(scanner);
                dao2.printAllWorkers();
            } else if (option==10){
                dao2.updateWorkerFromUserInput(scanner);
                dao2.printAllWorkers();
            } else if (option==11){
                dao2.popOneWorker(scanner);
                dao2.printAllWorkers();

            } else if (option==12){
                dao2.printAllWorkers();
            } else if (option == 13) {
                System.out.println("Exiting the program.");
                dao.printAllTeachers();

                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

         */
    }

}
