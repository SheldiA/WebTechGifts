/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl.TO.BoxingTO;

import java.awt.Color;

/**
 *
 * @author Anna
 */
public class BoxTO extends BoxingTO{
    public String boxShape;
    
    public BoxTO(int numberOfObject,Color boxingColor,Color tapeColor,Color bowColor,String boxShape){
        super(numberOfObject,boxingColor, tapeColor, bowColor);
        this.boxShape = boxShape;
    }
}
