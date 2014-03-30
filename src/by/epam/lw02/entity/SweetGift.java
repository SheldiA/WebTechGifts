/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.entity;

import by.epam.lw02.entity.boxing.Boxing;
import by.epam.lw02.entity.sweetie.Sweetie;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class SweetGift {
    private Boxing boxing;
    public Boxing getBoxing(){
        return boxing;
    }
    
    private ArrayList<Sweetie> sweeties;
    public Iterator<Sweetie> getSweeties(){
        return sweeties.iterator();
    }
    
    public SweetGift(Boxing boxing)
    {
        this.boxing = boxing;
        sweeties = new ArrayList<Sweetie>();
    }
    
    public SweetGift(Boxing boxing,ArrayList<Sweetie> sweeties){
        this.boxing = boxing;
        this.sweeties = sweeties;
    }
    
    public boolean addSweetie(Sweetie sweetie){
        return sweeties.add(sweetie);
    }
}
