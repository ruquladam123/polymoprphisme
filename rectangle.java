/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorpishm;

/**
 *
 * @author DKID
 */
public class rectangle extends shape {
    private int length;
    private int width;
    
    public rectangle(String color , int length ,int width) {
        super(color);
        this.length = length;
        this.width = width;
        
    }
    @Override
    public String toString(){
        return "Rectangle[length=" + length + ",width" + width + "," + super.toString()+ "]";
    }
    @Override
    public double getArea(){
        return length* width;
    }
    
}
