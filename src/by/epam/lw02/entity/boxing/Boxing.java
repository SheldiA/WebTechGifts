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
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(null == obj){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        Boxing boxing = (Boxing)obj;
        if(null == boxingColor){
            return boxingColor == boxing.boxingColor;
        }
        else{
            if(!boxingColor.equals(boxing.boxingColor)){
                return false;
            }
        }
        
        if(null == tapeColor){
            return tapeColor == boxing.tapeColor;
        }
        else{
            if(!tapeColor.equals(boxing.tapeColor)){
                return false;
            }
        }
        
        if(null == bowColor){
            return bowColor == boxing.bowColor;
        }
        else{
            if(!bowColor.equals(boxing.bowColor)){
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(((null == boxingColor) ? 0 : boxingColor.hashCode()) + ((null == tapeColor) ? 0 : tapeColor.hashCode()) + ((null == bowColor) ? 0 : bowColor.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "boxingColor: " + boxingColor + " tapeColor: " + tapeColor + " bowColor: " + bowColor;
    }
}
