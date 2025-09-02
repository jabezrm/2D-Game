package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D GAME");
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        GamePanel Panel = new GamePanel();

        window.add(Panel);
        window.pack();

        Panel.setUpGame();
        Panel.startGameThread();
        Panel.requestFocusInWindow();

    }
}