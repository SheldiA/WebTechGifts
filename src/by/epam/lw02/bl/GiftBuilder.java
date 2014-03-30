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
public class GiftBuilder {
    
    private GiftBuilder() {
    }
    
    public static GiftBuilder getInstance() {
        return GiftBuilderHolder.INSTANCE;
    }
    
    private static class GiftBuilderHolder {

        private static final GiftBuilder INSTANCE = new GiftBuilder();
    }
}
