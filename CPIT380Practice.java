/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImageEditor;

//import java.awt.*;

import java.awt.Color;

//import java.awt.font.*;
//import java.awt.geom.*;
//import java.text.*;
/**
 *
 * @author Saim
 */
public class CPIT380Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is CPIT380 Practice Session");
        String fileName = FileChooser.pickAFile();
        System.out.println(fileName);
         
        Picture picObject = new Picture(fileName);
        picObject.show();
        int width = picObject.getWidth();
        System.out.print("Width of Picture = ");
        System.out.println(width);
        int height = picObject.getHeight();
        System.out.print("Height of Picture = ");
        System.out.println(height);
        System.out.print("Total number of Pixels in the Picture = ");
        System.out.println(width * height);
        
        Pixel[] pixelArray = picObject.getPixels();
        
        // Change the color of image by using color object.
        for (int i =0; i<=255; i++){
        Color colorObj = new Color( i ,0,0);
        
            for (Pixel pixelObj: pixelArray)
            {
                pixelObj.setColor(colorObj);

            }
            
            picObject.repaint();
            picObject.show();
            
        }
        System.out.print("Done");
        
        picObject.decreaseRed();
        picObject.repaint();
        picObject.show();
        
        /*for (int i = 0; i<=255 ; i++)
        {       
        
        // Use the method decreaseRed()...Green...Blue...
        picObject.decreaseRed();
        picObject.repaint();
        picObject.show();
       
        }
      
        picObject.rotateLeft();
        picObject.repaint();
        picObject.show();*/
    }
    
}
