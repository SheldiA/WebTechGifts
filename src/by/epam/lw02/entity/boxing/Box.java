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
}
