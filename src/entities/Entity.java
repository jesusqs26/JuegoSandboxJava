/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import client.Game;
import client.Handler;
import java.awt.Graphics;
import java.awt.Rectangle;


/**
 *
 * @author jesus
 */
public abstract class Entity {
    
    protected Handler handler;
    protected float x, y;
    protected Rectangle bounds;
    
    //se utilizaran para dibujar imagenes de diferentes tamaño en el video.
    protected int width, height;
    
    
    /**
     * Se utilizan variables flotantes para darle suavidad al dibujado
     * de imágenes en el frame de juego y sirven para delimitar sus valores
     * iniciales de render.
     * @param x
     * @param y 
     */
    public Entity(Handler handler,float x, float y, int width, int height){
        this.handler=handler;
       this.x=x;
       this.y=y;
       this.width=width;
       this.height=height;
       
       bounds = new Rectangle(0,0,width,height);
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
