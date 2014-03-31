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
public class СartridgePaper extends Boxing{
    private String typeOfPaper;
    public String getTypeOfPaper(){
        return typeOfPaper;
    }
    
    public СartridgePaper(Color boxingColor,Color tapeColor,Color bowColor,String typeOfPaper){
        super(boxingColor,tapeColor,bowColor);
        this.typeOfPaper = typeOfPaper;
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
        
        СartridgePaper cartridgePaper = (СartridgePaper)obj;
        if(!super.equals(cartridgePaper)){
            return false;
        }
        if(null == typeOfPaper){
            return typeOfPaper == cartridgePaper.typeOfPaper;
        }
        else{
            if(!typeOfPaper.equals(cartridgePaper.typeOfPaper)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == typeOfPaper) ? 0 : typeOfPaper.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "typeOfPaper: " + typeOfPaper + " " + super.toString();
    }
}
