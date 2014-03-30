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
        
        SweetWithCookie sweetWithCookie = (SweetWithCookie)obj;
        if(!super.equals(sweetWithCookie)){
            return false;
        }
        if(null == typeOfCookie){
            return typeOfCookie == sweetWithCookie.typeOfCookie;
        }
        else{
            if(!typeOfCookie.equals(sweetWithCookie.typeOfCookie)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == typeOfCookie) ? 0 : typeOfCookie.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "typeOfCookie: " + typeOfCookie;
    }
    
}
