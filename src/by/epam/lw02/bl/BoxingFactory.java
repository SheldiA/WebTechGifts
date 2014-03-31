/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.lw02.bl;

import by.epam.lw02.controller.TO.BoxingTO.*;
import by.epam.lw02.constant.BoxingConstant;
import by.epam.lw02.entity.boxing.*;

/**
 *
 * @author Anna
 */
public class BoxingFactory {
    
    private BoxingFactory() {
    }
    
    public Boxing CreateBoxing(BoxingTO to){
        Boxing result = null;
        switch(to.numberOfObject){
            case BoxingConstant.BOX_NUMBER:
                if(to instanceof BoxTO){
                    result = new Box(to.boxingColor,to.tapeColor,to.bowColor,((BoxTO)to).boxShape);
                }
                break;
            case BoxingConstant.FOILED_PAPER_NUMBER:
                if(to instanceof FoiledPaperTO){
                    result = new FoiledPaper(to.boxingColor,to.tapeColor,to.bowColor,((FoiledPaperTO)to).typeOfFoil);
                }
                break;
            case BoxingConstant.CARTRIDGE_PAPER_NUMBER:
                if(to instanceof СartridgePaperTO){
                    result = new СartridgePaper(to.boxingColor,to.tapeColor,to.bowColor,((СartridgePaperTO)to).typeOfPaper);
                }
                break;
        }
        
        return result;
    }
    
    public static BoxingFactory getInstance() {
        return BoxingFactoryHolder.INSTANCE;
    }
    
    private static class BoxingFactoryHolder {

        private static final BoxingFactory INSTANCE = new BoxingFactory();
    }
}
