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
public class testshape {
    public static void main (String [] args){
        shape s1 = new rectangle("red",4,5);
        System.out.println("================================");
        System.out.println("=" +s1 +"=");
        System.out.println("================================");
        System.out.println(">>Area is " + s1.getArea());
        
        shape s2 = new rectangle("blue",4,5);
        System.out.println("================================");
        System.out.println("=" + s2 +"=");
        System.out.println("================================");
        System.out.println(">>Area is " + s2.getArea());
    }

}
