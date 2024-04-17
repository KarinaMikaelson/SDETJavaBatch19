package org.example.class21;

import javax.swing.*;
import java.awt.*;

public abstract class MyDrawing {

    public static void main(String[] args) {
        JFrame j=new JFrame();
        MyCanvas myCanvas=new MyCanvas();
        j.setSize( 1000, 1000) ;
        //j.add(myCanvas);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    public void paint(Graphics graphics){

    };
}

class MyCanvas extends MyDrawing{
public void paint(Graphics g){
        for(int i =0; i < 500; i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            g.setColor(Color.cyan);
            g.fillOval(200,200,i,500);
            g.setColor(Color.GREEN);
            g.fillRect(400,400,i,300);
        }
    }}


