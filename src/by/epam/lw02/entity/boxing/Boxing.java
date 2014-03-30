/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.entity.boxing;

import java.awt.Color;

/**
 *
 * @author Anna
 */
public class Boxing {
    private Color boxingColor;
    private Color tapeColor;
    private Color bowColor; 
    
    public Color getBoxingColor(){
        return boxingColor;
    }
    
    public Color getTapeColor(){
        return tapeColor;
    }
    
    public Color getBowColor(){
        return bowColor;
    }
    
    public Boxing(Color boxingColor,Color tapeColor,Color bowColor){
        this.boxingColor = boxingColor;
        this.tapeColor = tapeColor;
        this.bowColor = bowColor;
    }
}
