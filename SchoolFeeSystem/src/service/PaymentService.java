/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.PaymentMethod;

public class PaymentService {
    // DRY: Reusable payment processor
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
