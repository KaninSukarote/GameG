package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Player {
    private int x;
    private int y; //เก็บตำแหน่ง
    private int speedx = 0; //กำหนดความเร็วในแนวแกน
    private int speedy = 0;
    private boolean isGround = false;



    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //methodจัดการการเคลื่อนที่ของผู้เล่น
    public void update() {
        x += speedx;
        y += speedy; //เพิ่มค่าในแกนเอ็กวาย
        //ตรวจเช็คการชนขอบ ออกจากขอบของจอมั้ย
        if (x <= 0) { //ติดขอบ
            x = 0;
        }
        if (y <= 0) {
            y = 0;
        }
        if (y > 360) {
            y = 360;
            isGround = true;
        }
        if (x > 600) {
            x = 600;
        }

    }

    //วาดตัวละครผู้เล่น
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.black); //ใส่สีให้กล่อง
        g2d.fillOval(x, y, 40, 40);//วาดกล่องที่ตำแหน่งเอ็กวายขนาด32*32

    }


    //กดปุ่มค้าง
    public void KeyPressed(KeyEvent k) {
        int key = k.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            speedx = 5; //เคลื่อนที่เแนวแกนเอ็กซ์เพิ่มไปทีละ5
        }
        if (key == KeyEvent.VK_LEFT) {
            speedx = -5; //วิ่งย้อนกลับ5
        }

        if (key == KeyEvent.VK_SPACE && isGround) {
            speedy = -10;//แนวแกนวาย
            speedx = 5;
            isGround = false;

        }
        if (key == KeyEvent.VK_DOWN) {
            speedy = 5;
        }

    }

    //ปล่อยปุ่ม
    public void KeyReleased(KeyEvent k) {
        int key = k.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            speedx = 0; //หยุดเคลื่อนที่

        }
        if (key == KeyEvent.VK_LEFT) {
            speedx = -0;
            speedy = -0;
        }
        if (key == KeyEvent.VK_SPACE ) {
            speedy = 5;
            speedx = 0;


        }
        if (key == KeyEvent.VK_DOWN) {
            speedy = 0;
        }
    }

}
