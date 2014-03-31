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
public class JellySweet extends Sweetie {
    private String jellyTaste;
    public String getJellyTaste(){
        return  jellyTaste;
    }
    
    public JellySweet(int sweetieSize, String jellyTaste){
        super(sweetieSize);
        this.jellyTaste = jellyTaste;
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
        
        JellySweet jellySweet = (JellySweet)obj;
        if(!super.equals(jellySweet)){
            return false;
        }
        if(null == jellyTaste){
            return jellyTaste == jellySweet.jellyTaste;
        }
        else{
            if(!jellyTaste.equals(jellySweet.jellyTaste)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        return (int)(super.hashCode() + ((null == jellyTaste) ? 0 : jellyTaste.hashCode()));
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "@" + "jellyTaste: " + jellyTaste + " " + super.toString();
    }
}
