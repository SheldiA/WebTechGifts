/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl.TO.SweetieTO;

/**
 *
 * @author Anna
 */
public class SweetWithWaferTO extends SweetTO{
    public String typeOfWafer;
    
    public SweetWithWaferTO(int numberOfObject,int sweetieSize,String typeOfChocolate,String typeOfWafer){
        super(numberOfObject, sweetieSize, typeOfChocolate);
        this.typeOfWafer = typeOfWafer;
    }
}
