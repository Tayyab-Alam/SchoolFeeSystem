/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Payment {
    private int id;
    private double amount;
    private String paymentMethod; // "CreditCard" or "BankTransfer"

    // Constructor
    public Payment(int id, double amount, String paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    // Getters
    public double getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod; }
}
