/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Parent extends User {
    private String studentName;

    public Parent(int id, String name, String email, String password, String studentName) {
        super(id, name, email, password);
        this.studentName = studentName;
    }

    // Updated method: Now accepts 'Payment' object
    public void payFee(Payment payment) {
        System.out.println(
            "Payment of " + payment.getAmount() + 
            " processed for student: " + studentName + 
            " via " + payment.getPaymentMethod()
        );
    }

    public void viewPaymentHistory() {
        System.out.println("Fetching payment history...");
    }
}
