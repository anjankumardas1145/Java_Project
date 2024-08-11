/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame() {
        super("Snake Game ");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);// this makes your code to absolute position
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}