package com.company;

import sun.applet.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel implements ActionListener{

    public static  final int WIDTH =640;
    public static final int HIGHT=480;
    public Image bg;

    Timer loop;
   Player player;


    public GamePanel(){
        loop = new Timer(10,this);
        loop.start();
        player= new Player(1,360);
        addKeyListener(new keyinput(player));
        setFocusable(true);

    }

    public void setBackground(java.awt.Graphics g) {
        bg = new ImageIcon("image/Background1.1.jpg").getImage();
        g.drawImage(bg, 0, 0, null);

    }


    @Override
    public void paint(Graphics g){
        super.paint(g);
        setBackground(g);
        Graphics2D g2d = (Graphics2D)g;
        player.draw(g2d);
    }


   @Override
    public void actionPerformed(ActionEvent e){
       player.update();
       repaint();

    }


}
