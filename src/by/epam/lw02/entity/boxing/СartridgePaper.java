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
}
