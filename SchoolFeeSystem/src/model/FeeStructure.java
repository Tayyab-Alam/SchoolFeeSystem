/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class FeeStructure {
    private int id;
    private String type; // "Monthly" or "Term-wise"
    private double amount;
    private String dueDate;

    // Constructor, Getters & Setters
    public FeeStructure(int id, String type, double amount, String dueDate) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}
