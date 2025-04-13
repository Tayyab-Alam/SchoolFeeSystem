/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.*;
import service.PaymentService;

public class Main {
    public static void main(String[] args) {
        // 1. Create Users
        Admin admin = new Admin(1, "School Admin", "admin@school.com", "admin123");
        Parent parent = new Parent(2, "John Doe", "parent@email.com", "pass123", "Alice Doe");
        
        // 2. Test Login Functionality
        System.out.println("\n=== Testing Login ===");
        System.out.println("Admin login successful? " + admin.login("admin@school.com", "admin123")); // true
        System.out.println("Parent login successful? " + parent.login("parent@email.com", "wrongpass")); // false

        // 3. Create Fee Structure
        System.out.println("\n=== Admin Creating Fee Structure ===");
        FeeStructure termFee = new FeeStructure(101, "Term-wise", 1000.0, "2023-12-31");
        admin.addFeeStructure(termFee);

        // 4. Process Payments
        System.out.println("\n=== Processing Payments ===");
        PaymentService paymentService = new PaymentService();
        
        // Using Strategy Pattern for different payment methods
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();
        
        paymentService.processPayment(creditCard, 500.0); // Pays via credit card
        paymentService.processPayment(bankTransfer, 300.0); // Pays via bank transfer

        // 5. Parent Making Payment
        System.out.println("\n=== Parent Payment ===");
        Payment payment = new Payment(201, termFee.getAmount(), "CreditCard");
        parent.payFee(payment);

        // 6. View Payment History
        System.out.println("\n=== Viewing History ===");
        parent.viewPaymentHistory();
        admin.generateReport();
    }
}