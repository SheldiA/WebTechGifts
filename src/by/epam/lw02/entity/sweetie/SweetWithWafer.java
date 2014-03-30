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
public class SweetWithWafer extends Sweet{
    private String typeOfWafer;
    public String getTypeOfWafer(){
        return typeOfWafer;
    }
    
    public SweetWithWafer(int sweetieSize,String typeOfChocolate,String typeOfWafer){
        super(sweetieSize, typeOfChocolate);
        this.typeOfWafer = typeOfWafer;
    }
}
