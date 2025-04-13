/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Receipt {
    private int id;
    private String content;

    public Receipt(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public void generate() {
        System.out.println("Receipt #" + id + ": " + content);
    }
}
