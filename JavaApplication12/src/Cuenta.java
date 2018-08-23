/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    public int numero;
    public String Propietario;
    public double saldo;
    
    public String getPropietario(){
       return null;
    }
    
    public void setPropietario(String _propietario){
        
    }
    public void consignar(double valor){
        saldo = saldo+valor;
    }
    
    
}
