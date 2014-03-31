/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.controller.TO.BoxingTO;

import java.awt.Color;

/**
 *
 * @author Anna
 */
public class FoiledPaperTO extends BoxingTO{
    public String typeOfFoil;
    
    public FoiledPaperTO(int numberOfObject,Color boxingColor,Color tapeColor,Color bowColor,String typeOfFoil){
        super(numberOfObject,boxingColor, tapeColor, bowColor);
        this.typeOfFoil = typeOfFoil;
    }
}
