/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Admin extends User {
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    // Admin-specific methods
    public void addFeeStructure(FeeStructure fee) {
        System.out.println("Fee structure added: " + fee.getType());
    }

    public void generateReport() {
        System.out.println("Report generated!");
    }
}
