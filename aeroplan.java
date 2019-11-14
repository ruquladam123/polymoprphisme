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
public class aeroplan extends vehicle {
    public void walk (){
        System.out.println("========================");
        System.out.println("== AEROPLAN IS MIBERR ==");
        System.out.println("========================");
    }
    public static void main (String [] args){
        aeroplan s = new aeroplan();
        s.walk();
        s.fuel();
        s.function();
        System.out.println("===================================");
                
    }
}
