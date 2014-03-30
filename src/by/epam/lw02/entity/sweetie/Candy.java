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
public class Candy extends Sweetie{
    private String candyTaste;
    public String getCandyTaste(){
        return candyTaste;
    }
    
    public Candy(int sweetieSize,String candyTaste){
        super(sweetieSize);
        this.candyTaste = candyTaste;
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
        
        Candy candy = (Candy)obj;
        if(!super.equals(candy)){
            return false;
        }
        if(null == candyTaste){
            return candyTaste == candy.candyTaste;
        }
        else{
            if(!candyTaste.equals(candy.candyTaste)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == candyTaste) ? 0 : candyTaste.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "candyTaste: " + candyTaste;
    }
}
