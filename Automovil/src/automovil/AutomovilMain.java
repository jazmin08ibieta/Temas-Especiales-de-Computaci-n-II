/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;
 import automovil.Automovil;
/**
 *
 * @author ibiet
 */
public class AutomovilMain {
   
      public static void main(String[] args) {
        //prueba de herencia clase persona.
        
        Automovil automovil = new Automovil("Honda", 1033, 2023, 1000, "Automatica");
        
        System.out.println(automovil.toString());
        
      
    }
    
}
