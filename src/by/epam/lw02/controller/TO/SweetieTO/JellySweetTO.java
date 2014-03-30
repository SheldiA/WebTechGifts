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
public class JellySweetTO extends SweetieTO{
    public String jellyTaste;
    
    public JellySweetTO(int numberOfObject,int sweetieSize,String jellyTaste){
        super(numberOfObject, sweetieSize);
        this.jellyTaste = jellyTaste;
    }
}
