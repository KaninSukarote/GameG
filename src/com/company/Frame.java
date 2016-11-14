package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 13/11/2559.
 */
public class Frame extends JFrame{


    public static String name = "Game";


    public Frame() {
        setTitle(name);
        setSize(GamePanel.WIDTH,GamePanel.HIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        innit();
    }

    public void innit() {
        setLayout(new GridLayout(1, 1, 0, 0));
        GamePanel screen = new GamePanel();
        add(screen);
        setVisible(true);

    }



}
