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
public class BoxingFactory {
    
    private BoxingFactory() {
    }
    
    public static BoxingFactory getInstance() {
        return BoxingFactoryHolder.INSTANCE;
    }
    
    private static class BoxingFactoryHolder {

        private static final BoxingFactory INSTANCE = new BoxingFactory();
    }
}
