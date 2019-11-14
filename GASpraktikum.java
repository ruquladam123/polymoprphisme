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
public class GASpraktikum extends rect {
    public static void main(String [] args){
        rect roco = new rect(1,1,4,4);
        rect roco2 = new rect (2,3,5,6);
        rect ppq = roco.union(roco2);
        rect ppq2 = roco.intersection(roco2);
        
        System.out.println("============================================================");
        System.out.println("(" + roco2.x1 + "'" + roco2.y1 +")is inside the union");
        System.out.println(roco + "union" + roco2 + "=" + ppq);
        System.out.println(roco + "intersection" + roco2 + "=" + ppq2);
        System.out.println("=============================================================");
    }
    
    
}
