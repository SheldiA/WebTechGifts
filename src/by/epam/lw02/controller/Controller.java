/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.controller;

import by.epam.lw02.bl.GiftBuilder;
import by.epam.lw02.controller.TO.BoxingTO.BoxingTO;
import by.epam.lw02.controller.TO.SweetieTO.SweetieTO;
import by.epam.lw02.entity.SweetGift;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class Controller {
    public SweetGift getGift(BoxingTO boxing,Iterator<SweetieTO> sweetiesTO){
        
        if(GiftBuilder.getInstance().createGift(boxing)){
            while(sweetiesTO.hasNext()){
                GiftBuilder.getInstance().addSweetie(sweetiesTO.next());
            }
        }
        
        return GiftBuilder.getInstance().getGift();
    }
}
