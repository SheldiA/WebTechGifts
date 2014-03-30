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
}
