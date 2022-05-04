/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author vaso
 */
public class Square {
    private int pleyra;

    public int getPleyra() {
        return pleyra;
    }

    public void setPleyra(int pleyra) {
        this.pleyra = pleyra;
    }
    
    public int getArea(){
        int area = pleyra * pleyra;
        return area;}
    
}
