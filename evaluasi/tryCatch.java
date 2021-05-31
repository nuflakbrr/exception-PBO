/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluasi;

/**
 *
 * @author ASUS
 */
public class tryCatch {
    public static void main(String[] args) {
        int a = 35;
        int b = 5;
        try {
            int x = a / b;
            System.out.println("Hasil: " + x);
            int[] angka = {1, 2, 3, 4, 5};
            angka[4] = 5;
        }catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Terjadi kesalahan pada inputan Arraynya");
            System.out.println(ai);
        }
        //blok jika terjadi kesalahan pada ArithmeticException
         catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e);
        }
        System.out.println("Selesai");
    }
}