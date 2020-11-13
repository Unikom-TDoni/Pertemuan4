/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tokoemas;

/**
 *
 * @author ACER
 */
enum KursBulananEmas {
    NONE(0),
    OCTOBER(570000);
    
    final int currentKurs; 
    
    private KursBulananEmas(int currentKurs) {
        this.currentKurs = currentKurs;
    }
}
