/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.view;

import by.epam.lw02.constant.BoxingConstant;
import by.epam.lw02.constant.SweetieConstant;
import by.epam.lw02.controller.Controller;
import by.epam.lw02.controller.TO.BoxingTO.*;
import by.epam.lw02.controller.TO.SweetieTO.*;
import by.epam.lw02.entity.SweetGift;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class View {
    private Controller c;
    public View(Controller c){
        this.c = c;
    }
    
    private BoxingTO generateBoxing(){
        return new FoiledPaperTO(BoxingConstant.FOILED_PAPER_NUMBER, Color.GREEN, Color.yellow, Color.yellow, "bright");
    }
    
    private Iterator<SweetieTO> generateSweeties(){
        ArrayList<SweetieTO> sweetiesTO = new ArrayList<SweetieTO>();
        sweetiesTO.add(new SweetTO(SweetieConstant.SWEET_NUMBER, 5,"bitter"));
        sweetiesTO.add(new SweetWithCookieTO(SweetieConstant.SWEET_WITH_COOKIE_NUMBER, 3, "milk", "biscuit"));
        return sweetiesTO.iterator();
    }
    
    public SweetGift generateGift(){
        return c.getGift(generateBoxing(), generateSweeties());
    }
            
}
