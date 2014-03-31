/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl;

import by.epam.lw02.controller.TO.SweetieTO.*;
import by.epam.lw02.constant.SweetieConstant;
import by.epam.lw02.entity.sweetie.*;

/**
 *
 * @author Anna
 */
public class SweetieFactory {
    
    private SweetieFactory() {
    }
    
    public Sweetie CreateSweetie(SweetieTO to){
        Sweetie result = null;
        
        switch(to.numberOfObject){
            case SweetieConstant.SWEET_NUMBER:
                if(to instanceof SweetTO){
                    result = new Sweet(to.sweetieSize, ((SweetTO)to).typeOfChocolate);
                }
                break;
            case SweetieConstant.CANDY_NUMBER:
                if(to instanceof CandyTO){
                    result = new Candy(to.sweetieSize, ((CandyTO)to).candyTaste);
                }
                break;
            case SweetieConstant.JELLY_SWEET_NUMBER:
                if(to instanceof JellySweetTO){
                    result = new JellySweet(to.sweetieSize, ((JellySweetTO)to).jellyTaste);
                }
                break;
            case SweetieConstant.SWEET_WITH_COOKIE_NUMBER:
                if(to instanceof SweetWithCookieTO){
                    result = new SweetWithCookie(to.sweetieSize, ((SweetWithCookieTO)to).typeOfChocolate,((SweetWithCookieTO)to).typeOfCookie);
                }
                break;
            case SweetieConstant.SWEET_WITH_WAFER_NUMBER:
                if(to instanceof SweetWithWaferTO){
                    result = new SweetWithWafer(to.sweetieSize, ((SweetWithWaferTO)to).typeOfChocolate, ((SweetWithWaferTO)to).typeOfWafer);
                }
                break;
        }
        
        return result;
    }
    
    public static SweetieFactory getInstance() {
        return SweetieFactoryHolder.INSTANCE;
    }
    
    private static class SweetieFactoryHolder {

        private static final SweetieFactory INSTANCE = new SweetieFactory();
    }
}
