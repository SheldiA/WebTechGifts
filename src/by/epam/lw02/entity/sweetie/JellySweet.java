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
}
