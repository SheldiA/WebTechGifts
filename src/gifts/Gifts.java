/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gifts;

import by.epam.lw02.controller.Controller;
import by.epam.lw02.entity.SweetGift;
import by.epam.lw02.entity.sweetie.Sweetie;
import by.epam.lw02.view.View;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class Gifts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        View v = new View(c);
        SweetGift gift = v.generateGift();
        System.out.println(gift.getBoxing().toString());
        Iterator<Sweetie> sw = gift.getSweeties();
        while(sw.hasNext()){
            System.out.println(sw.next().toString());
        }
    }
    
}
