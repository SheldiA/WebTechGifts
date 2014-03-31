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
        
        SweetWithWafer sweetWithWafer = (SweetWithWafer)obj;
        if(!super.equals(sweetWithWafer)){
            return false;
        }
        if(null == typeOfWafer){
            return typeOfWafer == sweetWithWafer.typeOfWafer;
        }
        else{
            if(!typeOfWafer.equals(sweetWithWafer.typeOfWafer)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == typeOfWafer) ? 0 : typeOfWafer.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "typeOfWafer: " + typeOfWafer + " " + super.toString();
    }
}
