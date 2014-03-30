/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl;

import by.epam.lw02.bl.TO.BoxingTO.BoxingTO;
import by.epam.lw02.bl.TO.SweetieTO.SweetieTO;
import by.epam.lw02.entity.SweetGift;
import by.epam.lw02.entity.boxing.Boxing;
import by.epam.lw02.entity.sweetie.Sweetie;

/**
 *
 * @author Anna
 */
public class GiftBuilder {
    
    private SweetGift gift;
    public SweetGift getGift(){
        return  gift;
    }
    
    private GiftBuilder() {
    }
    
    public boolean createGift(BoxingTO boxingTO){
        Boxing boxing = BoxingFactory.getInstance().CreateBoxing(boxingTO);
        
        if(boxing != null){
            gift = new SweetGift(boxing);
            return true;
        }
        
        return false;
    }
    
    public boolean addSweetie(SweetieTO sweetieTO){
        Sweetie sweetie = SweetieFactory.getInstance().CreateSweetie(sweetieTO);
        return (sweetie != null) ? gift.addSweetie(sweetie) : false;
    }
    
    public static GiftBuilder getInstance() {
        return GiftBuilderHolder.INSTANCE;
    }
    
    private static class GiftBuilderHolder {

        private static final GiftBuilder INSTANCE = new GiftBuilder();
    }
}
