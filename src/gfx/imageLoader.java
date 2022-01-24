/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author jesus
 */
public class imageLoader {
    
    
    public static BufferedImage loadImage(String path) throws IOException{
        try{
            
         return ImageIO.read(imageLoader.class.getResource(path));
         
         
        }catch( IOException e){
            e.printStackTrace();
            System.exit(1);
        }return null;
    }
   
    
}
