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
class pembayarangaji {
    public int hitungaji (pegawai peg){
        int uang = peg.gaji();
        
        if (peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if (peg instanceof staf)
            uang += ((staf)peg).bonus();
        return uang;
    }
    public static void main(String [] kerocolatte){
        pembayarangaji pg = new pembayarangaji();
        staf mantanku=new staf();
        direktur adam = new direktur ();
        System.out.println("==================================================");
        System.out.println(">>GAJI YANG DIBERIKAN UNTUK MANTAN:" + pg.hitungaji(mantanku));
        System.out.println(">>GAJI YANG DIBERIKAN UNTUK SAYAA :" + pg.hitungaji(adam));
        System.out.println("===================================================");
        System.out.println("NOTE : MANTAN GAUSAH DIGAAJI KARENA CUMA BISA NYAKITIN!");
    }
}