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
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(null == obj){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        Sweet sweet = (Sweet)obj;
        if(!super.equals(sweet)){
            return false;
        }
        if(null == typeOfChocolate){
            return typeOfChocolate == sweet.typeOfChocolate;
        }
        else{
            if(!typeOfChocolate.equals(sweet.typeOfChocolate)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == typeOfChocolate) ? 0 : typeOfChocolate.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "typeOfChocolate: " + typeOfChocolate;
    }
}
