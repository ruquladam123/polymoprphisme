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
public class run {
    public static void main (String [] kerocolatte){
        Line p = new Line(10,20,30,40);
        System.out.println(p.getLength());
        System.out.println(p.isGreater(p,p));
        System.out.println(p.isEqual(p, p));
        System.out.println(p.isLess(p,p));
    }
    
}
