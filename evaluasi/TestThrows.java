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
import java.io.IOException;
public class TestThrows {
    void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){
       System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   TestThrows obj=new TestThrows();  
   obj.p();  
   System.out.println("normal flow...");  
  } 
}