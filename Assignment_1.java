package Project;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        StudentManagement student = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        student.loadStudents();
        while (true) {
        	student.menu();
        	System.out.print("Choose option: ");
            switch (scanner.nextLine().trim()) {
                case "1": 
                	student.addStudent(scanner); 
                	break;
                case "2": 
                	student.searchStudent(scanner); 
                	break;
                case "3": 
                	student.deleteStudent(scanner); 
                	break;
                case "4": 
                	student.displayAllStudents(); 
                	break;
                case "5": 
                	student.saveStudents(); 
                	break;                
                case "0": 
                	System.out.println("Existing Application.Bye.....!");
                	return;
                default: System.out.println("Invalid option.");
                
            } System.out.println("\nPress Enter to Continue...... ");
            scanner.nextLine();
        }
    }
}
