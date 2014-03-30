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
public class SweetWithCookieTO extends SweetTO{
    public String typeOfCookie;
    
    public SweetWithCookieTO(int numberOfObject,int sweetieSize,String typeOfChocolate,String typeOfCookie){
        super(numberOfObject, sweetieSize, typeOfChocolate);
        this.typeOfCookie = typeOfCookie;
    }
}
