/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fulltimefinance;

/**
 *
 * @author jaima
 */

import javax.swing.JFrame;

public class FulltimeFinance {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Create an instance of your JFrame form
        Login loginForm = new Login();
        
        // Set the default close operation
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the form
        loginForm.setVisible(true);
    }
}
