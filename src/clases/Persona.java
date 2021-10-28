/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Mario Montero
 */
public class Persona {
    
    public Persona(){
        System.out.println("INICIALIZANDO PUBLIC PERSONA");
    }
    
    public void Saludar(){
        System.out.println("Hola, te hablo desde la clase persona");
    }
    
    private void Consignar(String dinero){
        System.out.println("voy a consignar al banco" + dinero + " " + "pesos");
    }
    
    
    public void GoToBank(String dinero){
            
        System.out.println("LLEGO AL BANCO");
        Consignar(dinero);
        
    }
    
}
