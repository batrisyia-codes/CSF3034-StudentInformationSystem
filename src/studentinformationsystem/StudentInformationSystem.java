/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author USER
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Student Name: Nur Auni Batrisyia Binti Mohamad Nizam (UMT)");
        System.out.println("Student ID: S84857");
        int mark1 = 85;
        int mark2 = 90;
        int total = mark1 + mark2;
        System.out.println("Total Marks:" + total);
        // Calculate and display student result
        
        if (total >= 160) {
            System.out.println("Excellent!");
        } else if (total >= 100) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement!");
        }
    }
    
}
