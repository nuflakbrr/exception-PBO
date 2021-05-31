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
import java.util.Scanner;
public class ModulException {
    public static void main(String[] args) {

        int[] array = {0,1,2,3};
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Nilai Array ke = ");
        int index = userInput.nextInt();
        
        try{
            System.out.printf("Index ke %d, adalah %d\n", index, array[index]);
        }
        catch(Exception x){
            System.out.println("SALAH");
        }
        System.out.println("Akhir program ");
    }   
}