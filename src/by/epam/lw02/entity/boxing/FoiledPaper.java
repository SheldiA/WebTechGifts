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
public class FoiledPaper extends Boxing{
    private String typeOfFoil;
    public String getTypeOfFoil(){
        return typeOfFoil;
    }
    
    public FoiledPaper(Color boxingColor,Color tapeColor,Color bowColor,String typeOfFoil){
        super(boxingColor, tapeColor, bowColor);
        this.typeOfFoil = typeOfFoil;
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
        
        FoiledPaper foiledPaper = (FoiledPaper)obj;
        if(!super.equals(foiledPaper)){
            return false;
        }
        if(null == typeOfFoil){
            return typeOfFoil == foiledPaper.typeOfFoil;
        }
        else{
            if(!typeOfFoil.equals(foiledPaper.typeOfFoil)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == typeOfFoil) ? 0 : typeOfFoil.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "typeOfFoil: " + typeOfFoil + " " + super.toString();
    }
}
