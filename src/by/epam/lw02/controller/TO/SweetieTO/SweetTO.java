/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.controller.TO.SweetieTO;

/**
 *
 * @author Anna
 */
public class SweetTO extends SweetieTO{
    public String typeOfChocolate;
    
    public SweetTO(int numberOfObject,int sweetieSize,String typeOfChocolate){
        super(numberOfObject, sweetieSize);
        this.typeOfChocolate = typeOfChocolate;
    }
}
