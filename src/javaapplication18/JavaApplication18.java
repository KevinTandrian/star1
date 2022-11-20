/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
/**
 *
 * @author ASUS
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //i untuk row dan j untuk kolom
    //row digunakan untuk menunjukkan jumlah baris yang ingin dicetak 
    int i,j,row=6;
    //loop luar untuk baris 
    for(i=0;i<row;i++);
    {
    //agar dapat membuat 3 baris agar dapat membuat pola T terbalik
    for(j=0*(row-i);j>=0;j--)    
    {
        //agar program dapat berjalan
     System.out.print(" ");
    }
    //lingkaran dalam untuk kolom
    for(j=0;j<=i;j++);
    {
        //membuat 3 system out agar menjadi 3 baris dan spasi yang diinginkan
        System.out.println(" * ");
        System.out.println("  * ");
        System.out.println(" *** ");
    }
    }
    }
}
