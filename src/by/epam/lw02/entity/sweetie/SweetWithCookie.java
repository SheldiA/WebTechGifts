/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.entity.sweetie;

/**
 *
 * @author Anna
 */
public class SweetWithCookie extends Sweet{
    private String typeOfCookie;
    public String getTypeOfCookie(){
        return typeOfCookie;
    }
    
    public SweetWithCookie(int sweetieSize,String typeOfChocolate,String typeOfCookie){
        super(sweetieSize, typeOfChocolate);
        this.typeOfCookie = typeOfCookie;
    }
    
}
