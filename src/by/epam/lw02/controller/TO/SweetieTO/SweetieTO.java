/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.controller.TO.SweetieTO;

import by.epam.lw02.controller.TO.TO;

/**
 *
 * @author Anna
 */
public class SweetieTO extends TO{
    public int sweetieSize;
    
    public SweetieTO(int numberOfObject,int sweetieSize){
        super(numberOfObject);
        this.sweetieSize = sweetieSize;
    }
}
