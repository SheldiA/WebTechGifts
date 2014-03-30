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
public class Box extends Boxing{
    private String boxShape;
    public String getShape(){
        return boxShape;
    }
    
    public Box(Color boxingColor,Color tapeColor,Color bowColor,String boxShape){
        super(boxingColor,tapeColor,bowColor);
        this.boxShape = boxShape;
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
        
        Box box = (Box)obj;
        if(!super.equals(box)){
            return false;
        }
        if(null == boxShape){
            return boxShape == box.boxShape;
        }
        else{
            if(!boxShape.equals(box.boxShape)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == boxShape) ? 0 : boxShape.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "boxShape: " + boxShape;
    }
}
