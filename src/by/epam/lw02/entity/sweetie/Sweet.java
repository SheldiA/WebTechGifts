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
public class Sweet extends Sweetie{
    private String typeOfChocolate;
    public String getTypeOfChocolate(){
        return typeOfChocolate;
    }
    
    public Sweet(int sweetieSize,String typeOfChocolate){
        super(sweetieSize);
        this.typeOfChocolate = typeOfChocolate;
    }
}
