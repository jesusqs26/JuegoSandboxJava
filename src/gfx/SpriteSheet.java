
package gfx;

import java.awt.image.BufferedImage;

/**
 *
 * @author jesus
 */
public class SpriteSheet {
    
    private BufferedImage sheet;
    
    public SpriteSheet (BufferedImage sheet){
        this.sheet = sheet;
    }
    /**
     * Método que recorta una parte de la imagen para guardarla en un 
     * objeto del tipo bufferedImage.
     * @param x
     * @param y
     * @param height
     * @return 
     */
    public BufferedImage crop(int x, int y, int width,int height){
        
        
        return sheet.getSubimage(x, y, width,height) ;
        
    }
    
}
