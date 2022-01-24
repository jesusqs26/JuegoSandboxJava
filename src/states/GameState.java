/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import client.Game;
import client.Handler;
import entities.Player;
import gfx.Assets;
import tiles.Tile;
import worlds.World;
import java.awt.Graphics;

/**
 *
 * @author jesus
 */
public class GameState extends State {
    
    private Player player;
    private World world;
    
    public GameState(Handler handler) {
        super(handler);
        
        world= new World(handler, "res/worlds/world1.txt");
        handler.setWorld(world);
        player = new Player(handler,100, 100);
        
    }

    /**
     * Aqui
     */
    @Override
    public void tick() {
        player.tick();
        world.tick();
        handler.getGameCamera().move(1, 1);
    }
    
    @Override
    public void render(Graphics g) {
            world.render(g);
            player.render(g);
//            Tile.tiles[0].render(g,0 ,0);
        
        //Dibuja un poco de "tierra" solo para pruebas
//        g.drawImage(Assets.dirt, 0, 0, null);
    }
    
}
