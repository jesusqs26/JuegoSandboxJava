/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import display.Display;
import gfx.Assets;
import gfx.GameCamera;
import gfx.SpriteSheet;
import gfx.imageLoader;
import input.KeyManager;
import states.GameState;
import states.MenuState;
import states.State;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import worlds.World;

/**
 * Clase que inicia el juego con hilos
 * @author jesus
 */
public class Game implements Runnable {

    private Display display;

    //entrada
    private KeyManager keyManager;

    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    public String worldpath;
    private BufferStrategy bs;
    private Graphics g;

    //Estados
    private State gameState;
    private State menuState;
//    //Prueba de imagenes
//    private BufferedImage test;
//    private SpriteSheet sheet;

    //Camara
    private GameCamera gameCamera;

    //Handler
    private Handler handler;

    public Game(String title, int width, int heigh, String worldpath) {
        this.width = width;
        this.height = heigh;
        this.title = title;
        this.worldpath = worldpath;
        keyManager = new KeyManager();

    }
    
    private void init() throws IOException {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();
        handler = new Handler(this);
        handler.setWorld(new World(handler, worldpath));
        gameCamera = new GameCamera(handler, 0, 0);

        gameState = new GameState(handler);
        menuState = new MenuState(handler);
        State.setState(gameState);
    }


    private void tick() {
        keyManager.tick();
        if (State.getState() != null) {
            State.getState().tick();
        }

    }

    private void render() {
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //clear Screen
        g.clearRect(0, 0, width, height);
        //Dibuja aqui

        if (State.getState() != null) {
            State.getState().render(g);
        }

//        g.drawImage(sheet.crop(0, 0, 90, 90), 5, 5, null);
//        g.setColor(Color.red);
//        g.fillRect(10,50, 50, 70);
//        g.setColor(Color.green);
//        g.fillRect(0, 0, 10, 10);
        //Termina de dibujar.
        bs.show();
        g.dispose();

    }

    public void run() {
        try {

            init();
            /**
             * Se utiliza la variable fps para establecer una tasa estable de
             * imagenes a refrescar, de esta manera se iguala la velocidad de
             * tasa de imagenes que el computador genera independientemente si
             * es rápida o lenta.
             */
            int fps = 60;
            double timePerTick = 1000000000 / fps;
            double delta = 0;
            long now;
            long lastTime = System.nanoTime();
            long timer = 0;
            int ticks = 0;

            while (running) {
                now = System.nanoTime();
                delta += (now - lastTime) / timePerTick;
                timer += now - lastTime;
                lastTime = now;
                if (delta >= 1) {

                    tick();
                    render();
                    ticks++;
                    delta--;
                }
                if (timer >= 1000000000) {
                    System.out.println("Ticks: " + ticks);
                    ticks = 0;
                    timer = 0;
                }

            }

            stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start() {
        if (running) {
            return;
        }

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() throws InterruptedException {
        if (!running) {
            return;
        }

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
