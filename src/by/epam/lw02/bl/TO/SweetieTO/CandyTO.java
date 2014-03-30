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
public class CandyTO extends SweetieTO{
    public String candyTaste;
    
    public CandyTO(int numberOfObject,int sweetieSize,String candyTaste){
        super(numberOfObject, sweetieSize);
        this.candyTaste = candyTaste;
    }
}
