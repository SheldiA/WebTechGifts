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
public class Sweetie {
    private int sweetieSize;
    public int getSweetieSize(){
        return sweetieSize;
    }
    
    public Sweetie(int sweetieSize){
        this.sweetieSize = sweetieSize;
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
        
        Sweetie sweetie = (Sweetie)obj;
        if(sweetie.sweetieSize != sweetieSize){
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(sweetieSize*31);
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "sweetieSize: " + sweetieSize;
    }
}
