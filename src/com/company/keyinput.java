package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by com on 8/11/2559.
 */
public class keyinput extends KeyAdapter{
    Player p;

    public keyinput(Player p){
        this.p = p;
    }


    @Override
    public void keyPressed(KeyEvent e){

        p.KeyPressed(e);

    }

    @Override
    public void keyReleased(KeyEvent e){

        p.KeyReleased(e);

    }


}
