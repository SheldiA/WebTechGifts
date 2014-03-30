/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl;

/**
 *
 * @author Anna
 */
public class SweetieFactory {
    
    private SweetieFactory() {
    }
    
    public static SweetieFactory getInstance() {
        return SweetieFactoryHolder.INSTANCE;
    }
    
    private static class SweetieFactoryHolder {

        private static final SweetieFactory INSTANCE = new SweetieFactory();
    }
}
