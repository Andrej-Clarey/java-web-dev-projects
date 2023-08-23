package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Hash {
    public static void main(String[] args) {
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

        System.out.print("Enter a Student name (or Enter to finish): ");

        do{
            System.out.print("Student Name: ");
            studentName = input.nextLine();

            if (!studentName.equals("")){
                System.out.print("ID: ");
                Double newStudentId = input.nextDouble();
                students.put(newStudentId, studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Double, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//            sum += student.getValue();
        }

//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);

    }
}
