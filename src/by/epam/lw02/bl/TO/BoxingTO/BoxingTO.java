/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl.TO.BoxingTO;

import by.epam.lw02.bl.TO.TO;
import java.awt.Color;

/**
 *
 * @author Anna
 */
public class BoxingTO extends TO{
    public Color boxingColor;
    public Color tapeColor;
    public Color bowColor;
    
    public BoxingTO(int numberOfObject,Color boxingColor,Color tapeColor,Color bowColor){
        super(numberOfObject);
        this.boxingColor = boxingColor;
        this.tapeColor = tapeColor;
        this.bowColor = bowColor;
    }
}
