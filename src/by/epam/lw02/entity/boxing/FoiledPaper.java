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
}
