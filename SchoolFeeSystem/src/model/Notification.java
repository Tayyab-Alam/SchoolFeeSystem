/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Notification {
    private String message;

    public void sendSMS(String phoneNumber) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }

    public void sendEmail(String email) {
        System.out.println("Email to " + email + ": " + message);
    }
}
